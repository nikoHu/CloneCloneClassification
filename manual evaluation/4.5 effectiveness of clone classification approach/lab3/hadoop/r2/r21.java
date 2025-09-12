hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/router/RouterRpcServer.java
protected void serviceStop() throws Exception {
    if (this.rpcServer != null) {
        this.rpcServer.stop();
    }
    if (rpcMonitor != null) {
        this.rpcMonitor.close();
    }
    if (securityManager != null) {
        this.securityManager.stop();
    }
    if (this.fedRenameScheduler != null) {
        fedRenameScheduler.shutDown();
    }
    super.serviceStop();
}



/******************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/router/Router.java
protected void serviceStop() throws Exception {

    // Update state
    updateRouterState(RouterServiceState.SHUTDOWN);

    // JVM pause monitor
    if (this.pauseMonitor != null) {
        this.pauseMonitor.stop();
    }

    super.serviceStop();
}


/******************************************************************/
hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/ClientRMService.java
protected void serviceStop() throws Exception {
    if (this.server != null) {
        this.server.stop();
    }
    if (this.contextPreProcessor != null) {
        this.contextPreProcessor.stop();
    }
    super.serviceStop();
}


/