

  protected static void updateByteBuffer(ByteBuffer buf, byte[] arr,
                                         int offset, int size) {
    if (USE_DIRECT_BUFFERS || (buf.hasArray() && buf.array() != arr)) {
      buf.position(offset);
      buf.put(arr, offset, size);
      buf.rewind();
    }
  }


D:\_python\clone\CloneClassification\data_new\android\processing-android\libs\processing-core\src\main\java\processing\opengl\PGL.java 104048
========================================================


  protected static void updateShortBuffer(ShortBuffer buf, short[] arr,
                                          int offset, int size) {
    if (USE_DIRECT_BUFFERS || (buf.hasArray() && buf.array() != arr)) {
      buf.position(offset);
      buf.put(arr, offset, size);
      buf.rewind();
    }
  }


D:\_python\clone\CloneClassification\data_new\android\processing-android\libs\processing-core\src\main\java\processing\opengl\PGL.java 104055
========================================================



  protected static void updateIntBuffer(IntBuffer buf, int[] arr,
                                        int offset, int size) {
     if (USE_DIRECT_BUFFERS || (buf.hasArray() && buf.array() != arr)) {
       buf.position(offset);
       buf.put(arr, offset, size);
       buf.rewind();
     }
   }


D:\_python\clone\CloneClassification\data_new\android\processing-android\libs\processing-core\src\main\java\processing\opengl\PGL.java 104062
========================================================


  protected static void updateFloatBuffer(FloatBuffer buf, float[] arr,
                                        int offset, int size) {
     if (USE_DIRECT_BUFFERS || (buf.hasArray() && buf.array() != arr)) {
       buf.position(offset);
       buf.put(arr, offset, size);
       buf.rewind();
     }
   }


D:\_python\clone\CloneClassification\data_new\android\processing-android\libs\processing-core\src\main\java\processing\opengl\PGL.java 104069
========================================================
