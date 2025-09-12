kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/metrics/RocksDBMetrics.java
    public static void addEstimateTableReadersMemMetric(final StreamsMetricsImpl streamsMetrics,
                                                        final RocksDBMetricContext metricContext,
                                                        final Gauge<BigInteger> valueProvider) {
        addMutableMetric(
            streamsMetrics,
            metricContext,
            valueProvider,
            ESTIMATED_MEMORY_OF_TABLE_READERS,
            ESTIMATED_MEMORY_OF_TABLE_READERS_DESCRIPTION
        );
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/metrics/RocksDBMetrics.java
    public static void addBackgroundErrorsMetric(final StreamsMetricsImpl streamsMetrics,
                                                 final RocksDBMetricContext metricContext,
                                                 final Gauge<BigInteger> valueProvider) {
        addMutableMetric(
            streamsMetrics,
            metricContext,
            valueProvider,
            NUMBER_OF_BACKGROUND_ERRORS,
            TOTAL_NUMBER_OF_BACKGROUND_ERRORS_DESCRIPTION
        );
    }



/************************************************************************/
