maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng4305LocalRepoBasedirTest.java 
public void testit() throws Exception {
    File testDir = extractResources("/mng-4305");

    Verifier verifier = newVerifier(testDir.getAbsolutePath());
    verifier.setAutoclean(false);
    verifier.deleteDirectory("target");
    verifier.addCliArgument("validate");
    verifier.execute();
    verifier.verifyErrorFreeLog();

    Properties props = verifier.loadProperties("target/basedir.properties");

    // NOTE: This deliberately compares the paths on the String level, not via File.equals()
    assertEquals(
            new File(verifier.getLocalRepository()).getAbsolutePath(), props.getProperty("localRepositoryBasedir"));
}
========================================================
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng5012CollectionVsArrayParamCoercionTest.java 855
public void testit() throws Exception {
    File testDir = extractResources("/mng-5012");

    Verifier verifier = newVerifier(testDir.getAbsolutePath());
    verifier.setAutoclean(false);
    verifier.deleteDirectory("target");
    verifier.addCliArgument("validate");
    verifier.execute();
    verifier.verifyErrorFreeLog();

    Properties props = verifier.loadProperties("target/config.properties");
    assertEquals(
            new File(testDir, "src/main/java").getCanonicalFile(),
            new File(props.getProperty("stringParams.0")).getCanonicalFile());
}

