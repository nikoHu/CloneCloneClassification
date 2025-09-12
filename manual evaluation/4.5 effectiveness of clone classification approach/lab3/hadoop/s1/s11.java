hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\placement\PrimaryGroupPlacementRule.java  
public boolean initialize(ResourceScheduler scheduler) throws IOException {
  super.initialize(scheduler);
  groupProvider = Groups.
      getUserToGroupsMappingService(((FairScheduler)scheduler).getConfig());

  return true;
}
/*****************************************************************/
hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\placement\SecondaryGroupExistingPlacementRule.java
public boolean initialize(ResourceScheduler scheduler) throws IOException {
  super.initialize(scheduler);
  groupProvider = Groups.
      getUserToGroupsMappingService(((FairScheduler)scheduler).getConfig());

  return true;
}

