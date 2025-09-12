
  public static final NumericAggregateFunction mean =
      new NumericAggregateFunction("Mean") {

        @Override
        public Double summarize(NumericColumn<?> column) {
          return StatUtils.mean(removeMissing(column));
        }
      };


D:\_python\clone\CloneClassification\data_new\android\symja_android_library\symja_android_library\matheclipse-io\src\main\java\tech\tablesaw\aggregate\AggregateFunctions.java 133927
========================================================

  public static final NumericAggregateFunction geometricMean =
      new NumericAggregateFunction("Geometric Mean") {

        @Override
        public Double summarize(NumericColumn<?> column) {
          return StatUtils.geometricMean(removeMissing(column));
        }
      };


D:\_python\clone\CloneClassification\data_new\android\symja_android_library\symja_android_library\matheclipse-io\src\main\java\tech\tablesaw\aggregate\AggregateFunctions.java 133940
========================================================
