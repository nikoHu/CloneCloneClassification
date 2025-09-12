maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/invoker/mvnup/goals/CompatibilityFixStrategy.java

    private boolean fixUnsupportedCombineChildrenAttributes(Document pomDocument, UpgradeContext context) {
        boolean fixed = false;
        Element root = pomDocument.getRootElement();

        // Find all elements with combine.children="override" and change to "merge"
        List<Element> elementsWithCombineChildren = findElementsWithAttribute(root, COMBINE_CHILDREN, COMBINE_OVERRIDE);
        for (Element element : elementsWithCombineChildren) {
            element.getAttribute(COMBINE_CHILDREN).setValue(COMBINE_MERGE);
            context.detail("Fixed: " + COMBINE_CHILDREN + "='" + COMBINE_OVERRIDE + "' → '" + COMBINE_MERGE + "' in "
                    + element.getName());
            fixed = true;
        }

        return fixed;
    }



/************************************************************************/
maven-master/impl/maven-cli/src/main/java/org/apache/maven/cling/invoker/mvnup/goals/CompatibilityFixStrategy.java

    private boolean fixUnsupportedCombineSelfAttributes(Document pomDocument, UpgradeContext context) {
        boolean fixed = false;
        Element root = pomDocument.getRootElement();

        // Find all elements with combine.self="append" and change to "merge"
        List<Element> elementsWithCombineSelf = findElementsWithAttribute(root, COMBINE_SELF, COMBINE_APPEND);
        for (Element element : elementsWithCombineSelf) {
            element.getAttribute(COMBINE_SELF).setValue(COMBINE_MERGE);
            context.detail("Fixed: " + COMBINE_SELF + "='" + COMBINE_APPEND + "' → '" + COMBINE_MERGE + "' in "
                    + element.getName());
            fixed = true;
        }

        return fixed;
    }



/************************************************************************/
