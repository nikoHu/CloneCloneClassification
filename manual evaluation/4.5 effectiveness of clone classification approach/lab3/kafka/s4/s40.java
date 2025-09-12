kafka-trunk/clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java

    private void transitionToAbortableErrorOrFatalError(
        RuntimeException abortableException,
        RuntimeException fatalException
    ) {
        if (canHandleAbortableError()) {
            if (needToTriggerEpochBumpFromClient())
                clientSideEpochBumpRequired = true;
            transitionToAbortableError(abortableException);
        } else {
            transitionToFatalError(fatalException);
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java
        void abortableErrorIfPossible(RuntimeException e) {
            if (canHandleAbortableError()) {
                if (needToTriggerEpochBumpFromClient())
                    clientSideEpochBumpRequired = true;
                abortableError(e);
            } else {
                fatalError(e);
            }
        }



/************************************************************************/
