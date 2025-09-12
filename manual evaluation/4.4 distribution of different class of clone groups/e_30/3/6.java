 
    public Object[] toArray()
    {
        HGRandomAccessResult<HGHandle> rs = getSearchResult();
        try
        {
            int size = size();
            Object [] a = new Object[size];
            for (int i = 0; i < size; i++)
                a[i] = rs.next();
            return a;
        }
        finally
        {
            rs.close();
        }
    }


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\storage\StorageBasedIncidenceSet.java 7312
========================================================

    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a)
    {
        HGRandomAccessResult<HGHandle> rs = getSearchResult();
        try
        {
            int size = size();
            if (a.length < size)
                a = (T[])java.lang.reflect.Array
            .newInstance(a.getClass().getComponentType(), size);
            for (int i = 0; i < size; i++)
                a[i] = (T)rs.next();
            if (a.length > size)
                a[size] = null;
            return a;
        }
        finally
        {
            rs.close();
        }    }


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\storage\StorageBasedIncidenceSet.java 7313
========================================================


	public Object[] toArray()
	{
		HGRandomAccessResult<T> rs = getSearchResult();
		try
		{
			int size = size();
	        Object [] a = new Object[size];
	        for (int i = 0; i < size; i++)
	        	a[i] = rs.next();
	        return a;
		}
		finally
		{
			rs.close();
		}
	}


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\storage\DBKeyedSortedSet.java 7326
========================================================

	public <E> E[] toArray(E[] a)
	{
		HGRandomAccessResult<T> rs = getSearchResult();
		try
		{
	        int size = size();
	        if (a.length < size)
	            a = (E[])java.lang.reflect.Array
			.newInstance(a.getClass().getComponentType(), size);
	        for (int i = 0; i < size; i++)
	        	a[i] = (E)rs.next();
	        if (a.length > size)
	        	a[size] = null;
	        return a;
		}
		finally
		{
			rs.close();
		}
	}


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\storage\DBKeyedSortedSet.java 7327
========================================================
