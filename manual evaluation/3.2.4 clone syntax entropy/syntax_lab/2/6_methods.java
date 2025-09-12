   */
  private void logLineFromProcsFile(File cgf) {
    String str;
    if (LOG.isDebugEnabled()) {
      try (BufferedReader inl =
               new BufferedReader(new InputStreamReader(
                   Files.newInputStream(Paths.get(cgf + Path.SEPARATOR + CGROUP_PROCS_FILE)),
                   StandardCharsets.UTF_8))) {
        str = inl.readLine();
        if (str != null) {
          LOG.debug("First line in cgroup tasks file: {} {}", cgf, str);
        }
      } catch (IOException e) {
        LOG.warn("Failed to read cgroup tasks file. ", e);
      }
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-nodemanager\src\main\java\org\apache\hadoop\yarn\server\nodemanager\containermanager\linux\resources\AbstractCGroupsHandler.java 56092
========================================================
   */
  private void logLineFromTasksFile(File cgf) {
    String str;
    if (LOG.isDebugEnabled()) {
      try (BufferedReader inl =
            new BufferedReader(new InputStreamReader(new FileInputStream(cgf
              + "/tasks"), StandardCharsets.UTF_8))) {
        str = inl.readLine();
        if (str != null) {
          LOG.debug("First line in cgroup tasks file: {} {}", cgf, str);
        }
      } catch (IOException e) {
        LOG.warn("Failed to read cgroup tasks file. ", e);
      }
    }
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-nodemanager\src\main\java\org\apache\hadoop\yarn\server\nodemanager\util\CgroupsLCEResourcesHandler.java 56351
========================================================
