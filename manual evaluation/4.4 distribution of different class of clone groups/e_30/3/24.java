

    private void processSub(Element element, HtmlNodeConverterContext context, HtmlMarkdownWriter out) {
        context.processConditional(myHtmlConverterOptions.extInlineSub, element, () -> {
            if (myHtmlConverterOptions.extInlineSub.isTextOnly() || !myHtmlConverterOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
                context.wrapTextNodes(element, "", false);
            } else {
                context.wrapTextNodes(element, "~", false);
            }
        });
    }


D:\_python\clone\CloneClassification\data_new\text\flexmark-java\flexmark-html2md-converter\src\main\java\com\vladsch\flexmark\html2md\converter\internal\HtmlConverterCoreNodeRenderer.java 448046
========================================================

    private void processSup(Element element, HtmlNodeConverterContext context, HtmlMarkdownWriter out) {
        context.processConditional(myHtmlConverterOptions.extInlineSup, element, () -> {
            if (myHtmlConverterOptions.extInlineSup.isTextOnly() || !myHtmlConverterOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
                context.wrapTextNodes(element, "", false);
            } else {
                context.wrapTextNodes(element, "^", false);
            }
        });
    }


D:\_python\clone\CloneClassification\data_new\text\flexmark-java\flexmark-html2md-converter\src\main\java\com\vladsch\flexmark\html2md\converter\internal\HtmlConverterCoreNodeRenderer.java 448047
========================================================
