kafka-trunk/group-coordinator/src/main/java/org/apache/kafka/coordinator/group/modern/ModernGroup.java

    public static long computeMetadataHash(
        Map<String, SubscriptionCount> subscribedTopicNames,
        Map<String, Long> topicHashCache,
        MetadataImage metadataImage
    ) {
        Map<String, Long> topicHash = new HashMap<>(subscribedTopicNames.size());
        subscribedTopicNames.keySet().forEach(topicName -> {
            TopicImage topicImage = metadataImage.topics().getTopic(topicName);
            if (topicImage != null) {
                topicHash.put(
                    topicName,
                    topicHashCache.computeIfAbsent(topicName, k -> Utils.computeTopicHash(topicName, metadataImage))
                );
            }
        });
        return Utils.computeGroupHash(topicHash);
    }



/************************************************************************/
kafka-trunk/group-coordinator/src/main/java/org/apache/kafka/coordinator/group/streams/StreamsGroup.java
    public long computeMetadataHash(
        MetadataImage metadataImage,
        Map<String, Long> topicHashCache,
        StreamsTopology topology
    ) {
        Set<String> requiredTopicNames = topology.requiredTopics();

        Map<String, Long> topicHash = new HashMap<>(requiredTopicNames.size());
        requiredTopicNames.forEach(topicName -> {
            TopicImage topicImage = metadataImage.topics().getTopic(topicName);
            if (topicImage != null) {
                topicHash.put(
                    topicName,
                    topicHashCache.computeIfAbsent(topicName, k -> Utils.computeTopicHash(topicName, metadataImage))
                );
            }
        });
        return Utils.computeGroupHash(topicHash);
    }



/************************************************************************/
