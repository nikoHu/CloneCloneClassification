
  protected final void setOutput(@Nullable Object output) {
    if (output instanceof Surface) {
      outputSurface = (Surface) output;
      outputBufferRenderer = null;
      outputMode = C.VIDEO_OUTPUT_MODE_SURFACE_YUV;
    } else if (output instanceof VideoDecoderOutputBufferRenderer) {
      outputSurface = null;
      outputBufferRenderer = (VideoDecoderOutputBufferRenderer) output;
      outputMode = C.VIDEO_OUTPUT_MODE_YUV;
    } else {
      // Handle unsupported outputs by clearing the output.
      output = null;
      outputSurface = null;
      outputBufferRenderer = null;
      outputMode = C.VIDEO_OUTPUT_MODE_NONE;
    }
    if (this.output != output) {
      this.output = output;
      if (output != null) {
        if (decoder != null) {
          setDecoderOutputMode(outputMode);
        }
        onOutputChanged();
      } else {
        // The output has been removed. We leave the outputMode of the underlying decoder unchanged
        // in anticipation that a subsequent output will likely be of the same type.
        onOutputRemoved();
      }
    } else if (output != null) {
      // The output is unchanged and non-null.
      onOutputReset();
    }
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\video\DecoderVideoRenderer.java 69427
========================================================

  protected abstract void renderOutputBufferToSurface(
      VideoDecoderOutputBuffer outputBuffer, Surface surface) throws DecoderException;

  /** Sets the video output. */
  protected final void setOutput(@Nullable Object output) {
    if (output instanceof Surface) {
      outputSurface = (Surface) output;
      outputBufferRenderer = null;
      outputMode = C.VIDEO_OUTPUT_MODE_SURFACE_YUV;
    } else if (output instanceof VideoDecoderOutputBufferRenderer) {
      outputSurface = null;
      outputBufferRenderer = (VideoDecoderOutputBufferRenderer) output;
      outputMode = C.VIDEO_OUTPUT_MODE_YUV;
    } else {
      // Handle unsupported outputs by clearing the output.
      output = null;
      outputSurface = null;
      outputBufferRenderer = null;
      outputMode = C.VIDEO_OUTPUT_MODE_NONE;
    }
    if (this.output != output) {
      this.output = output;
      if (output != null) {
        if (decoder != null) {
          setDecoderOutputMode(outputMode);
        }
        onOutputChanged();
      } else {
        // The output has been removed. We leave the outputMode of the underlying decoder unchanged
        // in anticipation that a subsequent output will likely be of the same type.
        onOutputRemoved();
      }
    } else if (output != null) {
      // The output is unchanged and non-null.
      onOutputReset();
    }
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\video\DecoderVideoRenderer.java 154517
========================================================
