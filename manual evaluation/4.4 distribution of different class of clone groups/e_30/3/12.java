
    public void setSubjectAlternativeNames(Collection<List<?>> names) throws IOException {
        subjectAltNames = null;
        if ((names == null) || (names.size() == 0)) {
            return;
        }
        for (List<?> name : names) {
            int tag = (Integer) name.get(0);
            Object value = name.get(1);
            if (value instanceof String) {
                addSubjectAlternativeName(tag, (String) value);
            } else if (value instanceof byte[]) {
                addSubjectAlternativeName(tag, (byte[]) value);
            } else {
                throw new IOException("name neither a String nor a byte[]");
            }
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\java\security\cert\X509CertSelector.java 124253
========================================================

    public void setPathToNames(Collection<List<?>> names) throws IOException {
        pathToNames = null;
        if ((names == null) || (names.size() == 0)) {
            return;
        }
        for (List<?> name : names) {
            int tag = (Integer) name.get(0);
            Object value = name.get(1);
            if (value instanceof String) {
                addPathToName(tag, (String) value);
            } else if (value instanceof byte[]) {
                addPathToName(tag, (byte[]) value);
            } else {
                throw new IOException("name neither a String nor a byte[]");
            }
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\java\security\cert\X509CertSelector.java 124259
========================================================
