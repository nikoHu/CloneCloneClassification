kafka-trunk\connect\runtime\src\test\java\org\apache\kafka\connect\runtime\WorkerMetricsGroupTest.java
public void testConnectorFailureBeforeStartupRecordedMetrics() {
    WorkerMetricsGroup workerMetricsGroup = new WorkerMetricsGroup(new HashMap<>(), new HashMap<>(), connectMetrics);
    final ConnectorStatus.Listener connectorListener = workerMetricsGroup.wrapStatusListener(delegateConnectorListener);
    
    connectorListener.onFailure(connector, exception);

    verify(delegateConnectorListener).onFailure(connector, exception);
    verifyRecordConnectorStartupFailure();
}
/************************************************************************/
kafka-trunk\connect\runtime\src\test\java\org\apache\kafka\connect\runtime\WorkerMetricsGroupTest.java
public void testTaskFailureBeforeStartupRecordedMetrics() {
    WorkerMetricsGroup workerMetricsGroup = new WorkerMetricsGroup(new HashMap<>(), new HashMap<>(), connectMetrics);
    final TaskStatus.Listener taskListener = workerMetricsGroup.wrapStatusListener(delegateTaskListener);

    taskListener.onFailure(task, exception);

    verify(delegateTaskListener).onFailure(task, exception);
    verifyRecordTaskFailure();
}
