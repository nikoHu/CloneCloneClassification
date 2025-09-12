
	public static double[] intToDoubleArray(
		final int[] array,
		final IntToDoubleFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final double[] result = new double[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsDouble(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5393
========================================================

	public static double[] longToDoubleArray(
		final long[] array,
		final LongToDoubleFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final double[] result = new double[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsDouble(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5395
========================================================
