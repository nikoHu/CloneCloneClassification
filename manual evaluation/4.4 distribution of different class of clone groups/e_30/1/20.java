

        @Override
        public boolean tryLock(long timeout, TimeUnit unit)
                throws InterruptedException {
            trySpin();
            if(super.tryLock(timeout, unit)) {
                forceSpin = false;
                return true;
            }
            else {
                return false;
            }
        }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\concurrent\PriorityReadWriteLock.java 287447
========================================================

        @Override
        public boolean tryLock(long timeout, TimeUnit unit)
                throws InterruptedException {
            trySpin();
            if(super.tryLock(timeout, unit)) {
                forceSpin = false;
                return true;
            }
            else {
                return false;
            }
        }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\concurrent\PriorityReadWriteLock.java 287448
========================================================
