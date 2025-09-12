tomcat-main\java\org\apache\catalina\servlets\CGIServlet.java        
private int getSCFromHttpStatusLine(String line) {
    int statusStart = line.indexOf(' ') + 1;

    if (statusStart < 1 || line.length() < statusStart + 3) {
        // Not a valid HTTP Status-Line
        log.warn(sm.getString("cgiServlet.runInvalidStatus", line));
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
    }

    String status = line.substring(statusStart, statusStart + 3);

    int statusCode;
    try {
        statusCode = Integer.parseInt(status);
    } catch (NumberFormatException nfe) {
        // Not a valid status code
        log.warn(sm.getString("cgiServlet.runInvalidStatus", status));
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
    }

    return statusCode;
}


/************************************************************************/
tomcat-main\java\org\apache\catalina\servlets\CGIServlet.java
private int getSCFromCGIStatusHeader(String value) {
    if (value.length() < 3) {
        // Not a valid status value
        log.warn(sm.getString("cgiServlet.runInvalidStatus", value));
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
    }

    String status = value.substring(0, 3);

    int statusCode;
    try {
        statusCode = Integer.parseInt(status);
    } catch (NumberFormatException nfe) {
        // Not a valid status code
        log.warn(sm.getString("cgiServlet.runInvalidStatus", status));
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
    }

    return statusCode;
}

