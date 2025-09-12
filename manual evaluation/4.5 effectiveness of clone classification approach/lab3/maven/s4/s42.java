maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng1491ReactorArtifactIdCollisionTest.java
public void testitMNG1491() throws Exception {
    File testDir = extractResources("/mng-1491");

    Verifier verifier = newVerifier(testDir.getAbsolutePath());
    verifier.setAutoclean(false);

    try {
        verifier.addCliArgument("initialize");
        verifier.execute();

        verifier.verifyErrorFreeLog();

        fail("Build should fail due to duplicate artifactId's in the reactor.");
    } catch (VerificationException e) {
        // expected.
    }
}
/************************************************************************/
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng3645POMSyntaxErrorTest.java
public void testit() throws Exception {
    File testDir = extractResources("/mng-3645");

    Verifier verifier = newVerifier(testDir.getAbsolutePath());
    verifier.setAutoclean(false);

    try {
        verifier.addCliArgument("validate");
        verifier.execute();
        verifier.verifyErrorFreeLog();

        fail(
                "Should fail to validate the POM syntax due to missing dependency element inside dependencyManagement section.");
    } catch (VerificationException e) {
        // expect this.
    }
}

/************************************************************************/
maven-master\its\core-it-suite\src\test\java\org\apache\maven\it\MavenITmng4644StrictPomParsingRejectsMisplacedTextTest.java 781
public void testit() throws Exception {
    File testDir = extractResources("/mng-4644");

    Verifier verifier = newVerifier(testDir.getAbsolutePath());
    verifier.setAutoclean(false);
    try {
        verifier.addCliArgument("validate");
        verifier.execute();
        verifier.verifyErrorFreeLog();

        fail("Should fail to validate the POM syntax due to misplaced text in <project> element.");
    } catch (VerificationException e) {
        // expected
    }
}
