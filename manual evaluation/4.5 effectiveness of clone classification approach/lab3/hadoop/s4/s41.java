hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\async\utils\AsyncApplyFunction.java
default CompletableFuture<R> apply(CompletableFuture<T> in) {
    return in.thenCompose(t -> {
        try {
        return async(t);
        } catch (IOException e) {
        throw warpCompletionException(e);
        }
    });
}
/************************************************************************/
hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-rbf\src\main\java\org\apache\hadoop\hdfs\server\federation\router\async\utils\AsyncApplyFunction.java
default CompletableFuture<R> apply(CompletableFuture<T> in, Executor executor) {
    return in.thenComposeAsync(t -> {
        try {
        return async(t);
        } catch (IOException e) {
        throw warpCompletionException(e);
        }
    }, executor);
}



