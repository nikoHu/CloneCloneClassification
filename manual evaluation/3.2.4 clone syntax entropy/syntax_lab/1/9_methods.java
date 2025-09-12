  @Override
  public AddErasureCodingPolicyResponse[] addErasureCodingPolicies(
      ErasureCodingPolicy[] policies) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE);

    RemoteMethod method = new RemoteMethod("addErasureCodingPolicies",
        new Class<?>[] {ErasureCodingPolicy[].class}, new Object[] {policies});
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();

    rpcClient.invokeConcurrent(
        nss, method, true, false, AddErasureCodingPolicyResponse[].class);

    asyncApply(
        (ApplyFunction<Map<FederationNamespaceInfo, AddErasureCodingPolicyResponse[]>,
            AddErasureCodingPolicyResponse[]>) ret -> {
          return merge(ret, AddErasureCodingPolicyResponse.class);
        });
    return asyncReturn(AddErasureCodingPolicyResponse[].class);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\async\AsyncErasureCoding.java 46007
========================================================

  public AddErasureCodingPolicyResponse[] addErasureCodingPolicies(
      ErasureCodingPolicy[] policies) throws IOException {
    rpcServer.checkOperation(OperationCategory.WRITE);

    RemoteMethod method = new RemoteMethod("addErasureCodingPolicies",
        new Class<?>[] {ErasureCodingPolicy[].class}, new Object[] {policies});
    Set<FederationNamespaceInfo> nss = namenodeResolver.getNamespaces();
    Map<FederationNamespaceInfo, AddErasureCodingPolicyResponse[]> ret =
        rpcClient.invokeConcurrent(
            nss, method, true, false, AddErasureCodingPolicyResponse[].class);

    return merge(ret, AddErasureCodingPolicyResponse.class);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\ErasureCoding.java 46320
========================================================
