

    public int reserve(int count) {
        if (count < 0 || (count + m_max_size < 0))
            throw new IllegalArgumentException("Count must by greater than 0");
        if (m_depth == m_max_depth) {
            m_max_depth *= 2;
            int[] new_offsets = new int[m_max_depth];
            System.arraycopy(m_offsets, 0, new_offsets, 0, m_depth);
            m_offsets = new_offsets;
        }
        int result = m_offsets[m_depth];
        int new_size = result + count;
        m_offsets[m_depth++] = new_size;
        if (new_size > m_max_size) {
            m_max_size = Math.max(2 * m_max_size, new_size);
            byte[] new_buffer = new byte[m_max_size];
            System.arraycopy(m_buffer, 0, new_buffer, 0, result);
            m_buffer = new_buffer;
        }

        return result;
    }


D:\_python\clone\CloneClassification\data_new\android\remote-desktop-clients\bVNC\src\main\java\com\iiordanov\util\ByteBufferStack.java 91436
========================================================
    
    public int reserve(int count)
    {
        if (count < 0 || (count + m_max_size < 0))
            throw new IllegalArgumentException("Count must by greater than 0");
        if (m_depth == m_max_depth)
        {
            m_max_depth *= 2;
            int[] new_offsets = new int[m_max_depth];
            System.arraycopy(m_offsets, 0, new_offsets, 0, m_depth);
            m_offsets = new_offsets;
        }
        int result = m_offsets[m_depth];
        int new_size = result + count;
        m_offsets[m_depth++] = new_size;
        if (new_size > m_max_size)
        {
            m_max_size = Math.max(2 * m_max_size, new_size);
            byte[] new_buffer = new byte[m_max_size];
            System.arraycopy(m_buffer, 0, new_buffer, 0, result);
            m_buffer = new_buffer;
        }
        
        return result;
    }


D:\_python\clone\CloneClassification\data_new\android\GNURootDebian\bVNC\src\main\java\com\iiordanov\util\ByteBufferStack.java 162915
========================================================
