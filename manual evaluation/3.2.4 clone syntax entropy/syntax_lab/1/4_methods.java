  @Override
  public GetECTopologyResultForPoliciesResponseProto getECTopologyResultForPolicies(
      RpcController controller, GetECTopologyResultForPoliciesRequestProto req)
      throws ServiceException {
    try {
      ProtocolStringList policies = req.getPoliciesList();
      ECTopologyVerifierResult result = server.getECTopologyResultForPolicies(
          policies.toArray(policies.toArray(new String[policies.size()])));
      GetECTopologyResultForPoliciesResponseProto.Builder builder =
          GetECTopologyResultForPoliciesResponseProto.newBuilder();
      builder
          .setResponse(PBHelperClient.convertECTopologyVerifierResult(result));
      return builder.build();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs\src\main\java\org\apache\hadoop\hdfs\protocolPB\ClientNamenodeProtocolServerSideTranslatorPB.java 39521
========================================================
  @Override
  public GetECTopologyResultForPoliciesResponseProto getECTopologyResultForPolicies(
      RpcController controller, GetECTopologyResultForPoliciesRequestProto req) {
    asyncRouterServer(() -> {
      ProtocolStringList policies = req.getPoliciesList();
      return server.getECTopologyResultForPolicies(
          policies.toArray(policies.toArray(new String[policies.size()])));
    }, result -> {
        GetECTopologyResultForPoliciesResponseProto.Builder builder =
            GetECTopologyResultForPoliciesResponseProto.newBuilder();
        builder
            .setResponse(PBHelperClient.convertECTopologyVerifierResult(result));
        return builder.build();
      });
    return null;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\protocolPB\RouterClientNamenodeProtocolServerSideTranslatorPB.java 45621
========================================================
