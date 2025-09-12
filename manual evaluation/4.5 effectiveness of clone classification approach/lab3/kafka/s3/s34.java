kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBTimestampedStore.java
        RocksDBDualCFRangeIterator(final String storeName,
                                   final RocksIterator iterWithTimestamp,
                                   final RocksIterator iterNoTimestamp,
                                   final Bytes from,
                                   final Bytes to,
                                   final boolean forward,
                                   final boolean toInclusive) {
            super(storeName, iterWithTimestamp, iterNoTimestamp, forward);
            this.forward = forward;
            this.toInclusive = toInclusive;
            if (forward) {
                if (from == null) {
                    iterWithTimestamp.seekToFirst();
                    iterNoTimestamp.seekToFirst();
                } else {
                    iterWithTimestamp.seek(from.get());
                    iterNoTimestamp.seek(from.get());
                }
                rawLastKey = to == null ? null : to.get();
            } else {
                if (to == null) {
                    iterWithTimestamp.seekToLast();
                    iterNoTimestamp.seekToLast();
                } else {
                    iterWithTimestamp.seekForPrev(to.get());
                    iterNoTimestamp.seekForPrev(to.get());
                }
                rawLastKey = from == null ? null : from.get();
            }
        }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBRangeIterator.java

    RocksDBRangeIterator(final String storeName,
                         final RocksIterator iter,
                         final Bytes from,
                         final Bytes to,
                         final boolean forward,
                         final boolean toInclusive) {
        super(storeName, iter, forward);
        this.forward = forward;
        this.toInclusive = toInclusive;
        if (forward) {
            if (from == null) {
                iter.seekToFirst();
            } else {
                iter.seek(from.get());
            }
            rawLastKey = to == null ? null : to.get();
        } else {
            if (to == null) {
                iter.seekToLast();
            } else {
                iter.seekForPrev(to.get());
            }
            rawLastKey = from == null ? null : from.get();
        }
    }



/************************************************************************/
