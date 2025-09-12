hadoop-trunk/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-jobclient/src/test/java/org/apache/hadoop/mapreduce/GenericMRLoadGenerator.java
protected void emit(K key, V val, Context context)
        throws IOException, InterruptedException {
    ++total;
    while((float) kept / total < keep) {
        ++kept;
        context.write(key, val);
    }
}


/*********************************************************************/
hadoop-trunk/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-jobclient/src/test/java/org/apache/hadoop/mapreduce/GenericMRLoadGenerator.java
protected void emit(K key, V val, Context context)
        throws IOException, InterruptedException {
    ++total;
    while((float) kept / total < keep) {
        ++kept;
        context.write(key, val);
    }
}




