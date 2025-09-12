
    public <K, V> KStream<K, V> stream(final Collection<String> topics,
                                       final ConsumedInternal<K, V> consumed) {

        final String name = new NamedInternal(consumed.name()).orElseGenerateWithPrefix(this, KStreamImpl.SOURCE_NAME);
        final StreamSourceNode<K, V> streamSourceNode = new StreamSourceNode<>(name, topics, consumed);

        addGraphNode(root, streamSourceNode);

        return new KStreamImpl<>(name,
                                 consumed.keySerde(),
                                 consumed.valueSerde(),
                                 Collections.singleton(name),
                                 false,
                                 streamSourceNode,
                                 this);
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\streams\src\main\java\org\apache\kafka\streams\kstream\internals\InternalStreamsBuilder.java 27993
========================================================

    public <K, V> KStream<K, V> stream(final Pattern topicPattern,
                                       final ConsumedInternal<K, V> consumed) {
        final String name = new NamedInternal(consumed.name()).orElseGenerateWithPrefix(this, KStreamImpl.SOURCE_NAME);
        final StreamSourceNode<K, V> streamPatternSourceNode = new StreamSourceNode<>(name, topicPattern, consumed);

        addGraphNode(root, streamPatternSourceNode);

        return new KStreamImpl<>(name,
                                 consumed.keySerde(),
                                 consumed.valueSerde(),
                                 Collections.singleton(name),
                                 false,
                                 streamPatternSourceNode,
                                 this);
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\streams\src\main\java\org\apache\kafka\streams\kstream\internals\InternalStreamsBuilder.java 27994
========================================================
