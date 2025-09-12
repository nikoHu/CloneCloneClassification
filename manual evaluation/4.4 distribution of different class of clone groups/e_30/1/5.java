
	public static int[] longToIntArray(
		final long[] array,
		final LongToIntFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final int[] result = new int[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsInt(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5394
========================================================

	public static int[] doubleToIntArray(
		final double[] array,
		final DoubleToIntFunction mapper
	) {
		requireNonNull(array);
		requireNonNull(mapper);

		final int[] result = new int[array.length];
		for (int i = 0; i < array.length; ++i) {
			result[i] = mapper.applyAsInt(array[i]);
		}
		return result;
	}


D:\_python\clone\CloneClassification\data_new\algorithm\jenetics\jenetics\src\main\java\io\jenetics\util\Conversions.java 5396
========================================================
