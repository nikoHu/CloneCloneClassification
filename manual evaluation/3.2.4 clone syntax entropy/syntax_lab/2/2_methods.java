   */
  public static String addUUID(String pathStr, String uuid) {
    Preconditions.checkArgument(StringUtils.isNotEmpty(pathStr), "empty path");
    Preconditions.checkArgument(StringUtils.isNotEmpty(uuid), "empty uuid");
    // In some cases, Spark will add the UUID to the filename itself.
    if (pathStr.contains(uuid)) {
      return pathStr;
    }

    int dot; // location of the first '.' in the file name
    int lastSlash = pathStr.lastIndexOf('/');
    if (lastSlash >= 0) {
      Preconditions.checkState(lastSlash + 1 < pathStr.length(),
          "Bad path: " + pathStr);
      dot = pathStr.indexOf('.', lastSlash);
    } else {
      dot = pathStr.indexOf('.');
    }

    if (dot >= 0) {
      return pathStr.substring(0, dot) + "-" + uuid + pathStr.substring(dot);
    } else {
      return pathStr + "-" + uuid;
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-tools\hadoop-aws\src\main\java\org\apache\hadoop\fs\s3a\commit\staging\Paths.java 70536
========================================================
   */
  public static String getParent(String pathStr) {
    int lastSlash = pathStr.lastIndexOf('/');
    if (lastSlash >= 0) {
      return pathStr.substring(0, lastSlash);
    }
    return null;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-tools\hadoop-aws\src\main\java\org\apache\hadoop\fs\s3a\commit\staging\Paths.java 70537
========================================================
