
    public void addTimeSinceLastHeartbeatMetric(int brokerId) {
        brokerContactTimesMs.put(brokerId, time.milliseconds());
        registry.ifPresent(r -> r.newGauge(
            getBrokerIdTagMetricName(
                "KafkaController",
                TIME_SINCE_LAST_HEARTBEAT_RECEIVED_METRIC_NAME,
                brokerId
            ),
            new Gauge<Integer>() {
                @Override
                public Integer value() {
                    return timeSinceLastHeartbeatMs(brokerId);
                }
            }
        ));
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\metadata\src\main\java\org\apache\kafka\controller\metrics\QuorumControllerMetrics.java 29445
========================================================

    public void addBrokerRegistrationStateMetric(int brokerId) {
        registry.ifPresent(r -> r.newGauge(
            getBrokerIdTagMetricName(
                "KafkaController",
                BROKER_REGISTRATION_STATE_METRIC_NAME,
                brokerId
            ),
            new Gauge<Integer>() {
                @Override
                public Integer value() {
                    return brokerRegistrationState(brokerId);
                }
            }
        ));
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\metadata\src\main\java\org\apache\kafka\controller\metrics\ControllerMetadataMetrics.java 29454
========================================================
