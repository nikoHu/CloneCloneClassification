kafka-trunk\streams\src\test\java\org\apache\kafka\streams\state\internals\ChangeLoggingTimestampedWindowBytesStoreTest.java
public void shouldLogPuts() {
    final Bytes key = WindowKeySchema.toStoreKeyBinary(bytesKey, 0, 0);
    when(inner.getPosition()).thenReturn(Position.emptyPosition());
    when(context.recordContext()).thenReturn(new ProcessorRecordContext(0, 0, 0, "topic", new RecordHeaders()));

    store.put(bytesKey, valueAndTimestamp, context.recordContext().timestamp());

    verify(inner).put(bytesKey, valueAndTimestamp, 0);
    verify(context).logChange(store.name(), key, value, 42, Position.emptyPosition());
}

/************************************************************************/
kafka-trunk\streams\src\test\java\org\apache\kafka\streams\state\internals\ChangeLoggingTimestampedWindowBytesStoreTest.java
public void shouldLogPutsWithPosition() {
    final Bytes key = WindowKeySchema.toStoreKeyBinary(bytesKey, 0, 0);
    when(inner.getPosition()).thenReturn(POSITION);
    when(context.recordContext()).thenReturn(new ProcessorRecordContext(0, 0, 0, "topic", new RecordHeaders()));

    store.put(bytesKey, valueAndTimestamp, context.recordContext().timestamp());

    verify(inner).put(bytesKey, valueAndTimestamp, 0);
    verify(context).logChange(store.name(), key, value, 42, POSITION);
}

