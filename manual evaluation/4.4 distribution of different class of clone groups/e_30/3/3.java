
    public JZlibEncoder(int compressionLevel, int windowBits, int memLevel, byte[] dictionary) {
        ObjectUtil.checkInRange(compressionLevel, 0, 9, "compressionLevel");
        ObjectUtil.checkInRange(windowBits, 9, 15, "windowBits");
        ObjectUtil.checkInRange(memLevel, 1, 9, "memLevel");
        ObjectUtil.checkNotNull(dictionary, "dictionary");

        int resultCode;
        resultCode = z.deflateInit(
                compressionLevel, windowBits, memLevel,
                JZlib.W_ZLIB); // Default: ZLIB format
        if (resultCode != JZlib.Z_OK) {
            ZlibUtil.fail(z, "initialization failure", resultCode);
        } else {
            resultCode = z.deflateSetDictionary(dictionary, dictionary.length);
            if (resultCode != JZlib.Z_OK) {
                ZlibUtil.fail(z, "failed to set the dictionary", resultCode);
            }
        }

        wrapperOverhead = ZlibUtil.wrapperOverhead(ZlibWrapper.ZLIB);
    }


D:\_python\clone\CloneClassification\data_new\network\netty\codec-compression\src\main\java\io\netty\handler\codec\compression\JZlibEncoder.java 353797
========================================================

    public JZlibDecoder(byte[] dictionary, int maxAllocation) {
        super(maxAllocation);
        this.dictionary = ObjectUtil.checkNotNull(dictionary, "dictionary");
        int resultCode;
        resultCode = z.inflateInit(JZlib.W_ZLIB);
        if (resultCode != JZlib.Z_OK) {
            ZlibUtil.fail(z, "initialization failure", resultCode);
        }
    }


D:\_python\clone\CloneClassification\data_new\network\netty\codec-compression\src\main\java\io\netty\handler\codec\compression\JZlibDecoder.java 353820
========================================================
