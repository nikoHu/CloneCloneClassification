
    public record Entry(int index, double value) implements Comparable<Entry> {
        @Override
        public String toString() {
            return String.format("%d:%s", index, Strings.format(value));
        }

        @Override
        public int compareTo(Entry o) {
            return Double.compare(value, o.value);
        }
    }


D:\_python\clone\CloneClassification\data_new\algorithm\smile\base\src\main\java\smile\util\SparseArray.java 3302
========================================================

    public record Entry(int index, int value) implements Comparable<Entry> {
        @Override
        public String toString() {
            return String.format("%d:%d", index, value);
        }

        @Override
        public int compareTo(Entry o) {
            return Double.compare(value, o.value);
        }
    }


D:\_python\clone\CloneClassification\data_new\algorithm\smile\base\src\main\java\smile\util\SparseIntArray.java 3331
========================================================
