
        static {
            try {
                U = Unsafe.getUnsafe();
                Class<?> k = TreeBin.class;
                LOCKSTATE = U.objectFieldOffset
                        (k.getDeclaredField("lockState"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }


D:\_python\clone\CloneClassification\data_new\db\questdb\core\src\main\java\io\questdb\std\ConcurrentHashMap.java 223511
========================================================

        static {
            try {
                U = Unsafe.getUnsafe();
                Class<?> k = TreeBin.class;
                LOCKSTATE = U.objectFieldOffset
                        (k.getDeclaredField("lockState"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }


D:\_python\clone\CloneClassification\data_new\db\questdb\core\src\main\java\io\questdb\std\ConcurrentLongHashMap.java 224312
========================================================
