
      SingularEnumFieldAccessor(
          final FieldDescriptor descriptor, final String camelCaseName,
          final Class<? extends GeneratedMessage> messageClass,
          final Class<? extends Builder> builderClass) {
        super(descriptor, camelCaseName, messageClass, builderClass);

        valueOfMethod = getMethodOrDie(type, "valueOf",
                                       EnumValueDescriptor.class);
        getValueDescriptorMethod =
          getMethodOrDie(type, "getValueDescriptor");
      }


D:\_python\clone\CloneClassification\data_new\db\h-store\third_party\cpp\protobuf\java\src\main\java\com\google\protobuf\GeneratedMessage.java 311051
========================================================

      RepeatedEnumFieldAccessor(
          final FieldDescriptor descriptor, final String camelCaseName,
          final Class<? extends GeneratedMessage> messageClass,
          final Class<? extends Builder> builderClass) {
        super(descriptor, camelCaseName, messageClass, builderClass);

        valueOfMethod = getMethodOrDie(type, "valueOf",
                                       EnumValueDescriptor.class);
        getValueDescriptorMethod =
          getMethodOrDie(type, "getValueDescriptor");
      }


D:\_python\clone\CloneClassification\data_new\db\h-store\third_party\cpp\protobuf\java\src\main\java\com\google\protobuf\GeneratedMessage.java 311052
========================================================
