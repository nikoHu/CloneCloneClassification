maven-master/compat/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
    @Override
    public void retrieve(
            ArtifactRepository repository,
            File destination,
            String remotePath,
            ArtifactTransferListener transferListener)
            throws ArtifactTransferFailedException, ArtifactDoesNotExistException {
        try {
            wagonManager.getRemoteFile(
                    repository,
                    destination,
                    remotePath,
                    TransferListenerAdapter.newAdapter(transferListener),
                    ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN,
                    true);
        } catch (org.apache.maven.wagon.TransferFailedException e) {
            throw new ArtifactTransferFailedException(getMessage(e, "Error transferring artifact."), e);
        } catch (org.apache.maven.wagon.ResourceDoesNotExistException e) {
            throw new ArtifactDoesNotExistException(getMessage(e, "Requested artifact does not exist."), e);
        }
    }



/************************************************************************/
maven-master/compat/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

    @Override
    public void publish(
            ArtifactRepository repository, File source, String remotePath, ArtifactTransferListener transferListener)
            throws ArtifactTransferFailedException {
        try {
            wagonManager.putRemoteFile(
                    repository, source, remotePath, TransferListenerAdapter.newAdapter(transferListener));
        } catch (org.apache.maven.wagon.TransferFailedException e) {
            throw new ArtifactTransferFailedException(getMessage(e, "Error transferring artifact."), e);
        }
    }



/************************************************************************/
