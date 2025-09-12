
    public static List<VehicleType> deserializeSupportedVehicles(XmlResourceParser parser) {
        List<VehicleType> vehicleMakesList = new ArrayList<>();
        if (parser == null) {
            return vehicleMakesList;
        }
        try {
            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                if (eventType == XmlPullParser.START_TAG) {
                    String tagName = parser.getName();
                    if (tagName != null && tagName.equalsIgnoreCase("vehicle-type")) {
                        VehicleType vehicleMake = new VehicleType();
                        String make = parser.getAttributeValue(null, "make");
                        if (make != null) {
                            vehicleMake.setMake(make);
                            String model = parser.getAttributeValue(null, "model");
                            String modelYear = parser.getAttributeValue(null, "modelYear");
                            String trim = parser.getAttributeValue(null, "trim");

                            if (model == null && modelYear == null && trim == null) {
                                vehicleMakesList.add(vehicleMake);
                            } else if (model != null) {
                                vehicleMake.setModel(model);
                                if (modelYear != null) {
                                    vehicleMake.setModelYear(modelYear);
                                }
                                if (trim != null) {
                                    vehicleMake.setTrim(trim);
                                }
                                vehicleMakesList.add(vehicleMake);
                            }
                        }
                    }
                }
                eventType = parser.next();
            }
        } catch (XmlPullParserException e) {
            DebugTool.logError(TAG, "Failed to parse xml file", e);
        } catch (IOException e) {
            DebugTool.logError(TAG, "Failed to find next element in the xml file", e);
        }
        return vehicleMakesList;
    }


D:\_python\clone\CloneClassification\data_new\android\sdl_java_suite\android\sdl_android\src\main\java\com\smartdevicelink\util\SdlAppInfo.java 16102
========================================================

    private int getFileSizeFromInputStream(InputStream inputStream) {
        int size = 0;
        if (inputStream != null) {
            try {
                size = inputStream.available();
            } catch (IOException e) {
                DebugTool.logError(TAG, "Error trying to get input stream size", e);
            }
        }
        return size;
    }


D:\_python\clone\CloneClassification\data_new\android\sdl_java_suite\base\src\main\java\com\smartdevicelink\managers\file\UploadFileOperation.java 17009
========================================================
