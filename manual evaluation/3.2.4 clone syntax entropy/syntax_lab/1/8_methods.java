  @Override
  public LastBlockWithStatus append(
      String src, String clientName,
      EnumSetWritable<CreateFlag> flag) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE);

    List<RemoteLocation> locations = rpcServer.getLocationsForPath(src, true);
    RemoteMethod method = new RemoteMethod("append",
        new Class<?>[] {String.class, String.class, EnumSetWritable.class},
        new RemoteParam(), clientName, flag);
    rpcClient.invokeSequential(method, locations, LastBlockWithStatus.class, null);
    asyncApply((ApplyFunction<RemoteResult, LastBlockWithStatus>) result -> {
      LastBlockWithStatus lbws = (LastBlockWithStatus) result.getResult();
      lbws.getFileStatus().setNamespace(result.getLocation().getNameserviceId());
      return lbws;
    });
    return asyncReturn(LastBlockWithStatus.class);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\async\RouterAsyncClientProtocol.java 45972
========================================================
  @Override
  public LastBlockWithStatus append(String src, final String clientName,
      final EnumSetWritable<CreateFlag> flag) throws IOException {
    rpcServer.checkOperation(NameNode.OperationCategory.WRITE);

    List<RemoteLocation> locations = rpcServer.getLocationsForPath(src, true);
    RemoteMethod method = new RemoteMethod("append",
        new Class<?>[] {String.class, String.class, EnumSetWritable.class},
        new RemoteParam(), clientName, flag);
    RemoteResult result = rpcClient.invokeSequential(
        method, locations, LastBlockWithStatus.class, null);
    LastBlockWithStatus lbws = (LastBlockWithStatus) result.getResult();
    lbws.getFileStatus().setNamespace(result.getLocation().getNameserviceId());
    return lbws;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\RouterClientProtocol.java 46020
========================================================
