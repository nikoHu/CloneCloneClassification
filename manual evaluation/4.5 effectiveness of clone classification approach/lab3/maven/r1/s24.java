maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng7390SelectModuleOutsideCwdTest.java
public void testSelectModuleByCoordinate() throws Exception {
    final Verifier verifier = newVerifier(moduleADir.getAbsolutePath());

    verifier.addCliArgument("-pl");
    verifier.addCliArgument(":module-b");
    verifier.setLogFileName("log-module-by-coordinate.txt");
    verifier.addCliArgument("validate");
    verifier.execute();
    verifier.verifyFileNotPresent("target/touch.txt");
    verifier.verifyFileNotPresent("../target/touch.txt");
    verifier.verifyFilePresent("../module-b/target/touch.txt");
}
/************************************************************************/
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng7390SelectModuleOutsideCwdTest.java
public void testSelectModuleByRelativePath() throws Exception {
    final Verifier verifier = newVerifier(moduleADir.getAbsolutePath());

    verifier.addCliArgument("-pl");
    verifier.addCliArgument("../module-b");
    verifier.setLogFileName("log-module-by-relative-path.txt");
    verifier.addCliArgument("validate");
    verifier.execute();
    verifier.verifyFileNotPresent("target/touch.txt");
    verifier.verifyFileNotPresent("../target/touch.txt");
    verifier.verifyFilePresent("../module-b/target/touch.txt");
}


