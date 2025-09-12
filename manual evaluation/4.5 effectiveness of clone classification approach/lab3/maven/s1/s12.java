maven-master/compat/maven-compat/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java

    public ResolutionGroup retrieve(
            Artifact artifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            boolean resolveManagedVersions)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
        injectSession(request);
        request.setArtifact(artifact);
        request.setLocalRepository(localRepository);
        request.setRemoteRepositories(remoteRepositories);
        request.setResolveManagedVersions(resolveManagedVersions);
        return retrieve(request);
    }



/************************************************************************/
maven-master/compat/maven-compat/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java

    @Override
    public List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
        injectSession(request);
        request.setArtifact(artifact);
        request.setLocalRepository(localRepository);
        request.setRemoteRepositories(remoteRepositories);
        return retrieveAvailableVersions(request);
    }



/************************************************************************/
