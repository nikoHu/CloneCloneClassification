kafka-trunk\connect\runtime\src\test\java\org\apache\kafka\connect\util\SinkUtilsTest.java
public void testValidateAndParseStringPartitionValue() {
    Map<Map<String, ?>, Map<String, ?>> partitionOffsets = createPartitionOffsetMap("topic", "10", "100");
    Map<TopicPartition, Long> parsedOffsets = SinkUtils.parseSinkConnectorOffsets(partitionOffsets);
    assertEquals(1, parsedOffsets.size());
    TopicPartition tp = parsedOffsets.keySet().iterator().next();
    assertEquals(10, tp.partition());
}

/************************************************************************/
kafka-trunk\connect\runtime\src\test\java\org\apache\kafka\connect\util\SinkUtilsTest.java
public void testValidateAndParseIntegerPartitionValue() {
    Map<Map<String, ?>, Map<String, ?>> partitionOffsets = createPartitionOffsetMap("topic", 10, "100");
    Map<TopicPartition, Long> parsedOffsets = SinkUtils.parseSinkConnectorOffsets(partitionOffsets);
    assertEquals(1, parsedOffsets.size());
    TopicPartition tp = parsedOffsets.keySet().iterator().next();
    assertEquals(10, tp.partition());
}

