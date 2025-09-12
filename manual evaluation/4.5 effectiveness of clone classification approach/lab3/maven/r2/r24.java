maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng3641ProfileActivationWarningTest.java 488
private String findWarning(List<String> logLines, String profileId) {
    Pattern pattern = Pattern.compile("(?i).*profile\\s.*\\Q" + profileId + "\\E.*\\snot\\s.*activated.*");

    for (String logLine : logLines) {
        if (pattern.matcher(logLine).matches()) {
            return logLine;
        }
    }

    return null;
}
/************************************************************************/
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng5608ProfileActivationWarningTest.java 909
private String findWarning(List<String> logLines, String profileId) {
    Pattern pattern =
            Pattern.compile("(?i).*Failed to interpolate file location ..project.basedir./pom.xml for profile "
                    + profileId + ": .*");

    for (String logLine : logLines) {
        if (pattern.matcher(logLine).matches()) {
            return logLine;
        }
    }

    return null;
}

