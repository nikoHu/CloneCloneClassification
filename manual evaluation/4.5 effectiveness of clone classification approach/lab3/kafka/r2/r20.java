kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyWindowStore.java
    @Override
    public V fetch(final K key, final long time) {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlyWindowStore<K, V>> stores = provider.stores(storeName, windowStoreType);
        for (final ReadOnlyWindowStore<K, V> windowStore : stores) {
            try {
                final V result = windowStore.fetch(key, time);
                if (result != null) {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException(
                    "State store is not available anymore and may have been migrated to another instance; " +
                        "please re-discover its location from the state metadata.");
            }
        }
        return null;
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyWindowStore.java
    @Override
    public WindowStoreIterator<V> fetch(final K key,
                                        final Instant timeFrom,
                                        final Instant timeTo) {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlyWindowStore<K, V>> stores = provider.stores(storeName, windowStoreType);
        for (final ReadOnlyWindowStore<K, V> windowStore : stores) {
            try {
                final WindowStoreIterator<V> result = windowStore.fetch(key, timeFrom, timeTo);
                if (!result.hasNext()) {
                    result.close();
                } else {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException(
                    "State store is not available anymore and may have been migrated to another instance; " +
                        "please re-discover its location from the state metadata.");
            }
        }
        return KeyValueIterators.emptyWindowStoreIterator();
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyWindowStore.java
    @Override
    public WindowStoreIterator<V> backwardFetch(final K key,
                                                final Instant timeFrom,
                                                final Instant timeTo) throws IllegalArgumentException {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlyWindowStore<K, V>> stores = provider.stores(storeName, windowStoreType);
        for (final ReadOnlyWindowStore<K, V> windowStore : stores) {
            try {
                final WindowStoreIterator<V> result = windowStore.backwardFetch(key, timeFrom, timeTo);
                if (!result.hasNext()) {
                    result.close();
                } else {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException(
                    "State store is not available anymore and may have been migrated to another instance; " +
                        "please re-discover its location from the state metadata.");
            }
        }
        return KeyValueIterators.emptyWindowStoreIterator();
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlySessionStore.java
    @Override
    public V fetchSession(final K key, final long earliestSessionEndTime, final long latestSessionStartTime) {
        Objects.requireNonNull(key, "key can't be null");
        final List<ReadOnlySessionStore<K, V>> stores = storeProvider.stores(storeName, queryableStoreType);
        for (final ReadOnlySessionStore<K, V> store : stores) {
            try {
                return store.fetchSession(key, earliestSessionEndTime, latestSessionStartTime);
            } catch (final InvalidStateStoreException ise) {
                throw new InvalidStateStoreException(
                    "State store  [" + storeName + "] is not available anymore" +
                        " and may have been migrated to another instance; " +
                        "please re-discover its location from the state metadata.",
                    ise
                );
            }
        }
        return null;
    }



/************************************************************************/
kafka-trunk/streams/src/main/java/org/apache/kafka/streams/state/internals/CompositeReadOnlyKeyValueStore.java
    @Override
    public V get(final K key) {
        Objects.requireNonNull(key);
        final List<ReadOnlyKeyValueStore<K, V>> stores = storeProvider.stores(storeName, storeType);
        for (final ReadOnlyKeyValueStore<K, V> store : stores) {
            try {
                final V result = store.get(key);
                if (result != null) {
                    return result;
                }
            } catch (final InvalidStateStoreException e) {
                throw new InvalidStateStoreException("State store is not available anymore and may have been migrated to another instance; please re-discover its location from the state metadata.");
            }

        }
        return null;
    }



/************************************************************************/
