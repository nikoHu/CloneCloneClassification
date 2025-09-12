hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
public String get(String name) {
    String[] names = handleDeprecation(deprecationContext.get(), name);
    String result = null;
    for(String n : names) {
        result = substituteVars(getProps().getProperty(n));
    }
    return result;
}


/*******************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
public String getRaw(String name) {
    String[] names = handleDeprecation(deprecationContext.get(), name);
    String result = null;
    for(String n : names) {
        result = getProps().getProperty(n);
    }
    return result;
}


/********************************************************************/
hadoop-trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
public String get(String name, String defaultValue) {
    String[] names = handleDeprecation(deprecationContext.get(), name);
    String result = null;
    for(String n : names) {
        result = substituteVars(getProps().getProperty(n, defaultValue));
    }
    return result;
}

