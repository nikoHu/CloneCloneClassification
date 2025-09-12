
    public static void pipeAll(InputStream inStr, OutputStream outStr)
        throws IOException
    {
        byte[] bs = new byte[BUFFER_SIZE];
        int numRead;
        while ((numRead = inStr.read(bs, 0, bs.length)) >= 0)
        {
            outStr.write(bs, 0, numRead);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\org\bouncycastle\util\io\Streams.java 108989
========================================================

    public static long pipeAllLimited(InputStream inStr, long limit, OutputStream outStr)
        throws IOException
    {
        long total = 0;
        byte[] bs = new byte[BUFFER_SIZE];
        int numRead;
        while ((numRead = inStr.read(bs, 0, bs.length)) >= 0)
        {
            total += numRead;
            if (total > limit)
            {
                throw new StreamOverflowException("Data Overflow");
            }
            outStr.write(bs, 0, numRead);
        }
        return total;
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\org\bouncycastle\util\io\Streams.java 108990
========================================================
