maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/model/DefaultModelValidator.java

    private void validate20RawResources(
            ModelProblemCollector problems, List<Resource> resources, String prefix, int validationLevel) {
        Severity errOn30 = getSeverity(validationLevel, ModelValidator.VALIDATION_LEVEL_MAVEN_3_0);

        for (Resource resource : resources) {
            validateStringNotEmpty(
                    prefix,
                    "directory",
                    problems,
                    Severity.ERROR,
                    Version.V20,
                    resource.getDirectory(),
                    null,
                    resource);

            validateBoolean(
                    prefix,
                    "filtering",
                    problems,
                    errOn30,
                    Version.V20,
                    resource.getFiltering(),
                    SourceHint.resourceDirectory(resource),
                    resource);
        }
    }



/************************************************************************/
maven-master/compat/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java

    private void validate20RawResources(
            ModelProblemCollector problems, List<Resource> resources, String prefix, ModelBuildingRequest request) {
        Severity errOn30 = getSeverity(request, ModelBuildingRequest.VALIDATION_LEVEL_MAVEN_3_0);

        for (Resource resource : resources) {
            validateStringNotEmpty(
                    prefix,
                    "directory",
                    problems,
                    Severity.ERROR,
                    Version.V20,
                    resource.getDirectory(),
                    null,
                    resource);

            validateBoolean(
                    prefix,
                    "filtering",
                    problems,
                    errOn30,
                    Version.V20,
                    resource.getFiltering(),
                    resource.getDirectory(),
                    resource);
        }
    }



/************************************************************************/
