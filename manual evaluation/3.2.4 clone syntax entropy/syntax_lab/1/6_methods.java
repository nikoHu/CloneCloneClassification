
    private Joined(final Serde<K> keySerde,
                   final Serde<VLeft> leftValueSerde,
                   final Serde<VRight> rightValueSerde,
                   final String name,
                   final Duration gracePeriod) {
        this.keySerde = keySerde;
        this.leftValueSerde = leftValueSerde;
        this.rightValueSerde = rightValueSerde;
        this.name = name;
        this.gracePeriod = gracePeriod;
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\streams\src\main\java\org\apache\kafka\streams\kstream\Joined.java 27786
========================================================

    BaseRepartitionNode(final String nodeName,
                        final String sourceName,
                        final ProcessorParameters<K, V, K, V> processorParameters,
                        final Serde<K> keySerde,
                        final Serde<V> valueSerde,
                        final String sinkName,
                        final String repartitionTopic,
                        final StreamPartitioner<K, V> partitioner,
                        final InternalTopicProperties internalTopicProperties) {
        super(nodeName);

        this.keySerde = keySerde;
        this.valueSerde = valueSerde;
        this.sinkName = sinkName;
        this.sourceName = sourceName;
        this.repartitionTopic = repartitionTopic;
        this.processorParameters = processorParameters;
        this.partitioner = partitioner;
        this.internalTopicProperties = internalTopicProperties;
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\streams\src\main\java\org\apache\kafka\streams\kstream\internals\graph\BaseRepartitionNode.java 28030
========================================================
