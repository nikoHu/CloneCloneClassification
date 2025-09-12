hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/constraint/AllocationTagsManager.java
public long getNodeCardinality(NodeId nodeId, ApplicationId applicationId,
                               String tag) throws InvalidAllocationTagsQueryException {
    readLock.lock();

    try {
        if (nodeId == null) {
            throw new InvalidAllocationTagsQueryException(
                    "Must specify nodeId/tag to query cardinality");
        }

        TypeToCountedTags mapping;
        if (applicationId != null) {
            mapping = perAppNodeMappings.get(applicationId);
        } else {
            mapping = globalNodeMapping;
        }

        if (mapping == null) {
            return 0;
        }

        return mapping.getCardinality(nodeId, tag);
    } finally {
        readLock.unlock();
    }
}


/************************************************************************/
hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/constraint/AllocationTagsManager.java
public long getRackCardinality(String rack, ApplicationId applicationId,
                               String tag) throws InvalidAllocationTagsQueryException {
    readLock.lock();

    try {
        if (rack == null) {
            throw new InvalidAllocationTagsQueryException(
                    "Must specify rack/tag to query cardinality");
        }

        TypeToCountedTags mapping;
        if (applicationId != null) {
            mapping = perAppRackMappings.get(applicationId);
        } else {
            mapping = globalRackMapping;
        }

        if (mapping == null) {
            return 0;
        }

        return mapping.getCardinality(rack, tag);
    } finally {
        readLock.unlock();
    }
}