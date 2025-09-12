kafka-trunk\clients\src\test\java\org\apache\kafka\clients\consumer\internals\OffsetFetcherTest.java
public void testBeginningOffsetsMultipleTopicPartitions() {
    buildFetcher();
    Map<TopicPartition, Long> expectedOffsets = new HashMap<>();
    expectedOffsets.put(tp0, 2L);
    expectedOffsets.put(tp1, 4L);
    expectedOffsets.put(tp2, 6L);
    assignFromUser(expectedOffsets.keySet());
    client.prepareResponse(listOffsetResponse(expectedOffsets, Errors.NONE, ListOffsetsRequest.EARLIEST_TIMESTAMP, ListOffsetsResponse.UNKNOWN_EPOCH));
    assertEquals(expectedOffsets, offsetFetcher.beginningOffsets(asList(tp0, tp1, tp2), time.timer(5000L)));
}

/************************************************************************/
kafka-trunk\clients\src\test\java\org\apache\kafka\clients\consumer\internals\OffsetFetcherTest.java
public void testEndOffsetsMultipleTopicPartitions() {
    buildFetcher();
    Map<TopicPartition, Long> expectedOffsets = new HashMap<>();
    expectedOffsets.put(tp0, 5L);
    expectedOffsets.put(tp1, 7L);
    expectedOffsets.put(tp2, 9L);
    assignFromUser(expectedOffsets.keySet());
    client.prepareResponse(listOffsetResponse(expectedOffsets, Errors.NONE, ListOffsetsRequest.LATEST_TIMESTAMP, ListOffsetsResponse.UNKNOWN_EPOCH));
    assertEquals(expectedOffsets, offsetFetcher.endOffsets(asList(tp0, tp1, tp2), time.timer(5000L)));
}



