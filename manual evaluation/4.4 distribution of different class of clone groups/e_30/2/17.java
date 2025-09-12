
    public Map<String, TObject> getKeysRecord(List<String> keys, long record,
            AccessToken creds, TransactionToken transaction, String environment)
            throws TException {
        AtomicSupport store = getStore(transaction, environment);
        return AtomicOperations.supplyWithRetry(store, atomic -> {
            Map<String, Set<TObject>> selected = Stores.select(atomic, keys,
                    record);
            Map<String, TObject> data = new LinkedHashMap<>(selected.size());
            for (Entry<String, Set<TObject>> entry : selected.entrySet()) {
                Set<TObject> values = entry.getValue();
                if(!values.isEmpty()) {
                    data.put(entry.getKey(), Iterables.getLast(values));
                }
            }
            return data;
        });
    }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\ConcourseServer.java 288435
========================================================

    public Map<String, TObject> getKeysRecordTime(List<String> keys,
            long record, long timestamp, AccessToken creds,
            TransactionToken transaction, String environment)
            throws TException {
        AtomicSupport store = getStore(transaction, environment);
        Map<String, Set<TObject>> selected = Stores.select(store, keys, record,
                timestamp);
        Map<String, TObject> data = new LinkedHashMap<>(selected.size());
        for (Entry<String, Set<TObject>> entry : selected.entrySet()) {
            Set<TObject> values = entry.getValue();
            if(!values.isEmpty()) {
                data.put(entry.getKey(), Iterables.getLast(values));
            }
        }
        return data;
    }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\ConcourseServer.java 288439
========================================================
