
  default DoubleColumn remainder(DoubleColumn column2) {
    DoubleColumn result = DoubleColumn.create(name() + " % " + column2.name(), size());
    for (int r = 0; r < size(); r++) {
      double val1 = getDouble(r);
      double val2 = column2.getDouble(r);
      if (DoubleColumnType.valueIsMissing(val1) || DoubleColumnType.valueIsMissing(val2)) {
        result.setMissing(r);
      } else {
        result.set(r, getDouble(r) % column2.getDouble(r));
      }
    }
    return result;
  }


D:\_python\clone\CloneClassification\data_new\android\symja_android_library\symja_android_library\matheclipse-io\src\main\java\tech\tablesaw\columns\numbers\NumberMapFunctions.java 133736
========================================================

  default DoubleColumn remainder(double val2) {
    DoubleColumn result = DoubleColumn.create(name() + " % " + val2, size());
    for (int r = 0; r < size(); r++) {
      double val1 = getDouble(r);
      if (DoubleColumnType.valueIsMissing(val1) || DoubleColumnType.valueIsMissing(val2)) {
        result.setMissing(r);
      } else {
        result.set(r, getDouble(r) % val2);
      }
    }
    return result;
  }


D:\_python\clone\CloneClassification\data_new\android\symja_android_library\symja_android_library\matheclipse-io\src\main\java\tech\tablesaw\columns\numbers\NumberMapFunctions.java 133737
========================================================
