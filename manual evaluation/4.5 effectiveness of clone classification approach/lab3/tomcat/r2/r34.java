tomcat-main\java\org\apache\catalina\core\OpenSSLLifecycleListener.java    
public static boolean isAvailable() {
    // https://bz.apache.org/bugzilla/show_bug.cgi?id=48613
    if (OpenSSLStatus.isInstanceCreated()) {
        synchronized (lock) {
            if (!JreCompat.isJre22Available()) {
                OpenSSLStatus.setInitialized(true);
            } else {
                try {
                    Class<?> openSSLLibraryClass =
                            Class.forName("org.apache.tomcat.util.net.openssl.panama.OpenSSLLibrary");
                    openSSLLibraryClass.getMethod("init").invoke(null);
                } catch (Throwable t) {
                    Throwable throwable = ExceptionUtils.unwrapInvocationTargetException(t);
                    ExceptionUtils.handleThrowable(throwable);
                    log.error(sm.getString("openssllistener.sslInit"), throwable);
                }
            }
        }
    }
    return OpenSSLStatus.isAvailable();
}

/************************************************************************/
tomcat-main\java\org\apache\catalina\core\OpenSSLLifecycleListener.java
public void lifecycleEvent(LifecycleEvent event) {

    boolean initError = false;
    if (Lifecycle.BEFORE_INIT_EVENT.equals(event.getType())) {
        if (!(event.getLifecycle() instanceof Server)) {
            log.warn(sm.getString("listener.notServer", event.getLifecycle().getClass().getSimpleName()));
        }
        synchronized (lock) {
            if (!JreCompat.isJre22Available()) {
                log.info(sm.getString("openssllistener.java22"));
                OpenSSLStatus.setInitialized(true);
                return;
            }
            try {
                Class<?> openSSLLibraryClass =
                        Class.forName("org.apache.tomcat.util.net.openssl.panama.OpenSSLLibrary");
                openSSLLibraryClass.getMethod("init").invoke(null);
            } catch (Throwable t) {
                Throwable throwable = ExceptionUtils.unwrapInvocationTargetException(t);
                ExceptionUtils.handleThrowable(throwable);
                log.error(sm.getString("openssllistener.sslInit"), throwable);
                initError = true;
            }
            // Failure to initialize FIPS mode is fatal
            if (!(null == getFIPSMode() || "off".equalsIgnoreCase(getFIPSMode())) && !isFIPSModeActive()) {
                String errorMessage = sm.getString("openssllistener.initializeFIPSFailed");
                Error e = new Error(errorMessage);
                // Log here, because thrown error might be not logged
                log.fatal(errorMessage, e);
                initError = true;
            }
        }
    }
    if (initError || Lifecycle.AFTER_DESTROY_EVENT.equals(event.getType())) {
        synchronized (lock) {
            if (!JreCompat.isJre22Available()) {
                return;
            }
            // Note: Without the listener, destroy will never be called (which is not a significant problem)
            try {
                Class<?> openSSLLibraryClass =
                        Class.forName("org.apache.tomcat.util.net.openssl.panama.OpenSSLLibrary");
                openSSLLibraryClass.getMethod("destroy").invoke(null);
            } catch (Throwable t) {
                Throwable throwable = ExceptionUtils.unwrapInvocationTargetException(t);
                ExceptionUtils.handleThrowable(throwable);
                log.info(sm.getString("openssllistener.destroy"));
            }
        }
    }

}

