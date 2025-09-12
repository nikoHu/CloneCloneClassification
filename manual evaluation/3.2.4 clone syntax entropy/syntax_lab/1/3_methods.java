
        CoordinatorCompleteTransactionEvent(
            String name,
            TopicPartition tp,
            long producerId,
            short producerEpoch,
            int coordinatorEpoch,
            TransactionResult result,
            Duration writeTimeout
        ) {
            this.name = name;
            this.tp = tp;
            this.producerId = producerId;
            this.producerEpoch = producerEpoch;
            this.coordinatorEpoch = coordinatorEpoch;
            this.result = result;
            this.writeTimeout = writeTimeout;
            this.future = new CompletableFuture<>();
            this.createdTimeMs = time.milliseconds();
            this.deferredEventQueuedTimestamp = NOT_QUEUED;
        }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\coordinator-common\src\main\java\org\apache\kafka\coordinator\common\runtime\CoordinatorRuntime.java 10883
========================================================

        public TxnMarkerEntry(long producerId,
                              short producerEpoch,
                              int coordinatorEpoch,
                              TransactionResult result,
                              List<TopicPartition> partitions) {
            this.producerId = producerId;
            this.producerEpoch = producerEpoch;
            this.coordinatorEpoch = coordinatorEpoch;
            this.result = result;
            this.partitions = partitions;
        }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\clients\src\main\java\org\apache\kafka\common\requests\WriteTxnMarkersRequest.java 17211
========================================================
