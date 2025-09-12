hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/RetouchedBloomFilter.java

public void add(Key key) {
    if (key == null) {
        throw new NullPointerException("key can not be null");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for (int i = 0; i < nbHash; i++) {
        bits.set(h[i]);
        keyVector[h[i]].add(key);
    }
}



/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/RetouchedBloomFilter.java

public void addFalsePositive(Key key) {
    if (key == null) {
        throw new NullPointerException("key can not be null");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for (int i = 0; i < nbHash; i++) {
        fpVector[h[i]].add(key);
    }
}



/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/CountingBloomFilter.java

public void add(Key key) {
    if(key == null) {
        throw new NullPointerException("key can not be null");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for(int i = 0; i < nbHash; i++) {
        // find the bucket
        int wordNum = h[i] >> 4;          // div 16
        int bucketShift = (h[i] & 0x0f) << 2;  // (mod 16) * 4

        long bucketMask = 15L << bucketShift;
        long bucketValue = (buckets[wordNum] & bucketMask) >>> bucketShift;

        // only increment if the count in the bucket is less than BUCKET_MAX_VALUE
        if(bucketValue < BUCKET_MAX_VALUE) {
            // increment by 1
            buckets[wordNum] = (buckets[wordNum] & ~bucketMask) | ((bucketValue + 1) << bucketShift);
        }
    }
}



/******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/CountingBloomFilter.java

public void delete(Key key) {
    if(key == null) {
        throw new NullPointerException("Key may not be null");
    }
    if(!membershipTest(key)) {
        throw new IllegalArgumentException("Key is not a member");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for(int i = 0; i < nbHash; i++) {
        // find the bucket
        int wordNum = h[i] >> 4;          // div 16
        int bucketShift = (h[i] & 0x0f) << 2;  // (mod 16) * 4

        long bucketMask = 15L << bucketShift;
        long bucketValue = (buckets[wordNum] & bucketMask) >>> bucketShift;

        // only decrement if the count in the bucket is between 0 and BUCKET_MAX_VALUE
        if(bucketValue >= 1 && bucketValue < BUCKET_MAX_VALUE) {
            // decrement by 1
            buckets[wordNum] = (buckets[wordNum] & ~bucketMask) | ((bucketValue - 1) << bucketShift);
        }
    }
}



/*******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/CountingBloomFilter.java

public boolean membershipTest(Key key) {
    if(key == null) {
        throw new NullPointerException("Key may not be null");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for(int i = 0; i < nbHash; i++) {
        // find the bucket
        int wordNum = h[i] >> 4;          // div 16
        int bucketShift = (h[i] & 0x0f) << 2;  // (mod 16) * 4

        long bucketMask = 15L << bucketShift;

        if((buckets[wordNum] & bucketMask) == 0) {
            return false;
        }
    }

    return true;
}



/*******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/CountingBloomFilter.java

public int approximateCount(Key key) {
    int res = Integer.MAX_VALUE;
    int[] h = hash.hash(key);
    hash.clear();
    for (int i = 0; i < nbHash; i++) {
        // find the bucket
        int wordNum = h[i] >> 4;          // div 16
        int bucketShift = (h[i] & 0x0f) << 2;  // (mod 16) * 4

        long bucketMask = 15L << bucketShift;
        long bucketValue = (buckets[wordNum] & bucketMask) >>> bucketShift;
        if (bucketValue < res) res = (int)bucketValue;
    }
    if (res != Integer.MAX_VALUE) {
        return res;
    } else {
        return 0;
    }
}



/*******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/BloomFilter.java

public void add(Key key) {
    if(key == null) {
        throw new NullPointerException("key cannot be null");
    }

    int[] h = hash.hash(key);
    hash.clear();

    for(int i = 0; i < nbHash; i++) {
        bits.set(h[i]);
    }
}



/*****************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/bloom/BloomFilter.java

public boolean membershipTest(Key key) {
    if(key == null) {
        throw new NullPointerException("key cannot be null");
    }

    int[] h = hash.hash(key);
    hash.clear();
    for(int i = 0; i < nbHash; i++) {
        if(!bits.get(h[i])) {
            return false;
        }
    }
    return true;
}


