hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/FileIoProvider.java
public int read() throws IOException {
    final long begin = profilingEventHook.beforeFileIo(volume, READ, LEN_INT);
    try {
        faultInjectorEventHook.beforeFileIo(volume, READ, LEN_INT);
        int b = super.read();
        profilingEventHook.afterFileIo(volume, READ, begin, LEN_INT);
        return b;
    } catch(Exception e) {
        onFailure(volume, begin);
        throw e;
    }
}


/*********************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/FileIoProvider.java
public int read() throws IOException {
    final long begin = profilingEventHook.beforeFileIo(volume, READ, LEN_INT);
    try {
        faultInjectorEventHook.beforeFileIo(volume, READ, LEN_INT);
        int b = super.read();
        profilingEventHook.afterFileIo(volume, READ, begin, LEN_INT);
        return b;
    } catch(Exception e) {
        onFailure(volume, begin);
        throw e;
    }
}


