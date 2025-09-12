kafka-trunk/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/ReflectionScanner.java
    @Override
    protected PluginScanResult scanPlugins(PluginSource source) {
        ClassGraph classGraphBuilder = new ClassGraph()
                .overrideClassLoaders(classLoaderOrder(source))
                .enableExternalClasses()
                .enableClassInfo();
        try (ScanResult classGraph = classGraphBuilder.scan()) {
            return new PluginScanResult(
                  getPluginDesc(classGraph, PluginType.SINK, source),
                  getPluginDesc(classGraph, PluginType.SOURCE, source),
                  getPluginDesc(classGraph, PluginType.CONVERTER, source),
                  getPluginDesc(classGraph, PluginType.HEADER_CONVERTER, source),
                  getTransformationPluginDesc(source, classGraph),
                  getPredicatePluginDesc(source, classGraph),
                  getServiceLoaderPluginDesc(PluginType.CONFIGPROVIDER, source),
                  getServiceLoaderPluginDesc(PluginType.REST_EXTENSION, source),
                  getServiceLoaderPluginDesc(PluginType.CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY, source)
          );
        }
    }



/************************************************************************/
kafka-trunk/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/isolation/ServiceLoaderScanner.java
    @Override
    protected PluginScanResult scanPlugins(PluginSource source) {
        return new PluginScanResult(
                getServiceLoaderPluginDesc(PluginType.SINK, source),
                getServiceLoaderPluginDesc(PluginType.SOURCE, source),
                getServiceLoaderPluginDesc(PluginType.CONVERTER, source),
                getServiceLoaderPluginDesc(PluginType.HEADER_CONVERTER, source),
                getTransformationPluginDesc(source),
                getPredicatePluginDesc(source),
                getServiceLoaderPluginDesc(PluginType.CONFIGPROVIDER, source),
                getServiceLoaderPluginDesc(PluginType.REST_EXTENSION, source),
                getServiceLoaderPluginDesc(PluginType.CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY, source)
        );
    }



/************************************************************************/
