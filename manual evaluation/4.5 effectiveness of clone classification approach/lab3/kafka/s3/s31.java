kafka-trunk\clients\src\test\java\org\apache\kafka\clients\consumer\internals\metrics\AsyncConsumerMetricsTest.java

 public void shouldRecordApplicationEventQueueSize() {
        consumerMetrics = new AsyncConsumerMetrics(metrics);
        // When:
        consumerMetrics.recordApplicationEventQueueSize(10);

        // Then:
        assertEquals(
            metrics.metric(
                metrics.metricName(
                    "application-event-queue-size",
                    CONSUMER_METRIC_GROUP
                )
            ).metricValue(),
            (double) 10
        );
    }

/************************************************************************/
kafka-trunk\clients\src\test\java\org\apache\kafka\clients\consumer\internals\metrics\AsyncConsumerMetricsTest.java
    public void shouldRecordBackgroundEventQueueSize() {
        consumerMetrics = new AsyncConsumerMetrics(metrics);
        // When:
        consumerMetrics.recordBackgroundEventQueueSize(10);

        // Then:
        assertEquals(
            metrics.metric(
                metrics.metricName(
                    "background-event-queue-size",
                    CONSUMER_METRIC_GROUP
                )
            ).metricValue(),
            (double) 10
        );
    }

