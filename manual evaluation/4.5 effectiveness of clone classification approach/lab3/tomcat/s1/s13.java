tomcat-main\java\org\apache\catalina\core\StandardContext.java    
public void setConfigured(boolean configured) {

    boolean oldConfigured = this.configured;
    this.configured = configured;
    support.firePropertyChange("configured", oldConfigured, this.configured);

}

/************************************************************************/
tomcat-main\java\org\apache\catalina\core\StandardContext.java
public void setPrivileged(boolean privileged) {

    boolean oldPrivileged = this.privileged;
    this.privileged = privileged;
    support.firePropertyChange("privileged", oldPrivileged, this.privileged);

}


