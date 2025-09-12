 kafka-trunk\streams\src\test\java\org\apache\kafka\streams\kstream\internals\foreignkeyjoin\SubscriptionJoinProcessorSupplierTest.java
public void shouldPropagateOnlyIfFKAvailableV0() {
    final MockProcessorContext<String, SubscriptionResponseWrapper<String>> context = new MockProcessorContext<>();
    processor.init(context);

    final SubscriptionWrapper<String> newValue = new SubscriptionWrapper<>(
        new long[]{1L},
        Instruction.PROPAGATE_ONLY_IF_FK_VAL_AVAILABLE,
        "pk1",
        SubscriptionWrapper.VERSION_0,
        null
    );
    final Record<CombinedKey<String, String>, Change<ValueAndTimestamp<SubscriptionWrapper<String>>>> record =
        new Record<>(
            new CombinedKey<>("fk1", "pk1"),
            new Change<>(ValueAndTimestamp.make(newValue, 1L), null),
            1L
    );
    processor.process(record);
    final List<CapturedForward<? extends String, ? extends SubscriptionResponseWrapper<String>>> forwarded = context.forwarded();
    assertEquals(1, forwarded.size());
    assertEquals(
        new Record<>(
            "pk1",
            new SubscriptionResponseWrapper<>(
                newValue.hash(),
                "foo",
                null
            ),
            1L
        ),
        forwarded.get(0).record()
    );
}


/************************************************************************/
kafka-trunk\streams\src\test\java\org\apache\kafka\streams\kstream\internals\foreignkeyjoin\SubscriptionJoinProcessorSupplierTest.java
public void shouldPropagateNullIfNoFKAvailableV0() {
    final MockProcessorContext<String, SubscriptionResponseWrapper<String>> context = new MockProcessorContext<>();
    processor.init(context);

    final SubscriptionWrapper<String> newValue = new SubscriptionWrapper<>(
        new long[]{1L},
        Instruction.PROPAGATE_NULL_IF_NO_FK_VAL_AVAILABLE,
        "pk1",
        SubscriptionWrapper.VERSION_0,
        null
    );
    Record<CombinedKey<String, String>, Change<ValueAndTimestamp<SubscriptionWrapper<String>>>> record =
        new Record<>(
            new CombinedKey<>("fk1", "pk1"),
            new Change<>(ValueAndTimestamp.make(newValue, 1L), null),
            1L
        );
    processor.process(record);
    // propagate matched FK
    List<CapturedForward<? extends String, ? extends SubscriptionResponseWrapper<String>>> forwarded = context.forwarded();
    assertEquals(1, forwarded.size());
    assertEquals(
        new Record<>(
            "pk1",
            new SubscriptionResponseWrapper<>(
                newValue.hash(),
                "foo",
                null
            ),
            1L
        ),
        forwarded.get(0).record());

    record = new Record<>(
            new CombinedKey<>("fk9000", "pk1"),
            new Change<>(ValueAndTimestamp.make(newValue, 1L), null),
            1L
        );
    processor.process(record);
    // propagate null if there is no match
    forwarded = context.forwarded();
    assertEquals(2, forwarded.size());
    assertEquals(
        new Record<>(
            "pk1",
            new SubscriptionResponseWrapper<>(
                newValue.hash(),
                null,
                null
            ),
            1L
        ),
        forwarded.get(1).record());
}

