hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\test\java\org\apache\hadoop\yarn\server\resourcemanager\scheduler\fair\converter\TestQueuePlacementConverter.java
public void testConvertSecondaryGroupRuleWithCreate() {
  FSPlacementRule fsRule = mock(SecondaryGroupExistingPlacementRule.class);
  when(fsRule.getCreateFlag()).thenReturn(true);
  initPlacementManagerMock(fsRule);

  convert();

  verify(ruleHandler).handleRuleAutoCreateFlag(eq("root.<secondaryGroup>"));
  verifyNoMoreInteractions(ruleHandler);
}

/*********************************************************************/
hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\test\java\org\apache\hadoop\yarn\server\resourcemanager\scheduler\fair\converter\TestQueuePlacementConverter.java
public void testConvertNestedPrimaryGroupRuleWithCreate() {
  UserPlacementRule fsRule = mock(UserPlacementRule.class);
  PrimaryGroupPlacementRule parent = mock(PrimaryGroupPlacementRule.class);
  when(fsRule.getParentRule()).thenReturn(parent);
  when(fsRule.getCreateFlag()).thenReturn(true);
  initPlacementManagerMock(fsRule);

  convert();

  verify(ruleHandler).handleRuleAutoCreateFlag(eq("root.<primaryGroup>"));
  verifyNoMoreInteractions(ruleHandler);
}


