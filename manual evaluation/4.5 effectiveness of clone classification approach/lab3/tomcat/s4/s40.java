tomcat-main\java\org\apache\catalina\session\ManagerBase.java    
public HashMap<String,String> getSession(String sessionId) {
    Session s = sessions.get(sessionId);
    if (s == null) {
        if (log.isInfoEnabled()) {
            log.info(sm.getString("managerBase.sessionNotFound", sessionId));
        }
        return null;
    }

    Enumeration<String> ee = s.getSession().getAttributeNames();
    if (ee == null || !ee.hasMoreElements()) {
        return null;
    }

    HashMap<String,String> map = new HashMap<>();
    while (ee.hasMoreElements()) {
        String attrName = ee.nextElement();
        map.put(attrName, getSessionAttribute(sessionId, attrName));
    }

    return map;
}


/************************************************************************/
tomcat-main\java\org\apache\catalina\session\ManagerBase.java
public String getThisAccessedTime(String sessionId) {
    Session s = sessions.get(sessionId);
    if (s == null) {
        if (log.isInfoEnabled()) {
            log.info(sm.getString("managerBase.sessionNotFound", sessionId));
        }
        return "";
    }
    return new Date(s.getThisAccessedTime()).toString();
}


/************************************************************************/
tomcat-main\java\org\apache\catalina\session\ManagerBase.java
public String getLastAccessedTime(String sessionId) {
    Session s = sessions.get(sessionId);
    if (s == null) {
        if (log.isInfoEnabled()) {
            log.info(sm.getString("managerBase.sessionNotFound", sessionId));
        }
        return "";
    }
    return new Date(s.getLastAccessedTime()).toString();
}


/************************************************************************/
tomcat-main\java\org\apache\catalina\session\ManagerBase.java
public String getCreationTime(String sessionId) {
    Session s = sessions.get(sessionId);
    if (s == null) {
        if (log.isInfoEnabled()) {
            log.info(sm.getString("managerBase.sessionNotFound", sessionId));
        }
        return "";
    }
    return new Date(s.getCreationTime()).toString();
}


