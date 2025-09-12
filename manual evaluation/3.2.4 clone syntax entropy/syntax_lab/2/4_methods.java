  @Override
  public void setConfig(Element conf) {
    // Get the flag from the config (defaults to true if not set)
    createQueue = getCreateFlag(conf);
    // No config can be set when no policy is defined and we use defaults
    if (conf != null) {
      defaultQueueName = conf.getAttribute("queue");
      // A queue read from the config could be illegal check it: fall back to
      // the config default if it is the case
      // However we cannot clean the name as a nested name is allowed.
      if (!isValidQueueName(defaultQueueName)) {
        LOG.error("Default rule configured with an illegal queue name: '{}'",
            defaultQueueName);
        defaultQueueName = null;
      }
    }
    // The queue name does not have to be set and we really use "default"
    if (defaultQueueName == null || defaultQueueName.isEmpty()) {
      defaultQueueName = assureRoot(YarnConfiguration.DEFAULT_QUEUE_NAME);
    } else {
      defaultQueueName = assureRoot(defaultQueueName);
    }
    LOG.debug("Default rule instantiated with queue name: {}, " +
        "and create flag: {}", defaultQueueName, createQueue);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\placement\DefaultPlacementRule.java 65078
========================================================
  @Override
  public void setConfig(Boolean create) {
    createQueue = create;
    // No config so fall back to the real default.
    defaultQueueName = assureRoot(YarnConfiguration.DEFAULT_QUEUE_NAME);
    LOG.debug("Default rule instantiated with default queue name: {}, " +
        "and create flag: {}", defaultQueueName, createQueue);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\placement\DefaultPlacementRule.java 65079
========================================================
