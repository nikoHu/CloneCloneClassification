tomcat-main\java\org\apache\coyote\http11\Http11Processor.java 
private void addInputFilter(InputFilter[] inputFilters, String encodingName) {
    if (contentDelimitation) {
        // Chunked has already been specified and it must be the final
        // encoding.
        // 400 - Bad request
        response.setStatus(400);
        setErrorState(ErrorState.CLOSE_CLEAN, null);
        if (log.isDebugEnabled()) {
            log.debug(sm.getString("http11processor.request.alreadyChunked", encodingName));
        }
        return;
    }

    // Parsing trims and converts to lower case.
    if (encodingName.equals("chunked")) {
        inputBuffer.addActiveFilter(inputFilters[Constants.CHUNKED_FILTER]);
        contentDelimitation = true;
    } else {
        for (int i = pluggableFilterIndex; i < inputFilters.length; i++) {
            if (inputFilters[i].getEncodingName().toString().equals(encodingName)) {
                inputBuffer.addActiveFilter(inputFilters[i]);
                return;
            }
        }
        // Unsupported transfer encoding
        // 501 - Unimplemented
        response.setStatus(501);
        setErrorState(ErrorState.CLOSE_CLEAN, null);
        if (log.isDebugEnabled()) {
            log.debug(sm.getString("http11processor.request.unsupportedEncoding", encodingName));
        }
    }
}

/************************************************************************/
tomcat-main\java\org\apache\coyote\http11\Http11Processor.java
    private void badRequest(String errorKey) {
        response.setStatus(400);
        setErrorState(ErrorState.CLOSE_CLEAN, null);
        if (log.isDebugEnabled()) {
            log.debug(sm.getString(errorKey));
        }
    }

