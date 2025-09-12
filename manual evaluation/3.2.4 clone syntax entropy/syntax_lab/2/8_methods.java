
  public static Collection<BlockStoragePolicy> getStoragePolicies(
      Map<?, ?> json) {
    Map<?, ?> policiesJson = (Map<?, ?>) json.get("BlockStoragePolicies");
    if (policiesJson != null) {
      List<?> objs = (List<?>) policiesJson.get(BlockStoragePolicy.class
          .getSimpleName());
      if (objs != null) {
        BlockStoragePolicy[] storagePolicies = new BlockStoragePolicy[objs
            .size()];
        for (int i = 0; i < objs.size(); i++) {
          final Map<?, ?> m = (Map<?, ?>) objs.get(i);
          BlockStoragePolicy blockStoragePolicy = toBlockStoragePolicy(m);
          storagePolicies[i] = blockStoragePolicy;
        }
        return Arrays.asList(storagePolicies);
      }
    }
    return new ArrayList<BlockStoragePolicy>(0);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-client\src\main\java\org\apache\hadoop\hdfs\web\JsonUtilClient.java 47589
========================================================

  public static Collection<FileStatus> getTrashRoots(Map<?, ?> json) {
    List<?> objs = (List<?>) json.get("Paths");
    if (objs != null) {
      FileStatus[] trashRoots = new FileStatus[objs.size()];
      for (int i = 0; i < objs.size(); i++) {
        Map<?, ?> m = (Map<?, ?>) objs.get(i);
        trashRoots[i] = toFileStatus(m);
      }
      return Arrays.asList(trashRoots);
    }
    return new ArrayList<FileStatus>(0);
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-hdfs-project\hadoop-hdfs-client\src\main\java\org\apache\hadoop\hdfs\web\JsonUtilClient.java 47599
========================================================
