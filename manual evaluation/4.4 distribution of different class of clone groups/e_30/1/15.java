
	public static long[] intToLongArray(
		final int[] array,
		final IntToLongFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final long[] result = new long[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsLong(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5392
========================================================

	public static long[] doubleToLongArray(
		final double[] array,
		final DoubleToLongFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final long[] result = new long[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsLong(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5397
========================================================
