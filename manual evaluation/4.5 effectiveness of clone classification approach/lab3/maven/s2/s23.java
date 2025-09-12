maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng6562WarnDefaultBindings.java
public void testItShouldNotWarn() throws Exception {
    File testDir = extractResources("/mng-6562-default-bindings");

    String phase = "validate";
    Verifier verifier = newVerifier(testDir.getAbsolutePath(), false);
    verifier.setAutoclean(false);
    verifier.setLogFileName(phase + ".txt");
    verifier.addCliArgument("-fos");
    verifier.addCliArgument("WARN"); // ALSO NO WARNINGS
    verifier.addCliArgument(phase);
    verifier.execute();

    verifier.verifyErrorFreeLog();
}


/************************************************************************/
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng6562WarnDefaultBindings.java   
public void testItShouldNotWarn2() throws Exception {
    File testDir = extractResources("/mng-6562-default-bindings");

    String phase = "process-resources";
    Verifier verifier = newVerifier(testDir.getAbsolutePath(), false);
    verifier.setAutoclean(false);
    verifier.setLogFileName(phase + ".txt");
    verifier.addCliArgument("-fos");
    verifier.addCliArgument("WARN"); // ALSO NO WARNINGS
    verifier.addCliArgument(phase);
    verifier.execute();

    verifier.verifyErrorFreeLog();
}



