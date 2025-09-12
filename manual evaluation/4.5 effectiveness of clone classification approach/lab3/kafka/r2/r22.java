kafka-trunk/clients/src/main/java/org/apache/kafka/clients/producer/internals/ProducerBatch.java

    public FutureRecordMetadata tryAppend(long timestamp, byte[] key, byte[] value, Header[] headers, Callback callback, long now) {
        if (!recordsBuilder.hasRoomFor(timestamp, key, value, headers)) {
            return null;
        } else {
            this.recordsBuilder.append(timestamp, key, value, headers);
            this.maxRecordSize = Math.max(this.maxRecordSize, AbstractRecords.estimateSizeInBytesUpperBound(magic(),
                    recordsBuilder.compression().type(), key, value, headers));
            this.lastAppendTime = now;
            FutureRecordMetadata future = new FutureRecordMetadata(this.produceFuture, this.recordCount,
                                                                   timestamp,
                                                                   key == null ? -1 : key.length,
                                                                   value == null ? -1 : value.length,
                                                                   Time.SYSTEM);
            // we have to keep every future returned to the users in case the batch needs to be
            // split to several new batches and resent.
            thunks.add(new Thunk(callback, future));
            this.recordCount++;
            return future;
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/producer/internals/ProducerBatch.java
    private boolean tryAppendForSplit(long timestamp, ByteBuffer key, ByteBuffer value, Header[] headers, Thunk thunk) {
        if (!recordsBuilder.hasRoomFor(timestamp, key, value, headers)) {
            return false;
        } else {
            // No need to get the CRC.
            this.recordsBuilder.append(timestamp, key, value, headers);
            this.maxRecordSize = Math.max(this.maxRecordSize, AbstractRecords.estimateSizeInBytesUpperBound(magic(),
                    recordsBuilder.compression().type(), key, value, headers));
            FutureRecordMetadata future = new FutureRecordMetadata(this.produceFuture, this.recordCount,
                                                                   timestamp,
                                                                   key == null ? -1 : key.remaining(),
                                                                   value == null ? -1 : value.remaining(),
                                                                   Time.SYSTEM);
            // Chain the future to the original thunk.
            thunk.future.chain(future);
            this.thunks.add(thunk);
            this.recordCount++;
            return true;
        }
    }



/************************************************************************/
kafka-trunk/streams/src/test/java/org/apache/kafka/test/MockRecordCollector.java
    public <K, V> void send(final String topic,
                            final K key,
                            final V value,
                            final Headers headers,
                            final Integer partition,
                            final Long timestamp,
                            final Serializer<K> keySerializer,
                            final Serializer<V> valueSerializer,
                            final String processorNodeId,
                            final InternalProcessorContext<Void, Void> context) {
        collected.add(new ProducerRecord<>(
            topic,
            partition,
            timestamp,
            key,
            value,
            headers)
        );
    }



/************************************************************************/
kafka-trunk/streams/src/test/java/org/apache/kafka/test/MockRecordCollector.java
    public <K, V> void send(final String topic,
                            final K key,
                            final V value,
                            final Headers headers,
                            final Long timestamp,
                            final Serializer<K> keySerializer,
                            final Serializer<V> valueSerializer,
                            final String processorNodeId,
                            final InternalProcessorContext<Void, Void> context,
                            final StreamPartitioner<? super K, ? super V> partitioner) {
        collected.add(new ProducerRecord<>(
            topic,
            0, // partition id
            timestamp,
            key,
            value,
            headers)
        );
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/processor/internals/RecordCollectorImpl.java
    private <K, V> void handleException(final ProductionExceptionHandler.SerializationExceptionOrigin origin,
                                        final String topic,
                                        final K key,
                                        final V value,
                                        final Headers headers,
                                        final Integer partition,
                                        final Long timestamp,
                                        final String processorNodeId,
                                        final InternalProcessorContext<Void, Void> context,
                                        final Exception serializationException) {
        log.debug(String.format("Error serializing record for topic %s", topic), serializationException);

        final ProducerRecord<K, V> record = new ProducerRecord<>(topic, partition, timestamp, key, value, headers);

        final ProductionExceptionHandlerResponse response;
        try {
            response = Objects.requireNonNull(
                productionExceptionHandler.handleSerializationException(
                    errorHandlerContext(context, processorNodeId),
                    record,
                    serializationException,
                    origin
                ),
                "Invalid ProductionExceptionHandler response."
            );
        } catch (final Exception fatalUserException) {
            // while Java distinguishes checked vs unchecked exceptions, other languages
            // like Scala or Kotlin do not, and thus we need to catch `Exception`
            // (instead of `RuntimeException`) to work well with those languages
            log.error(
                String.format(
                    "Production error callback failed after serialization error for record %s: %s",
                    origin.toString().toLowerCase(Locale.ROOT),
                    errorHandlerContext(context, processorNodeId)
                ),
                serializationException
            );
            throw new FailedProcessingException(
                "Fatal user code error in production error callback",
                processorNodeId,
                fatalUserException
            );
        }

        if (maybeFailResponse(response) == ProductionExceptionHandlerResponse.FAIL) {
            throw new StreamsException(
                String.format(
                    "Unable to serialize record. ProducerRecord(topic=[%s], partition=[%d], timestamp=[%d]",
                    topic,
                    partition,
                    timestamp),
                serializationException
            );
        }

        log.warn("Unable to serialize record, continue processing. " +
                    "ProducerRecord(topic=[{}], partition=[{}], timestamp=[{}])",
                topic,
                partition,
                timestamp);

        droppedRecordsSensor.record();
    }



/************************************************************************/
