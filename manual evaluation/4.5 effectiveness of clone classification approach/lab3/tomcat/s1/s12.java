tomcat-main\test\org\apache\catalina\connector\TestResponse.java    
public void testBug53469a() throws Exception {
    Request req = new TesterRequest();
    Response resp = new Response(null);
    resp.setRequest(req);

    String result = resp.encodeURL("../bar.html");

    Assert.assertEquals("../bar.html", result);
}

/************************************************************************/
tomcat-main\test\org\apache\catalina\connector\TestResponse.java
public void testBug53469b() throws Exception {
    Request req = new TesterRequest();
    Response resp = new Response(null);
    resp.setRequest(req);

    String result = resp.encodeURL("../../../../bar.html");

    Assert.assertEquals("../../../../bar.html", result);
}

