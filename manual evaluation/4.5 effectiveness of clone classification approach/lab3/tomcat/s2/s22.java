tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXml.java    
public void testParsePublicIdVersion22() {

    WebXml webxml = new WebXml();

    webxml.setPublicId(XmlIdentifiers.WEB_22_PUBLIC);
    Assert.assertEquals(2, webxml.getMajorVersion());
    Assert.assertEquals(2, webxml.getMinorVersion());
    Assert.assertEquals("2.2", webxml.getVersion());
}

/************************************************************************/
tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXml.java
public void testParsePublicIdVersion23() {

    WebXml webxml = new WebXml();

    webxml.setPublicId(XmlIdentifiers.WEB_23_PUBLIC);
    Assert.assertEquals(2, webxml.getMajorVersion());
    Assert.assertEquals(3, webxml.getMinorVersion());
    Assert.assertEquals("2.3", webxml.getVersion());
}

