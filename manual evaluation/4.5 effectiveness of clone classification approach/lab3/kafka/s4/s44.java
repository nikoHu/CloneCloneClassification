kafka-trunk/generator/src/main/java/org/apache/kafka/message/FieldSpec.java
    String fieldAbstractJavaType(HeaderGenerator headerGenerator,
                                 StructRegistry structRegistry) {
        if (type instanceof FieldType.BoolFieldType) {
            return "boolean";
        } else if (type instanceof FieldType.Int8FieldType) {
            return "byte";
        } else if (type instanceof FieldType.Int16FieldType) {
            return "short";
        } else if (type instanceof FieldType.Uint16FieldType) {
            return "int";
        } else if (type instanceof FieldType.Uint32FieldType) {
            return "long";
        } else if (type instanceof FieldType.Int32FieldType) {
            return "int";
        } else if (type instanceof FieldType.Int64FieldType) {
            return "long";
        } else if (type instanceof FieldType.UUIDFieldType) {
            headerGenerator.addImport(MessageGenerator.UUID_CLASS);
            return "Uuid";
        } else if (type instanceof FieldType.Float64FieldType) {
            return "double";
        } else if (type.isString()) {
            return "String";
        } else if (type.isBytes()) {
            if (zeroCopy) {
                headerGenerator.addImport(MessageGenerator.BYTE_BUFFER_CLASS);
                return "ByteBuffer";
            } else {
                return "byte[]";
            }
        } else if (type instanceof FieldType.RecordsFieldType) {
            headerGenerator.addImport(MessageGenerator.BASE_RECORDS_CLASS);
            return "BaseRecords";
        } else if (type.isStruct()) {
            return MessageGenerator.capitalizeFirst(typeString());
        } else if (type.isArray()) {
            FieldType.ArrayType arrayType = (FieldType.ArrayType) type;
            if (structRegistry.isStructArrayWithKeys(this)) {
                headerGenerator.addImport(MessageGenerator.IMPLICIT_LINKED_HASH_MULTI_COLLECTION_CLASS);
                return collectionType(arrayType.elementType().toString());
            } else {
                headerGenerator.addImport(MessageGenerator.LIST_CLASS);
                return String.format("List<%s>",
                    arrayType.elementType().getBoxedJavaType(headerGenerator));
            }
        } else {
            throw new RuntimeException("Unknown field type " + type);
        }
    }



/************************************************************************/
kafka-trunk/generator/src/main/java/org/apache/kafka/message/FieldSpec.java
    String concreteJavaType(HeaderGenerator headerGenerator,
                            StructRegistry structRegistry) {
        if (type.isArray()) {
            FieldType.ArrayType arrayType = (FieldType.ArrayType) type;
            if (structRegistry.isStructArrayWithKeys(this)) {
                return collectionType(arrayType.elementType().toString());
            } else {
                headerGenerator.addImport(MessageGenerator.ARRAYLIST_CLASS);
                return String.format("ArrayList<%s>",
                    arrayType.elementType().getBoxedJavaType(headerGenerator));
            }
        } else {
            return fieldAbstractJavaType(headerGenerator, structRegistry);
        }
    }



/************************************************************************/
