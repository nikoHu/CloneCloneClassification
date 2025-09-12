
    public boolean getFeature(String name)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        if(NAMESPACES_FEATURE.equals(name)) {
            return pp.getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES);
        } else if(NAMESPACE_PREFIXES_FEATURE.equals(name)) {
            return pp.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES);
        } else if(VALIDATION_FEATURE.equals(name)) {
            return pp.getFeature(XmlPullParser.FEATURE_VALIDATION);
            //        } else if(APACHE_SCHEMA_VALIDATION_FEATURE.equals(name)) {
            //            return false;  //TODO
            //        } else if(APACHE_DYNAMIC_VALIDATION_FEATURE.equals(name)) {
            //            return false; //TODO
        } else {
            return pp.getFeature(name);
            //throw new SAXNotRecognizedException("unrecognized feature "+name);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\org\xmlpull\v1\sax2\Driver.java 105879
========================================================

    public void setFeature (String name, boolean value)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        try {
            if(NAMESPACES_FEATURE.equals(name)) {
                pp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, value);
            } else if(NAMESPACE_PREFIXES_FEATURE.equals(name)) {
                if(pp.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES) != value) {
                    pp.setFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES, value);
                }
            } else if(VALIDATION_FEATURE.equals(name)) {
                pp.setFeature(XmlPullParser.FEATURE_VALIDATION, value);
                //          } else if(APACHE_SCHEMA_VALIDATION_FEATURE.equals(name)) {
                //              // can ignore as validation must be false ...
                //              //              if(true == value) {
                //              //                  throw new SAXNotSupportedException("schema validation is not supported");
                //              //              }
                //          } else if(APACHE_DYNAMIC_VALIDATION_FEATURE.equals(name)) {
                //              if(true == value) {
                //                  throw new SAXNotSupportedException("dynamic validation is not supported");
                //              }
            } else {
                pp.setFeature(name, value);
                //throw new SAXNotRecognizedException("unrecognized feature "+name);
            }
        } catch(XmlPullParserException ex) {
           // throw new SAXNotSupportedException("problem with setting feature "+name+": "+ex);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\org\xmlpull\v1\sax2\Driver.java 105880
========================================================
