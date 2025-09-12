maven-master\its\core-it-suite\src\test\resources\mng-3703\maven-mng3703-plugin\src\main\java\jar\AbstractCheckMojo.java
private void checkListOfPaths(List paths, String base, String label, Map failedPaths) {
    if (paths != null && !paths.isEmpty()) {
        for (int i = 0; i < paths.size(); i++) {
            String root = (String) paths.get(i);
            if (!root.startsWith(base)) {
                failedPaths.put(label + "[" + i + "]", root);
            }
        }
    }
}

/************************************************************************/
maven-master\its\core-it-suite\src\test\resources\mng-3703\maven-mng3703-plugin\src\main\java\jar\CheckReport.java
private void checkListOfPaths(List paths, String base, String label, Map failedPaths) {
    if (paths != null && !paths.isEmpty()) {
        for (int i = 0; i < paths.size(); i++) {
            String root = (String) paths.get(i);
            if (!root.startsWith(base)) {
                failedPaths.put(label + "[" + i + "]", root);
            }
        }
    }
}

