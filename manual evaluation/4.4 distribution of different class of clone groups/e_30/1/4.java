
    public ByteArrayConverter<HGHandle> getValueConverter(final HyperGraph graph)
    {
        return new ByteArrayConverter<HGHandle>()
        {
            public byte[] toByteArray(HGHandle h)
            {
                return graph.getPersistentHandle(h).toByteArray();
            }

            public HGHandle fromByteArray(byte[] A, int offset, int length)
            {
                return graph.getHandleFactory().makeHandle(A, offset);
            }
        };
    }


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\indexing\TargetToTargetIndexer.java 7354
========================================================

    public ByteArrayConverter<HGHandle> getConverter(final HyperGraph graph)
    {
        return new ByteArrayConverter<HGHandle>()
        {
            public byte[] toByteArray(HGHandle h)
            {
                return graph.getPersistentHandle(h).toByteArray();
            }

            public HGHandle fromByteArray(byte[] A, int offset, int length)
            {
                return graph.getHandleFactory().makeHandle(A, offset);
            }
        };
    }


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\indexing\TargetToTargetIndexer.java 7355
========================================================
