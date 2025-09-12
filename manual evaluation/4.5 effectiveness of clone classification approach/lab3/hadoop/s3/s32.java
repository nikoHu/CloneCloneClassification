hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/protocolPB/PBHelperClient.java
public static List<LocatedBlock> convertLocatedBlocks(
        List<LocatedBlockProto> lb) {
    if (lb == null) return null;
    final int len = lb.size();
    List<LocatedBlock> result = new ArrayList<>(len);
    for (LocatedBlockProto aLb : lb) {
        result.add(convertLocatedBlockProto(aLb));
    }
    return result;
}

/***************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/protocolPB/PBHelperClient.java
public static List<LocatedBlock> convertLocatedBlock(
        List<LocatedBlockProto> lb) {
    if (lb == null) return null;
    final int len = lb.size();
    List<LocatedBlock> result = new ArrayList<>(len);
    for (LocatedBlockProto aLb : lb) {
        result.add(convertLocatedBlockProto(aLb));
    }
    return result;
}
