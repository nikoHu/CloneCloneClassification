
  private synchronized void initNodeAttributes() {
    if (this.attributes != null) {
      return;
    }
    RegisterNodeManagerRequestProtoOrBuilder p = viaProto ? proto : builder;
    if (!p.hasNodeAttributes()) {
      attributes=null;
      return;
    }
    NodeAttributesProto nodeAttributes = p.getNodeAttributes();
    attributes = new HashSet<>();
    for(NodeAttributeProto nap : nodeAttributes.getNodeAttributesList()) {
      attributes.add(convertFromProtoFormat(nap));
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-common\src\main\java\org\apache\hadoop\yarn\server\api\protocolrecords\impl\pb\RegisterNodeManagerRequestPBImpl.java 57123
========================================================

  private void initNodeAttributes() {
    if (this.attributes != null) {
      return;
    }
    NodeHeartbeatRequestProtoOrBuilder p = viaProto ? proto : builder;
    if (!p.hasNodeAttributes()) {
      return;
    }
    YarnServerCommonServiceProtos.NodeAttributesProto nodeAttributes =
        p.getNodeAttributes();
    attributes = new HashSet<>();
    for (NodeAttributeProto attributeProto :
        nodeAttributes.getNodeAttributesList()) {
      attributes.add(convertFromProtoFormat(attributeProto));
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-common\src\main\java\org\apache\hadoop\yarn\server\api\protocolrecords\impl\pb\NodeHeartbeatRequestPBImpl.java 57197
========================================================
