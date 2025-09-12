hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/ReservedSpaceCalculator.java
public ReservedSpaceCalculatorConservative(Configuration conf, DF usage,
                                           StorageType storageType, String dir) {
    super(conf, usage, storageType, dir);
    this.reservedBytes = getReservedFromConf(DFS_DATANODE_DU_RESERVED_KEY,
            DFS_DATANODE_DU_RESERVED_DEFAULT);
    this.reservedPct = getReservedFromConf(
            DFS_DATANODE_DU_RESERVED_PERCENTAGE_KEY,
            DFS_DATANODE_DU_RESERVED_PERCENTAGE_DEFAULT);
}


/*******************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/ReservedSpaceCalculator.java
public ReservedSpaceCalculatorAggressive(Configuration conf, DF usage,
                                         StorageType storageType, String dir) {
    super(conf, usage, storageType, dir);
    this.reservedBytes = getReservedFromConf(DFS_DATANODE_DU_RESERVED_KEY,
            DFS_DATANODE_DU_RESERVED_DEFAULT);
    this.reservedPct = getReservedFromConf(
            DFS_DATANODE_DU_RESERVED_PERCENTAGE_KEY,
            DFS_DATANODE_DU_RESERVED_PERCENTAGE_DEFAULT);
}