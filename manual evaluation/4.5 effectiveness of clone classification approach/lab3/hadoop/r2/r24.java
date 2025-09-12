hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/CapacityScheduler.java
public Resource getMaximumResourceCapability(String queueName) {
    if(queueName == null || queueName.isEmpty()) {
        return getMaximumResourceCapability();
    }
    CSQueue queue = getQueue(queueName);
    if (queue == null) {
        if (isAmbiguous(queueName)) {
            LOG.error("Ambiguous queue reference: " + queueName
                    + " please use full queue path instead.");
        } else {
            LOG.error("Unknown queue: " + queueName);
        }
        return getMaximumResourceCapability();
    }
    if (!(queue instanceof AbstractLeafQueue)) {
        LOG.error("queue " + queueName + " is not an leaf queue");
        return getMaximumResourceCapability();
    }

    // queue.getMaxAllocation returns *configured* maximum allocation.
    // getMaximumResourceCapability() returns maximum allocation considers
    // per-node maximum resources. So return (component-wise) min of the two.

    Resource queueMaxAllocation = queue.getMaximumAllocation();
    Resource clusterMaxAllocationConsiderNodeMax =
            getMaximumResourceCapability();

    return Resources.componentwiseMin(queueMaxAllocation,
            clusterMaxAllocationConsiderNodeMax);
}

/***********************************************************************/
hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/CapacityScheduler.java
public long getMaximumApplicationLifetime(String queueName) {
    CSQueue queue = getQueue(queueName);
    if (!(queue instanceof AbstractLeafQueue)) {
        if (isAmbiguous(queueName)) {
            LOG.error("Ambiguous queue reference: " + queueName
                    + " please use full queue path instead.");
        } else {
            LOG.error("Unknown queue: " + queueName);
        }
        return -1;
    }
    // In seconds
    return queue.getMaximumApplicationLifetime();
}

/***********************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/SinkQueue.java
synchronized T dequeue() throws InterruptedException {
    checkConsumer();

    while (0 == size) {
        wait();
    }
    return _dequeue();
}



/***********************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/SinkQueue.java
private synchronized T waitForData() throws InterruptedException {
    checkConsumer();

    while (0 == size) {
        wait();
    }
    setConsumerLock();
    return front();
}


