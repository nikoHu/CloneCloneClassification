
        public TypedArray obtainStyledAttributes(AttributeSet set,
                int[] attrs, int defStyleAttr, int defStyleRes) {
            int len = attrs.length;
            TypedArray array = getCachedStyledAttributes(len);

            // XXX note that for now we only work with compiled XML files.
            // To support generic XML files we will need to manually parse
            // out the attributes from the XML file (applying type information
            // contained in the resources and such).
            XmlBlock.Parser parser = (XmlBlock.Parser)set;
            AssetManager.applyStyle(
                mTheme, defStyleAttr, defStyleRes,
                parser != null ? parser.mParseState : 0, attrs,
                        array.mData, array.mIndices);

            array.mRsrcs = attrs;
            array.mXml = parser;

            if (false) {
                int[] data = array.mData;
                
                System.out.println("Attributes:");
                String s = "  Attrs:";
                int i;
                for (i=0; i<set.getAttributeCount(); i++) {
                    s = s + " " + set.getAttributeName(i);
                    int id = set.getAttributeNameResource(i);
                    if (id != 0) {
                        s = s + "(0x" + Integer.toHexString(id) + ")";
                    }
                    s = s + "=" + set.getAttributeValue(i);
                }
                System.out.println(s);
                s = "  Found:";
                TypedValue value = new TypedValue();
                for (i=0; i<attrs.length; i++) {
                    int d = i*AssetManager.STYLE_NUM_ENTRIES;
                    value.type = data[d+AssetManager.STYLE_TYPE];
                    value.data = data[d+AssetManager.STYLE_DATA];
                    value.assetCookie = data[d+AssetManager.STYLE_ASSET_COOKIE];
                    value.resourceId = data[d+AssetManager.STYLE_RESOURCE_ID];
                    s = s + " 0x" + Integer.toHexString(attrs[i])
                        + "=" + value;
                }
                System.out.println(s);
            }

            return array;
        }


D:\_python\clone\CloneClassification\data_new\android\legacy-patchrom\android\src\frameworks\base\core\java\android\content\res\Resources.java 91837
========================================================

        public TypedArray obtainStyledAttributes(AttributeSet set,
                int[] attrs, int defStyleAttr, int defStyleRes) {
            int len = attrs.length;
            TypedArray array = getCachedStyledAttributes(len);

            // XXX note that for now we only work with compiled XML files.
            // To support generic XML files we will need to manually parse
            // out the attributes from the XML file (applying type information
            // contained in the resources and such).
            XmlBlock.Parser parser = (XmlBlock.Parser)set;
            AssetManager.applyStyle(
                mTheme, defStyleAttr, defStyleRes,
                parser != null ? parser.mParseState : 0, attrs,
                        array.mData, array.mIndices);

            array.mRsrcs = attrs;
            array.mXml = parser;

            if (false) {
                int[] data = array.mData;
                
                System.out.println("Attributes:");
                String s = "  Attrs:";
                int i;
                for (i=0; i<set.getAttributeCount(); i++) {
                    s = s + " " + set.getAttributeName(i);
                    int id = set.getAttributeNameResource(i);
                    if (id != 0) {
                        s = s + "(0x" + Integer.toHexString(id) + ")";
                    }
                    s = s + "=" + set.getAttributeValue(i);
                }
                System.out.println(s);
                s = "  Found:";
                TypedValue value = new TypedValue();
                for (i=0; i<attrs.length; i++) {
                    int d = i*AssetManager.STYLE_NUM_ENTRIES;
                    value.type = data[d+AssetManager.STYLE_TYPE];
                    value.data = data[d+AssetManager.STYLE_DATA];
                    value.assetCookie = data[d+AssetManager.STYLE_ASSET_COOKIE];
                    value.resourceId = data[d+AssetManager.STYLE_RESOURCE_ID];
                    s = s + " 0x" + Integer.toHexString(attrs[i])
                        + "=" + value;
                }
                System.out.println(s);
            }

            return array;
        }


D:\_python\clone\CloneClassification\data_new\android\legacy-patchrom\miui\src\frameworks\base\core\java\android\content\res\Resources.java 93321
========================================================

        public TypedArray obtainStyledAttributes(AttributeSet set,
                int[] attrs, int defStyleAttr, int defStyleRes) {
            int len = attrs.length;
            TypedArray array = getCachedStyledAttributes(len);

            // XXX note that for now we only work with compiled XML files.
            // To support generic XML files we will need to manually parse
            // out the attributes from the XML file (applying type information
            // contained in the resources and such).
            XmlBlock.Parser parser = (XmlBlock.Parser)set;
            AssetManager.applyStyle(
                mTheme, defStyleAttr, defStyleRes,
                parser != null ? parser.mParseState : 0, attrs,
                        array.mData, array.mIndices);

            array.mRsrcs = attrs;
            array.mXml = parser;

            if (false) {
                int[] data = array.mData;
                
                System.out.println("Attributes:");
                String s = "  Attrs:";
                int i;
                for (i=0; i<set.getAttributeCount(); i++) {
                    s = s + " " + set.getAttributeName(i);
                    int id = set.getAttributeNameResource(i);
                    if (id != 0) {
                        s = s + "(0x" + Integer.toHexString(id) + ")";
                    }
                    s = s + "=" + set.getAttributeValue(i);
                }
                System.out.println(s);
                s = "  Found:";
                TypedValue value = new TypedValue();
                for (i=0; i<attrs.length; i++) {
                    int d = i*AssetManager.STYLE_NUM_ENTRIES;
                    value.type = data[d+AssetManager.STYLE_TYPE];
                    value.data = data[d+AssetManager.STYLE_DATA];
                    value.assetCookie = data[d+AssetManager.STYLE_ASSET_COOKIE];
                    value.resourceId = data[d+AssetManager.STYLE_RESOURCE_ID];
                    s = s + " 0x" + Integer.toHexString(attrs[i])
                        + "=" + value;
                }
                System.out.println(s);
            }

            return array;
        }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\android\content\res\Resources.java 115981
========================================================
