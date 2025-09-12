tomcat-main\java\org\apache\coyote\http2\AbstractStream.java    
void incrementWindowSize(int increment) throws Http2Exception {
    windowAllocationLock.lock();
    try {
        // No need for overflow protection here.
        // Increment can't be more than Integer.MAX_VALUE and once windowSize
        // goes beyond 2^31-1 an error is triggered.
        windowSize += increment;

        if (log.isTraceEnabled()) {
            log.trace(sm.getString("abstractStream.windowSizeInc", getConnectionId(), getIdAsString(),
                    Integer.toString(increment), Long.toString(windowSize)));
        }

        if (windowSize > ConnectionSettingsBase.MAX_WINDOW_SIZE) {
            String msg = sm.getString("abstractStream.windowSizeTooBig", getConnectionId(), identifier,
                    Integer.toString(increment), Long.toString(windowSize));
            if (identifier.intValue() == 0) {
                throw new ConnectionException(msg, Http2Error.FLOW_CONTROL_ERROR);
            } else {
                throw new StreamException(msg, Http2Error.FLOW_CONTROL_ERROR, identifier.intValue());
            }
        }
    } finally {
        windowAllocationLock.unlock();
    }
}


/************************************************************************/
tomcat-main\java\org\apache\coyote\http2\AbstractStream.java
final void decrementWindowSize(int decrement) {
    windowAllocationLock.lock();
    try {
        // No need for overflow protection here. Decrement can never be larger
        // the Integer.MAX_VALUE and once windowSize goes negative no further
        // decrements are permitted
        windowSize -= decrement;
        if (log.isTraceEnabled()) {
            log.trace(sm.getString("abstractStream.windowSizeDec", getConnectionId(), getIdAsString(),
                    Integer.toString(decrement), Long.toString(windowSize)));
        }
    } finally {
        windowAllocationLock.unlock();
    }
}


