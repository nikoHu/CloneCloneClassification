maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/model/DefaultModelValidator.java

    private boolean isValidCoordinatesId(String id) {
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!isValidCoordinatesIdCharacter(c)) {
                return false;
            }
        }
        return true;
    }



/************************************************************************/
maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/model/DefaultModelValidator.java
    private boolean isValidCoordinatesIdWithWildCards(String id) {
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!isValidCoordinatesIdWithWildCardCharacter(c)) {
                return false;
            }
        }
        return true;
    }



/************************************************************************/
maven-master/compat/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java

    private boolean isValidId(String id) {
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!isValidIdCharacter(c)) {
                return false;
            }
        }
        return true;
    }



/************************************************************************/
maven-master/compat/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
    private boolean isValidIdWithWildCards(String id) {
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!isValidIdWithWildCardCharacter(c)) {
                return false;
            }
        }
        return true;
    }



/************************************************************************/
