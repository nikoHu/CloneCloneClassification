
  ByteArrayEncodingState(RawErasureEncoder encoder,
                         byte[][] inputs, byte[][] outputs) {
    this.encoder = encoder;
    byte[] validInput = CoderUtil.findFirstValidInput(inputs);
    this.encodeLength = validInput.length;
    this.inputs = inputs;
    this.outputs = outputs;

    checkParameters(inputs, outputs);
    checkBuffers(inputs);
    checkBuffers(outputs);

    this.inputOffsets = new int[inputs.length]; // ALL ZERO
    this.outputOffsets = new int[outputs.length]; // ALL ZERO
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\io\erasurecode\rawcoder\ByteArrayEncodingState.java 88865
========================================================

  ByteArrayDecodingState(RawErasureDecoder decoder, byte[][] inputs,
                         int[] erasedIndexes, byte[][] outputs) {
    this.decoder = decoder;
    this.inputs = inputs;
    this.outputs = outputs;
    this.erasedIndexes = erasedIndexes;
    byte[] validInput = CoderUtil.findFirstValidInput(inputs);
    this.decodeLength = validInput.length;

    checkParameters(inputs, erasedIndexes, outputs);
    checkInputBuffers(inputs);
    checkOutputBuffers(outputs);

    this.inputOffsets = new int[inputs.length]; // ALL ZERO
    this.outputOffsets = new int[outputs.length]; // ALL ZERO
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\io\erasurecode\rawcoder\ByteArrayDecodingState.java 88886
========================================================
