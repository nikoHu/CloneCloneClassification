maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/event/ExecutionEventLogger.java

    @Override
    public void forkedProjectStarted(ExecutionEvent event) {
        if (logger.isInfoEnabled()
                && event.getMojoExecution().getForkedExecutions().size() > 1) {
            init();
            logger.info("");
            infoLine('>');

            infoMain("Forking " + event.getProject().getName() + " "
                    + event.getProject().getVersion());

            infoLine('>');
        }
    }



/************************************************************************/
maven-master/compat/maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java

    @Override
    public void forkedProjectStarted(ExecutionEvent event) {
        if (logger.isInfoEnabled()
                && event.getMojoExecution().getForkedExecutions().size() > 1) {
            init();
            logger.info("");
            infoLine('>');

            infoMain("Forking " + event.getProject().getName() + " "
                    + event.getProject().getVersion());

            infoLine('>');
        }
    }



/************************************************************************/
