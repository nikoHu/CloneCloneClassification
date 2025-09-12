    @Override
    public void serviceStop() throws Exception {
      for (LocalizerRunner localizer : privLocalizers.values()) {
        localizer.interrupt();
      }
      publicLocalizer.interrupt();
      super.serviceStop();
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-nodemanager\src\main\java\org\apache\hadoop\yarn\server\nodemanager\containermanager\localizer\ResourceLocalizationService.java 55489
========================================================
  /** Stops the service.  No new calls will be handled after this is called. */
  public synchronized void stop() {
    LOG.info("Stopping server on " + port);
    running = false;
    if (handlers != null) {
      for (int i = 0; i < handlerCount; i++) {
        if (handlers[i] != null) {
          handlers[i].interrupt();
        }
      }
    }
    listener.interrupt();
    listener.doStop();
    if (auxiliaryListenerMap != null && auxiliaryListenerMap.size() > 0) {
      for (Listener newListener : auxiliaryListenerMap.values()) {
        newListener.interrupt();
        newListener.doStop();
      }
    }
    responder.interrupt();
    notifyAll();
    shutdownMetricsUpdaterExecutor();
    this.rpcMetrics.shutdown();
    this.rpcDetailedMetrics.shutdown();
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\ipc\Server.java 90219
========================================================
