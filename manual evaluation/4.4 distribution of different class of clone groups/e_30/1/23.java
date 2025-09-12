
        @Override
        public XmlStringBuilder toXML(XmlEnvironment xmlEnvironment) {
            XmlStringBuilder xml = new XmlStringBuilder(this, xmlEnvironment);
            xml.rightAngleBracket();
            xml.append(getFields());
            xml.closeElement(this);
            return xml;
        }


D:\_python\clone\CloneClassification\data_new\android\Smack\smack-extensions\src\main\java\org\jivesoftware\smackx\xdata\packet\DataForm.java 97390
========================================================

        @Override
        public XmlStringBuilder toXML(XmlEnvironment xmlEnvironment) {
            XmlStringBuilder xml = new XmlStringBuilder(this, xmlEnvironment);
            xml.rightAngleBracket();
            xml.append(getFields());
            xml.closeElement(this);
            return xml;
        }


D:\_python\clone\CloneClassification\data_new\android\Smack\smack-extensions\src\main\java\org\jivesoftware\smackx\xdata\packet\DataForm.java 97391
========================================================
