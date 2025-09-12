kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/ListDeserializer.java

    private void configureListClass(Map<String, ?> configs, boolean isKey) {
        String listTypePropertyName = isKey ? CommonClientConfigs.DEFAULT_LIST_KEY_SERDE_TYPE_CLASS : CommonClientConfigs.DEFAULT_LIST_VALUE_SERDE_TYPE_CLASS;
        final Object listClassOrName = configs.get(listTypePropertyName);
        if (listClassOrName == null) {
            throw new ConfigException("Not able to determine the list class because it was neither passed via the constructor nor set in the config.");
        }
        try {
            if (listClassOrName instanceof String) {
                listClass = Utils.loadClass((String) listClassOrName, Object.class);
            } else if (listClassOrName instanceof Class) {
                listClass = (Class<?>) listClassOrName;
            } else {
                throw new KafkaException("Could not determine the list class instance using \"" + listTypePropertyName + "\" property.");
            }
        } catch (final ClassNotFoundException e) {
            throw new ConfigException(listTypePropertyName, listClassOrName, "Deserializer's list class \"" + listClassOrName + "\" could not be found.");
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/ListDeserializer.java

    @SuppressWarnings("unchecked")
    private void configureInnerSerde(Map<String, ?> configs, boolean isKey) {
        String innerSerdePropertyName = isKey ? CommonClientConfigs.DEFAULT_LIST_KEY_SERDE_INNER_CLASS : CommonClientConfigs.DEFAULT_LIST_VALUE_SERDE_INNER_CLASS;
        final Object innerSerdeClassOrName = configs.get(innerSerdePropertyName);
        if (innerSerdeClassOrName == null) {
            throw new ConfigException("Not able to determine the inner serde class because it was neither passed via the constructor nor set in the config.");
        }
        try {
            if (innerSerdeClassOrName instanceof String) {
                inner = Utils.newInstance((String) innerSerdeClassOrName, Serde.class).deserializer();
            } else if (innerSerdeClassOrName instanceof Class) {
                inner = (Deserializer<Inner>) ((Serde) Utils.newInstance((Class) innerSerdeClassOrName)).deserializer();
            } else {
                throw new KafkaException("Could not determine the inner serde class instance using \"" + innerSerdePropertyName + "\" property.");
            }
            inner.configure(configs, isKey);
            primitiveSize = FIXED_LENGTH_DESERIALIZERS.get(inner.getClass());
        } catch (final ClassNotFoundException e) {
            throw new ConfigException(innerSerdePropertyName, innerSerdeClassOrName, "Deserializer's inner serde class \"" + innerSerdeClassOrName + "\" could not be found.");
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/ListSerializer.java
  

    @SuppressWarnings("unchecked")
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        if (inner != null) {
            log.error("Could not configure ListSerializer as the parameter has already been set -- inner: {}", inner);
            throw new ConfigException("List serializer was already initialized using a non-default constructor");
        }
        final String innerSerdePropertyName = isKey ? CommonClientConfigs.DEFAULT_LIST_KEY_SERDE_INNER_CLASS : CommonClientConfigs.DEFAULT_LIST_VALUE_SERDE_INNER_CLASS;
        final Object innerSerdeClassOrName = configs.get(innerSerdePropertyName);
        if (innerSerdeClassOrName == null) {
            throw new ConfigException("Not able to determine the serializer class because it was neither passed via the constructor nor set in the config.");
        }
        try {
            if (innerSerdeClassOrName instanceof String) {
                inner = Utils.newInstance((String) innerSerdeClassOrName, Serde.class).serializer();
            } else if (innerSerdeClassOrName instanceof Class) {
                inner = (Serializer<Inner>) ((Serde) Utils.newInstance((Class) innerSerdeClassOrName)).serializer();
            } else {
                throw new KafkaException("Could not create a serializer class instance using \"" + innerSerdePropertyName + "\" property.");
            }
            inner.configure(configs, isKey);
            serStrategy = FIXED_LENGTH_SERIALIZERS.contains(inner.getClass()) ? SerializationStrategy.CONSTANT_SIZE : SerializationStrategy.VARIABLE_SIZE;
        } catch (final ClassNotFoundException e) {
            throw new ConfigException(innerSerdePropertyName, innerSerdeClassOrName, "Serializer class " + innerSerdeClassOrName + " could not be found.");
        }
    }



/************************************************************************/
