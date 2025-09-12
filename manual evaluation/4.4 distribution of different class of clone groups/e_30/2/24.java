
    @SuppressWarnings("unchecked")
    void copyFrom(CatalogMap<? extends CatalogType> catalogMap) {
        CatalogMap<T> castedMap = (CatalogMap<T>) catalogMap;
        for (Entry<String, T> e : castedMap.m_items.entrySet()) {
            m_items.put(e.getKey(), (T) e.getValue().deepCopy(m_catalog, m_parent));
        }
        m_subTreeVersion = catalogMap.m_subTreeVersion;
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\frontend\org\voltdb\catalog\CatalogMap.java 303888
========================================================


    @SuppressWarnings("unchecked")
    void copyFrom(CatalogMap<? extends CatalogType> catalogMap) {
        CatalogMap<T> castedMap = (CatalogMap<T>) catalogMap;
        for (Entry<String, T> e : castedMap.m_items.entrySet()) {
            m_items.put(e.getKey(), (T) e.getValue().deepCopy(m_catalog, m_parent));
        }
        m_subTreeVersion = catalogMap.m_subTreeVersion;
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\catgen\in\javasrc\CatalogMap.java 310856
========================================================
