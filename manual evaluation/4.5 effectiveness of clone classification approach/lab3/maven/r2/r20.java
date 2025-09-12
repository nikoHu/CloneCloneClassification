maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/resolver/RelocatedArtifact.java
    @Override
    public String getGroupId() {
        if (groupId != null) {
            return groupId;
        } else {
            return artifact.getGroupId();
        }
    }



/************************************************************************/
maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/resolver/RelocatedArtifact.java

    @Override
    public String getArtifactId() {
        if (artifactId != null) {
            return artifactId;
        } else {
            return artifact.getArtifactId();
        }
    }



/************************************************************************/
maven-master/compat/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java
    @Override
    public String getGroupId() {
        if (groupId != null) {
            return groupId;
        } else {
            return artifact.getGroupId();
        }
    }



/************************************************************************/
maven-master/compat/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java

    @Override
    public String getArtifactId() {
        if (artifactId != null) {
            return artifactId;
        } else {
            return artifact.getArtifactId();
        }
    }



/************************************************************************/
