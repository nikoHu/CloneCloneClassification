
    public static InputStream getUngzippedContent(HttpEntity entity)
            throws IOException {
        InputStream responseStream = entity.getContent();
        if (responseStream == null) return responseStream;
        Header header = entity.getContentEncoding();
        if (header == null) return responseStream;
        String contentEncoding = header.getValue();
        if (contentEncoding == null) return responseStream;
        if (contentEncoding.contains("gzip")) responseStream
                = new GZIPInputStream(responseStream);
        return responseStream;
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\android\net\http\AndroidHttpClient.java 114851
========================================================

    public static InputStream getUngzippedContent(HttpEntity entity)
            throws IOException {
        InputStream responseStream = entity.getContent();
        if (responseStream == null) return responseStream;
        Header header = entity.getContentEncoding();
        if (header == null) return responseStream;
        String contentEncoding = header.getValue();
        if (contentEncoding == null) return responseStream;
        if (contentEncoding.contains("gzip")) responseStream
                = new GZIPInputStream(responseStream);
        return responseStream;
    }


D:\_python\clone\CloneClassification\data_new\android\GNURootDebian\downloader_library\src\main\java\com\google\android\vending\expansion\downloader\impl\AndroidHttpClient.java 163047
========================================================
