tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebRuleSet.java    
    public void testSingleNameInWebFragmentXml() throws Exception {

        WebXml webXml = new WebXml();

        parse(webXml, "web-fragment-1name.xml", true, true);
        Assert.assertEquals("name1", webXml.getName());
    }


/************************************************************************/
tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebRuleSet.java
    public void testSingleOrderingInWebFragmentXml() throws Exception {

        WebXml webXml = new WebXml();

        parse(webXml, "web-fragment-1ordering.xml", true, true);
        Assert.assertEquals(1, webXml.getBeforeOrdering().size());
        Assert.assertTrue(webXml.getBeforeOrdering().contains("bar"));
    }


