
        @Override
        public void emit(byte[] buffer) {
            if (size==5) {
                buffer[myOffset]   = 29;
                buffer[myOffset+1] = (byte) (value >>> 24 & 0xff);
                buffer[myOffset+2] = (byte) (value >>> 16 & 0xff);
                buffer[myOffset+3] = (byte) (value >>>  8 & 0xff);
                buffer[myOffset+4] = (byte) (value >>>  0 & 0xff);
            }
        }


D:\_python\clone\CloneClassification\data_new\text\itextpdf\itext\src\main\java\com\itextpdf\text\pdf\CFFFont.java 460508
========================================================

        @Override
        public void emit(byte[] buffer) {
            if (size==5) {
                buffer[myOffset]   = 29;
                buffer[myOffset+1] = (byte) (value >>> 24 & 0xff);
                buffer[myOffset+2] = (byte) (value >>> 16 & 0xff);
                buffer[myOffset+3] = (byte) (value >>>  8 & 0xff);
                buffer[myOffset+4] = (byte) (value >>>  0 & 0xff);
            }
        }


D:\_python\clone\CloneClassification\data_new\text\itextpdf\itext\src\main\java\com\itextpdf\text\pdf\CFFFont.java 460509
========================================================
