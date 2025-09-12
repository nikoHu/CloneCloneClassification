
    @NonNull
    public Object get(@NonNull String name) throws JSONException {
        Object result = nameValuePairs.get(name);
        if (result == null) {
            throw new JSONException("No value for " + name);
        }
        return result;
    }


D:\_python\clone\CloneClassification\data_new\android\sdl_java_suite\javaSE\javaSE\src\main\java\org\json\JSONObject.java 16492
========================================================

    public Object get(String name) throws JSONException {
        Object result = nameValuePairs.get(name);
        if (result == null) {
            throw new JSONException("No value for " + name);
        }
        return result;
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\org\json\JSONObject.java 105705
========================================================
