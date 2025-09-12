maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/resolver/RelocatedArtifact.java

    @Override
    public String getExtension() {
        if (extension != null) {
            return extension;
        } else {
            return artifact.getExtension();
        }
    }



/************************************************************************/
maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/resolver/RelocatedArtifact.java
    @Override
    public String getVersion() {
        if (version != null) {
            return version;
        } else {
            return artifact.getVersion();
        }
    }



/************************************************************************/
maven-master/compat/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java
    @Override
    public String getExtension() {
        if (extension != null) {
            return extension;
        } else {
            return artifact.getExtension();
        }
    }



/************************************************************************/
maven-master/compat/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java

    @Override
    public String getVersion() {
        if (version != null) {
            return version;
        } else {
            return artifact.getVersion();
        }
    }



/************************************************************************/
