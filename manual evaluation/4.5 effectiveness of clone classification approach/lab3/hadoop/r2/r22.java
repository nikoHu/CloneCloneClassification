hadoop-trunk/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/S3ADataBlocks.java
protected synchronized boolean enterClosedState() {
    if (!state.equals(Closed)) {
        enterState(null, Closed);
        return true;
    } else {
        return false;
    }
}


/******************************************************************/
hadoop-trunk/hadoop-tools/hadoop-aliyun/src/main/java/org/apache/hadoop/fs/aliyun/oss/OSSDataBlocks.java
protected synchronized boolean enterClosedState() {
    if (!state.equals(DestState.Closed)) {
        enterState(null, DestState.Closed);
        return true;
    } else {
        return false;
    }
}


/*****************************************************************/
hadoop-trunk/hadoop-cloud-storage-project/hadoop-huaweicloud/src/main/java/org/apache/hadoop/fs/obs/OBSDataBlocks.java
protected synchronized boolean enterClosedState() {
    if (!state.equals(DestState.Closed)) {
        enterState(null, DestState.Closed);
        return true;
    } else {
        return false;
    }
}


/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/store/DataBlocks.java
protected synchronized boolean enterClosedState() {
    if (!state.equals(Closed)) {
        enterState(null, Closed);
        return true;
    } else {
        return false;
    }
}

