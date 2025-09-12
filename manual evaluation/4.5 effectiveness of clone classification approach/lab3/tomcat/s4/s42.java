tomcat-main\java\org\apache\catalina\servlets\DefaultServlet.java   
protected boolean checkIfModifiedSince(HttpServletRequest request, HttpServletResponse response,
        WebResource resource) {

    String method = request.getMethod();
    if (!"GET".equals(method) && !"HEAD".equals(method)) {
        return true;
    }

    long resourceLastModified = resource.getLastModified();
    if (resourceLastModified <= 0) {
        // MUST ignore if the resource does not have a modification date available.
        return true;
    }

    // Must be at least one header for this method to be called
    Enumeration<String> headerEnum = request.getHeaders("If-Modified-Since");
    headerEnum.nextElement();
    if (headerEnum.hasMoreElements()) {
        // If-Modified-Since is a list of dates
        return true;
    }

    try {
        // Header is present so -1 will be not returned. Only a valid date or an IAE are possible.
        long headerValue = request.getDateHeader("If-Modified-Since");
        if (resourceLastModified < (headerValue + 1000)) {
            // The entity has not been modified since the date
            // specified by the client. This is not an error case.
            response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
            response.setHeader("ETag", generateETag(resource));
            return false;
        }
    } catch (IllegalArgumentException illegalArgument) {
        return true;
    }
    return true;
}


/************************************************************************/
tomcat-main\java\org\apache\catalina\servlets\DefaultServlet.java
protected boolean checkIfUnmodifiedSince(HttpServletRequest request, HttpServletResponse response,
        WebResource resource) throws IOException {

    long resourceLastModified = resource.getLastModified();
    if (resourceLastModified <= 0) {
        // MUST ignore if the resource does not have a modification date available.
        return true;
    }
    // Must be at least one header for this method to be called
    Enumeration<String> headerEnum = request.getHeaders("If-Unmodified-Since");
    headerEnum.nextElement();
    if (headerEnum.hasMoreElements()) {
        // If-Unmodified-Since is a list of dates
        return true;
    }

    try {
        // Header is present so -1 will be not returned. Only a valid date or an IAE are possible.
        long headerValue = request.getDateHeader("If-Unmodified-Since");
        if (resourceLastModified >= (headerValue + 1000)) {
            // The entity has not been modified since the date
            // specified by the client. This is not an error case.
            response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
            return false;
        }
    } catch (IllegalArgumentException illegalArgument) {
        return true;
    }
    return true;
}


