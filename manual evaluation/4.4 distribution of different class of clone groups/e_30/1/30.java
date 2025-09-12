
  public SetOperand<Row> select(
      PropertyMetamodel<?> propertyMetamodel, PropertyMetamodel<?>... propertyMetamodels) {
    Objects.requireNonNull(propertyMetamodel);
    Objects.requireNonNull(propertyMetamodels);
    for (int i = 0; i < propertyMetamodels.length; i++) {
      Objects.requireNonNull(propertyMetamodels[i], "propertyMetamodels[" + i + "]");
    }
    return selectAsRowInternal(propertyMetamodel, propertyMetamodels);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\jdbc\criteria\statement\NativeSqlSelectStarting.java 241956
========================================================

  public SetOperand<Row> selectAsRow(
      PropertyMetamodel<?> propertyMetamodel, PropertyMetamodel<?>... propertyMetamodels) {
    Objects.requireNonNull(propertyMetamodel);
    Objects.requireNonNull(propertyMetamodels);
    for (int i = 0; i < propertyMetamodels.length; i++) {
      Objects.requireNonNull(propertyMetamodels[i], "propertyMetamodels[" + i + "]");
    }
    return selectAsRowInternal(propertyMetamodel, propertyMetamodels);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\jdbc\criteria\statement\NativeSqlSelectStarting.java 241957
========================================================
