tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXml.java    
public void testMergeSessionCookieConfig04() {
    WebXml main = new WebXml();
    WebXml fragmentA = new WebXml();
    WebXml fragmentB = new WebXml();

    fragmentA.getSessionConfig().setCookieAttribute("aaa", "bbb");
    fragmentB.getSessionConfig().setCookieAttribute("AAA", "bbb");

    Set<WebXml> fragments = new HashSet<>();
    fragments.add(fragmentA);
    fragments.add(fragmentB);

    Assert.assertTrue(main.merge(fragments));
    Assert.assertEquals("bbb", main.getSessionConfig().getCookieAttribute("aAa"));
}


/************************************************************************/
tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXml.java
public void testMergeSessionCookieConfig05() {
    WebXml main = new WebXml();
    WebXml fragmentA = new WebXml();
    WebXml fragmentB = new WebXml();

    fragmentA.getSessionConfig().setCookieAttribute("aaa", "bBb");
    fragmentB.getSessionConfig().setCookieAttribute("AAA", "bbb");

    Set<WebXml> fragments = new HashSet<>();
    fragments.add(fragmentA);
    fragments.add(fragmentB);

    Assert.assertFalse(main.merge(fragments));
}

