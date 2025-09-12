
        public double[] solve(double[] b) {
            BigMatrix x = BigMatrix.column(b);
            solve(x);

            double[] y = new double[b.length];
            x.A.get(y);
            return y;
        }


D:\_python\clone\CloneClassification\data_new\algorithm\smile\base\src\main\java\smile\math\matrix\BigMatrix.java 2747
========================================================

        public double[] solve(double[] b) {
            BigMatrix x = BigMatrix.column(b);
            solve(x);

            double[] y = new double[b.length];
            x.A.get(y);
            return y;
        }


D:\_python\clone\CloneClassification\data_new\algorithm\smile\base\src\main\java\smile\math\matrix\BigMatrix.java 2751
========================================================
