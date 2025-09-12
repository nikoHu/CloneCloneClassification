  @Override
  public void activateQueue() throws YarnException {
    this.writeLock.lock();
    try {
      if (getState() == QueueState.RUNNING) {
        LOG.info("The specified queue:" + getQueuePath()
            + " is already in the RUNNING state.");
      } else {
        CSQueue parentQueue = parent;
        if (parentQueue == null || parentQueue.getState() == QueueState.RUNNING) {
          updateQueueState(QueueState.RUNNING);
        } else {
          throw new YarnException("The parent Queue:" + parentQueue.getQueuePath()
              + " is not running. Please activate the parent queue first");
        }
      }
    } finally {
      this.writeLock.unlock();
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\scheduler\capacity\AbstractCSQueue.java 62587
========================================================
   */
  protected void appFinished() {
    this.writeLock.lock();
    try {
      if (getState() == QueueState.DRAINING) {
        if (getNumApplications() == 0) {
          updateQueueState(QueueState.STOPPED);
        }
      }
    } finally {
      this.writeLock.unlock();
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\scheduler\capacity\AbstractCSQueue.java 62588
========================================================
