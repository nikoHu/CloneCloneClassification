kafka-trunk/clients/src/main/java/org/apache/kafka/clients/consumer/internals/AsyncKafkaConsumer.java

    @Override
    public Uuid clientInstanceId(Duration timeout) {
        if (clientTelemetryReporter.isEmpty()) {
            throw new IllegalStateException("Telemetry is not enabled. Set config `" + ConsumerConfig.ENABLE_METRICS_PUSH_CONFIG + "` to `true`.");
        }

        return ClientTelemetryUtils.fetchClientInstanceId(clientTelemetryReporter.get(), timeout);
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/consumer/internals/ShareConsumerImpl.java

    @Override
    public Uuid clientInstanceId(final Duration timeout) {
        if (clientTelemetryReporter.isEmpty()) {
            throw new IllegalStateException("Telemetry is not enabled. Set config `" + ConsumerConfig.ENABLE_METRICS_PUSH_CONFIG + "` to `true`.");
        }

        return ClientTelemetryUtils.fetchClientInstanceId(clientTelemetryReporter.get(), timeout);
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/consumer/internals/ClassicKafkaConsumer.java

    @Override
    public Uuid clientInstanceId(Duration timeout) {
        if (clientTelemetryReporter.isEmpty()) {
            throw new IllegalStateException("Telemetry is not enabled. Set config `" + ConsumerConfig.ENABLE_METRICS_PUSH_CONFIG + "` to `true`.");

        }

        return ClientTelemetryUtils.fetchClientInstanceId(clientTelemetryReporter.get(), timeout);
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/producer/KafkaProducer.java

    @Override
    public Uuid clientInstanceId(Duration timeout) {
        if (clientTelemetryReporter.isEmpty()) {
            throw new IllegalStateException("Telemetry is not enabled. Set config `" + ProducerConfig.ENABLE_METRICS_PUSH_CONFIG + "` to `true`.");
        }

        return ClientTelemetryUtils.fetchClientInstanceId(clientTelemetryReporter.get(), timeout);
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

    @Override
    public Uuid clientInstanceId(Duration timeout) {
        if (timeout.isNegative()) {
            throw new IllegalArgumentException("The timeout cannot be negative.");
        }

        if (clientTelemetryReporter.isEmpty()) {
            throw new IllegalStateException("Telemetry is not enabled. Set config `" + AdminClientConfig.ENABLE_METRICS_PUSH_CONFIG + "` to `true`.");

        }

        if (clientInstanceId != null) {
            return clientInstanceId;
        }

        clientInstanceId = ClientTelemetryUtils.fetchClientInstanceId(clientTelemetryReporter.get(), timeout);
        return clientInstanceId;
    }



/************************************************************************/
