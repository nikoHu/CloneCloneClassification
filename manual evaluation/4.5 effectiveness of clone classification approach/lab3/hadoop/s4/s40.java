hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-common/src/main/java/org/apache/hadoop/yarn/server/federation/cache/FederationGuavaCache.java
public void initCache(Configuration pConf, FederationStateStore pStateStore) {
    // Picking the JCache provider from classpath, need to make sure there's
    // no conflict or pick up a specific one in the future.
    cacheTimeToLive = pConf.getInt(YarnConfiguration.FEDERATION_CACHE_TIME_TO_LIVE_SECS,
            YarnConfiguration.DEFAULT_FEDERATION_CACHE_TIME_TO_LIVE_SECS);
    cacheEntityNums = pConf.getLong(YarnConfiguration.FEDERATION_CACHE_ENTITY_NUMS,
            YarnConfiguration.DEFAULT_FEDERATION_CACHE_ENTITY_NUMS);
    if (cacheTimeToLive <= 0) {
        isCachingEnabled = false;
        return;
    }
    this.setStateStore(pStateStore);

    // Initialize Cache.
    LOG.info("Creating a JCache Manager with name {}. " +
                    "Cache TTL Time = {} secs. Cache Entity Nums = {}.", className, cacheTimeToLive,
            cacheEntityNums);
    cache = CacheBuilder.newBuilder().expireAfterWrite(cacheTimeToLive,
            TimeUnit.SECONDS).maximumSize(cacheEntityNums).build();
    isCachingEnabled = true;
}


/************************************************************************/
hadoop-trunk/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-common/src/main/java/org/apache/hadoop/yarn/server/federation/cache/FederationJCache.java
public void initCache(Configuration pConf, FederationStateStore pStateStore) {
    // Picking the JCache provider from classpath, need to make sure there's
    // no conflict or pick up a specific one in the future
    cacheTimeToLive = pConf.getInt(YarnConfiguration.FEDERATION_CACHE_TIME_TO_LIVE_SECS,
            YarnConfiguration.DEFAULT_FEDERATION_CACHE_TIME_TO_LIVE_SECS);
    cacheEntityNums = pConf.getLong(YarnConfiguration.FEDERATION_CACHE_ENTITY_NUMS,
            YarnConfiguration.DEFAULT_FEDERATION_CACHE_ENTITY_NUMS);
    if (cacheTimeToLive <= 0) {
        isCachingEnabled = false;
        return;
    }
    this.setStateStore(pStateStore);
    CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build(true);

    if (this.cache == null) {
        LOG.info("Creating a JCache Manager with name {}. " +
                        "Cache TTL Time = {} secs. Cache Entity Nums = {}.", className, cacheTimeToLive,
                cacheEntityNums);
        // Set the number of caches
        ResourcePoolsBuilder poolsBuilder = ResourcePoolsBuilder.heap(cacheEntityNums);
        ExpiryPolicy expiryPolicy = ExpiryPolicyBuilder.timeToLiveExpiration(
                Duration.ofSeconds(cacheTimeToLive));
        CacheConfigurationBuilder<String, CacheRequest> configurationBuilder =
                CacheConfigurationBuilder.newCacheConfigurationBuilder(
                                String.class, CacheRequest.class, poolsBuilder)
                        .withExpiry(expiryPolicy);
        cache = cacheManager.createCache(className, configurationBuilder);
    }
    isCachingEnabled = true;
}
