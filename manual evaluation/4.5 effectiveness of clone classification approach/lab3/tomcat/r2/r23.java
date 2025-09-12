tomcat-main\java\org\apache\catalina\valves\ExtendedAccessLogValve.java  
protected AccessLogElement getClientToServerElement(PatternTokenizer tokenizer) throws IOException {
    if (tokenizer.hasSubToken()) {
        String token = tokenizer.getToken();
        if ("method".equals(token)) {
            return new MethodElement();
        } else if ("uri".equals(token)) {
            if (tokenizer.hasSubToken()) {
                token = tokenizer.getToken();
                if ("stem".equals(token)) {
                    return new RequestURIElement();
                } else if ("query".equals(token)) {
                    return (buf, date, request, res, l) -> {
                        String query = request.getQueryString();
                        if (query != null) {
                            buf.append(query);
                        } else {
                            buf.append('-');
                        }
                    };
                }
            } else {
                return (buf, date, request, res, l) -> {
                    String query = request.getQueryString();
                    buf.append(request.getRequestURI());
                    if (query != null) {
                        buf.append('?');
                        buf.append(request.getQueryString());
                    }
                };
            }
        }
    } else if (tokenizer.hasParameter()) {
        String parameter = tokenizer.getParameter();
        if (parameter == null) {
            log.error(sm.getString("extendedAccessLogValve.noClosing"));
            return null;
        }
        return new RequestHeaderElement(parameter);
    }
    log.error(sm.getString("extendedAccessLogValve.decodeError", tokenizer.getRemains()));
    return null;
}

/************************************************************************/
tomcat-main\java\org\apache\catalina\valves\ExtendedAccessLogValve.java
protected AccessLogElement getServerToClientElement(PatternTokenizer tokenizer) throws IOException {
    if (tokenizer.hasSubToken()) {
        String token = tokenizer.getToken();
        if ("status".equals(token)) {
            return new HttpStatusCodeElement();
        } else if ("comment".equals(token)) {
            return new StringElement("?");
        }
    } else if (tokenizer.hasParameter()) {
        String parameter = tokenizer.getParameter();
        if (parameter == null) {
            log.error(sm.getString("extendedAccessLogValve.noClosing"));
            return null;
        }
        return new ResponseHeaderElement(parameter);
    }
    log.error(sm.getString("extendedAccessLogValve.decodeError", tokenizer.getRemains()));
    return null;
}

