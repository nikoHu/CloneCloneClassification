tomcat-main\java\org\apache\catalina\core\StandardContext.java    
    public void setClearReferencesStopThreads(boolean clearReferencesStopThreads) {

        boolean oldClearReferencesStopThreads = this.clearReferencesStopThreads;
        this.clearReferencesStopThreads = clearReferencesStopThreads;
        support.firePropertyChange("clearReferencesStopThreads", oldClearReferencesStopThreads,
                this.clearReferencesStopThreads);

    }

/************************************************************************/
tomcat-main\java\org\apache\catalina\core\StandardContext.java
    public void setClearReferencesStopTimerThreads(boolean clearReferencesStopTimerThreads) {

        boolean oldClearReferencesStopTimerThreads = this.clearReferencesStopTimerThreads;
        this.clearReferencesStopTimerThreads = clearReferencesStopTimerThreads;
        support.firePropertyChange("clearReferencesStopTimerThreads", oldClearReferencesStopTimerThreads,
                this.clearReferencesStopTimerThreads);
    }

