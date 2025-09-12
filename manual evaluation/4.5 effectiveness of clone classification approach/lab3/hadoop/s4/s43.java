hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
public void logOpenFile(String path, INodeFile newNode, boolean overwrite,
                        boolean toLogRpcIds) {
    Preconditions.checkArgument(newNode.isUnderConstruction());
    PermissionStatus permissions = newNode.getPermissionStatus();
    AddOp op = AddOp.getInstance(cache.get())
            .setInodeId(newNode.getId())
            .setPath(path)
            .setReplication(newNode.getFileReplication())
            .setModificationTime(newNode.getModificationTime())
            .setAccessTime(newNode.getAccessTime())
            .setBlockSize(newNode.getPreferredBlockSize())
            .setBlocks(newNode.getBlocks())
            .setPermissionStatus(permissions)
            .setClientName(newNode.getFileUnderConstructionFeature().getClientName())
            .setClientMachine(
                    newNode.getFileUnderConstructionFeature().getClientMachine())
            .setOverwrite(overwrite)
            .setStoragePolicyId(newNode.getLocalStoragePolicyID())
            .setErasureCodingPolicyId(newNode.getErasureCodingPolicyID());

    AclFeature f = newNode.getAclFeature();
    if (f != null) {
        op.setAclEntries(AclStorage.readINodeLogicalAcl(newNode));
    }

    XAttrFeature x = newNode.getXAttrFeature();
    if (x != null) {
        op.setXAttrs(x.getXAttrs());
    }

    logRpcIds(op, toLogRpcIds);
    logEdit(op);
}


/*****************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
public void logCloseFile(String path, INodeFile newNode) {
    CloseOp op = CloseOp.getInstance(cache.get())
            .setPath(path)
            .setReplication(newNode.getFileReplication())
            .setModificationTime(newNode.getModificationTime())
            .setAccessTime(newNode.getAccessTime())
            .setBlockSize(newNode.getPreferredBlockSize())
            .setBlocks(newNode.getBlocks())
            .setPermissionStatus(newNode.getPermissionStatus());

    logEdit(op);
}



/***************************************************************/
hadoop-trunk/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSEditLog.java
public void logMkDir(String path, INode newNode) {
    PermissionStatus permissions = newNode.getPermissionStatus();
    MkdirOp op = MkdirOp.getInstance(cache.get())
            .setInodeId(newNode.getId())
            .setPath(path)
            .setTimestamp(newNode.getModificationTime())
            .setPermissionStatus(permissions);

    AclFeature f = newNode.getAclFeature();
    if (f != null) {
        op.setAclEntries(AclStorage.readINodeLogicalAcl(newNode));
    }

    XAttrFeature x = newNode.getXAttrFeature();
    if (x != null) {
        op.setXAttrs(x.getXAttrs());
    }
    logEdit(op);
}

