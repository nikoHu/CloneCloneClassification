maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/invoker/cisupport/GithubCIDetector.java

    @Override
    public Optional<CIInfo> detectCI() {
        String ciEnv = System.getenv(GITHUB_ACTIONS);
        if ("true".equals(ciEnv)) {
            return Optional.of(new CIInfo() {
                @Override
                public String name() {
                    return NAME;
                }

                @Override
                public boolean isVerbose() {
                    return "1".equals(System.getenv(RUNNER_DEBUG));
                }
            });
        }
        return Optional.empty();
    }



/************************************************************************/
maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/invoker/cisupport/TravisCIDetector.java

    @Override
    public Optional<CIInfo> detectCI() {
        String ciEnv = System.getenv(TRAVIS);
        if ("true".equals(ciEnv)) {
            return Optional.of(new CIInfo() {
                @Override
                public String name() {
                    return NAME;
                }

                @Override
                public boolean isVerbose() {
                    return "true".equals(System.getenv(TRAVIS_DEBUG_MODE));
                }
            });
        }
        return Optional.empty();
    }



/************************************************************************/
