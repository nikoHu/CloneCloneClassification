
  public static SnapshottableDirectoryStatus[] toSnapshottableDirectoryList(
      final Map<?, ?> json) {
    if (json == null) {
      return null;
    }
    List<?> list = (List<?>) json.get("SnapshottableDirectoryList");
    if (list == null) {
      return null;
    }
    SnapshottableDirectoryStatus[] statuses =
        new SnapshottableDirectoryStatus[list.size()];
    for (int i = 0; i < list.size(); i++) {
      statuses[i] = toSnapshottableDirectoryStatus((Map<?, ?>) list.get(i));
    }
    return statuses;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-client\src\main\java\org\apache\hadoop\hdfs\web\JsonUtilClient.java 47606
========================================================

  public static SnapshotStatus[] toSnapshotList(final Map<?, ?> json) {
    if (json == null) {
      return null;
    }
    List<?> list = (List<?>) json.get("SnapshotList");
    if (list == null) {
      return null;
    }
    SnapshotStatus[] statuses =
        new SnapshotStatus[list.size()];
    for (int i = 0; i < list.size(); i++) {
      statuses[i] = toSnapshotStatus((Map<?, ?>) list.get(i));
    }
    return statuses;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-client\src\main\java\org\apache\hadoop\hdfs\web\JsonUtilClient.java 47608
========================================================
