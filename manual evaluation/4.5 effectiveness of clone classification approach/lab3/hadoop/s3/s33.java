hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/FileIoProvider.java
public void write(int b) throws IOException {
    final long begin = profilingEventHook.beforeFileIo(volume, WRITE,
            LEN_INT);
    try {
        faultInjectorEventHook.beforeFileIo(volume, WRITE, LEN_INT);
        super.write(b);
        profilingEventHook.afterFileIo(volume, WRITE, begin, LEN_INT);
    } catch(Exception e) {
        onFailure(volume, begin);
        throw e;
    }
}

/*****************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/FileIoProvider.java
public void write(int b) throws IOException {
    final long begin = profilingEventHook.beforeFileIo(volume, WRITE,
            LEN_INT);
    try {
        faultInjectorEventHook.beforeFileIo(volume, WRITE, LEN_INT);
        super.write(b);
        profilingEventHook.afterFileIo(volume, WRITE, begin, LEN_INT);
    } catch(Exception e) {
        onFailure(volume, begin);
        throw e;
    }
}


