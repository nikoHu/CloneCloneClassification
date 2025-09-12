maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/DefaultModelVersionParser.java


        @Override
        public boolean contains(Version version) {
            if (version instanceof DefaultVersion defaultVersion) {
                return delegate.containsVersion(defaultVersion.delegate);
            } else {
                return contains(new DefaultVersion(versionScheme, version.toString()));
            }
        }



/************************************************************************/
maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/DefaultModelVersionParser.java

        @Override
        public boolean contains(Version version) {
            if (version instanceof DefaultVersion defaultVersion) {
                return delegate.containsVersion(defaultVersion.delegate);
            } else {
                return contains(new DefaultVersion(versionScheme, version.toString()));
            }
        }



/************************************************************************/
