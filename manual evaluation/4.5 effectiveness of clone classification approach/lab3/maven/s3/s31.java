maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/event/ExecutionEventLogger.java

    @Override
    public void mojoSkipped(ExecutionEvent event) {
        if (logger.isWarnEnabled()) {
            init();
            logger.warn(
                    "Goal '{}' requires online mode for execution but Maven is currently offline, skipping",
                    event.getMojoExecution().getGoal());
        }
    }



/************************************************************************/
maven-master/compat/maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java

    @Override
    public void mojoSkipped(ExecutionEvent event) {
        if (logger.isWarnEnabled()) {
            init();
            logger.warn(
                    "Goal '{}' requires online mode for execution but Maven is currently offline, skipping",
                    event.getMojoExecution().getGoal());
        }
    }



/************************************************************************/
