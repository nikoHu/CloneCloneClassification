
    private Iterator<Map.Entry<Cell, Value>> getRowColumnRangePostFiltered(
            TableReference tableRef, RowColumnRangeIterator iterator, int batchHint) {
        return Iterators.concat(Iterators.transform(Iterators.partition(iterator, batchHint), batch -> {
            Map<Cell, Value> raw = validateBatch(tableRef, batch, false /* can't skip lock checks on range scans */);
            if (raw.isEmpty()) {
                return Collections.emptyIterator();
            }
            SortedMap<Cell, Value> postFiltered = ImmutableSortedMap.copyOf(
                    getWithPostFilteringSync(tableRef, raw, x -> x), preserveInputRowOrder(batch));
            return postFiltered.entrySet().iterator();
        }));
    }


D:\_python\clone\CloneClassification\data_new\db\atlasdb\atlasdb-impl-shared\src\main\java\com\palantir\atlasdb\transaction\impl\SnapshotTransaction.java 255103
========================================================

    private Iterator<Map.Entry<Cell, Value>> getRowColumnRangePostFilteredWithoutSorting(
            TableReference tableRef,
            Iterator<Map.Entry<Cell, Value>> iterator,
            int batchHint,
            Comparator<Cell> cellComparator) {
        return Iterators.concat(Iterators.transform(Iterators.partition(iterator, batchHint), batch -> {
            Map<Cell, Value> raw = validateBatch(tableRef, batch, false /* can't skip lock check on range scans */);
            if (raw.isEmpty()) {
                return Collections.emptyIterator();
            }

            SortedMap<Cell, Value> postFiltered =
                    ImmutableSortedMap.copyOf(getWithPostFilteringSync(tableRef, raw, x -> x), cellComparator);
            return postFiltered.entrySet().iterator();
        }));
    }


D:\_python\clone\CloneClassification\data_new\db\atlasdb\atlasdb-impl-shared\src\main\java\com\palantir\atlasdb\transaction\impl\SnapshotTransaction.java 255105
========================================================
