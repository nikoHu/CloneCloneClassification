  @Override
  public AllocateResponse getAllocateResponse() {
    if (this.allocateResponse != null) {
      return this.allocateResponse;
    }

    YarnServerCommonServiceProtos.
        DistributedSchedulingAllocateResponseProtoOrBuilder p =
            viaProto ? proto : builder;
    if (!p.hasAllocateResponse()) {
      return null;
    }

    this.allocateResponse = new AllocateResponsePBImpl(p.getAllocateResponse());
    return this.allocateResponse;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-common\src\main\java\org\apache\hadoop\yarn\server\api\protocolrecords\impl\pb\DistributedSchedulingAllocateResponsePBImpl.java 57024
========================================================
  @Override
  public RegisterApplicationMasterResponse getRegisterResponse() {
    if (this.registerApplicationMasterResponse != null) {
      return this.registerApplicationMasterResponse;
    }

    YarnServerCommonServiceProtos.
        RegisterDistributedSchedulingAMResponseProtoOrBuilder p =
            viaProto ? proto : builder;
    if (!p.hasRegisterResponse()) {
      return null;
    }

    this.registerApplicationMasterResponse =
        new RegisterApplicationMasterResponsePBImpl(p.getRegisterResponse());
    return this.registerApplicationMasterResponse;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-common\src\main\java\org\apache\hadoop\yarn\server\api\protocolrecords\impl\pb\RegisterDistributedSchedulingAMResponsePBImpl.java 57052
========================================================
