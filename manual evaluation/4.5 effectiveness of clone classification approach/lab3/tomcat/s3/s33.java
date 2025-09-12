tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXmlOrdering.java    
public void testOrderWebFragmentsAbsolute() {
    app.addAbsoluteOrdering("c");
    app.addAbsoluteOrdering("a");
    app.addAbsoluteOrdering("b");
    app.addAbsoluteOrdering("e");
    app.addAbsoluteOrdering("d");

    Set<WebXml> ordered = WebXml.orderWebFragments(app, fragments, null);

    Iterator<WebXml> iter = ordered.iterator();
    Assert.assertEquals(c,iter.next());
    Assert.assertEquals(a,iter.next());
    Assert.assertEquals(b,iter.next());
    Assert.assertEquals(e,iter.next());
    Assert.assertEquals(d,iter.next());
    Assert.assertFalse(iter.hasNext());
}

/************************************************************************/
tomcat-main\test\org\apache\tomcat\util\descriptor\web\TestWebXmlOrdering.java
public void testOrderWebFragmentsAbsolutePartial() {
    app.addAbsoluteOrdering("c");
    app.addAbsoluteOrdering("a");

    Set<WebXml> ordered = WebXml.orderWebFragments(app, fragments, null);

    Iterator<WebXml> iter = ordered.iterator();
    Assert.assertEquals(c,iter.next());
    Assert.assertEquals(a,iter.next());
    Assert.assertFalse(iter.hasNext());
}

