
        public Builder setImporter(DataImporter importer) {
            this.importer = importer;
            this.externalPath = null;
            this.rrdDef = null;
            this.readOnly = false;
            return this;
        }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\apps\jrobin\java\src\org\rrd4j\core\RrdDb.java 340126
========================================================

        public Builder setRrdToolImporter(String externalPath) throws IOException {
            this.importer = new RrdToolReader(externalPath);
            this.externalPath = null;
            this.rrdDef = null;
            this.readOnly = false;
            return this;
        }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\apps\jrobin\java\src\org\rrd4j\core\RrdDb.java 340127
========================================================
