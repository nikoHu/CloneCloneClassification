
    public long getLastJobBegin() { 
        long when = -1;
        for (JobQueueRunner runner : _queueRunners.values()) {
            long cur = runner.getLastBegin();
            if (cur > when)
                when = cur;
        }
        return when; 
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\router\java\src\net\i2p\router\JobQueue.java 336755
========================================================

    public long getLastJobEnd() { 
        long when = -1;
        for (JobQueueRunner runner : _queueRunners.values()) {
            long cur = runner.getLastEnd();
            if (cur > when)
                when = cur;
        }
        return when; 
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\router\java\src\net\i2p\router\JobQueue.java 336756
========================================================
