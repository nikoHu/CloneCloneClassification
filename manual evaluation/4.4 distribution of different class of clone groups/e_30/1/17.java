
    public AutoPreUpdateContext(
        EntityType<E> entityType,
        Method method,
        Config config,
        List<EntityPropertyType<E, ?>> targetPropertyTypes,
        ReturningProperties returningProperties) {
      super(entityType, method, config);
      assertNotNull(targetPropertyTypes, returningProperties);
      this.returningProperties = returningProperties;
      changedPropertyNames = new HashSet<>(targetPropertyTypes.size());
      for (EntityPropertyType<E, ?> propertyType : targetPropertyTypes) {
        changedPropertyNames.add(propertyType.getName());
      }
    }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\jdbc\query\AutoUpdateQuery.java 241712
========================================================

    public AutoPostUpdateContext(
        EntityType<E> entityType,
        Method method,
        Config config,
        List<EntityPropertyType<E, ?>> targetPropertyTypes,
        ReturningProperties returningProperties) {
      super(entityType, method, config);
      assertNotNull(targetPropertyTypes, returningProperties);
      this.returningProperties = returningProperties;
      changedPropertyNames = new HashSet<>(targetPropertyTypes.size());
      for (EntityPropertyType<E, ?> propertyType : targetPropertyTypes) {
        changedPropertyNames.add(propertyType.getName());
      }
    }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\jdbc\query\AutoUpdateQuery.java 241713
========================================================
