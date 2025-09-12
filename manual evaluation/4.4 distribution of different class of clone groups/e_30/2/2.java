

		private YamlCellPreProcessor.YamlCellConsumer newYamlCellConsumer(CheckedConsumer<String[]> rowConsumer, CheckedConsumer<String> commentConsumer) {
			TextFormat textFormat = getTextFormat();
			return new YamlCellPreProcessor.YamlCellConsumer(
					StringArrayCellConsumer.newInstance(rowConsumer),
					YamlCellPreProcessor.commentConsumerToCellConsumer(commentConsumer),
					superGetCellTransformer(textFormat, stringPostProcessing));
		}


D:\_python\clone\CloneClassification\data_new\db\SimpleFlatMapper\sfm-csv\src\main\java\org\simpleflatmapper\csv\CsvParser.java 256619
========================================================

		private YamlCellPreProcessor.YamlCellConsumer newYamlCellConsumer(CheckedConsumer<String[]> rowConsumer, CheckedConsumer<String> commentConsumer) {
			TextFormat textFormat = getTextFormat();
			return new YamlCellPreProcessor.YamlCellConsumer(
					StringArrayCellConsumer.newInstance(rowConsumer),
					YamlCellPreProcessor.commentConsumerToCellConsumer(commentConsumer),
					superGetCellTransformer(textFormat, stringPostProcessing));
		}


D:\_python\clone\CloneClassification\data_new\db\SimpleFlatMapper\lightningcsv\src\main\java\org\simpleflatmapper\lightningcsv\CsvParser.java 257426
========================================================
