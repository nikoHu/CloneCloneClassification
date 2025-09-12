hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedReconstructor.java
protected static void markBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer: buffers) {
        if (buffer != null) {
            buffer.mark();
        }
    }
}



/******************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedReconstructor.java
protected static void resetBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer: buffers) {
        if (buffer != null) {
            buffer.reset();
        }
    }
}


/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/io/erasurecode/rawcoder/DecodingValidator.java
private static void markBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer: buffers) {
        if (buffer != null) {
            buffer.mark();
        }
    }
}


/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/io/erasurecode/rawcoder/DecodingValidator.java
private static void resetBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer: buffers) {
        if (buffer != null) {
            buffer.reset();
        }
    }
}

/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/io/erasurecode/rawcoder/DecodingValidator.java
private static void toLimits(ByteBuffer[] buffers) {
    for (ByteBuffer buffer: buffers) {
        if (buffer != null) {
            buffer.position(buffer.limit());
        }
    }
}


