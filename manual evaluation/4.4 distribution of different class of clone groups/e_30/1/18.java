
    public static void copy(
            TransactionManager txManager,
            ExecutorService exec,
            TableReference srcTable,
            TableReference dstTable,
            int batchSize,
            int threadCount,
            @Output CopyStats stats)
            throws InterruptedException {
        copyExternal(
                exec,
                srcTable,
                dstTable,
                batchSize,
                threadCount,
                stats,
                (request, range) ->
                        txManager.runTaskWithRetry(tx -> copyInternal(tx, srcTable, dstTable, request, range)));
    }


D:\_python\clone\CloneClassification\data_new\db\atlasdb\atlasdb-impl-shared\src\main\java\com\palantir\atlasdb\table\common\TableTasks.java 254569
========================================================
    public static void copy(
            TransactionManager txManager,
            ExecutorService exec,
            Iterable<LockRefreshToken> lockTokens,
            final TableReference srcTable,
            final TableReference dstTable,
            int batchSize,
            int threadCount,
            @Output CopyStats stats)
            throws InterruptedException {
        copyExternal(
                exec,
                srcTable,
                dstTable,
                batchSize,
                threadCount,
                stats,
                (request, range) ->
                        txManager.runTaskWithRetry(tx -> copyInternal(tx, srcTable, dstTable, request, range)));
    }


D:\_python\clone\CloneClassification\data_new\db\atlasdb\atlasdb-impl-shared\src\main\java\com\palantir\atlasdb\table\common\TableTasks.java 254570
========================================================
