
  private short[] ensureSpaceForAdditionalFrames(
      short[] buffer, int frameCount, int additionalFrameCount) {
    int currentCapacityFrames = buffer.length / channelCount;
    if (frameCount + additionalFrameCount <= currentCapacityFrames) {
      return buffer;
    } else {
      int newCapacityFrames = 3 * currentCapacityFrames / 2 + additionalFrameCount;
      return Arrays.copyOf(buffer, newCapacityFrames * channelCount);
    }
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\audio\Sonic.java 69869
========================================================

  private short[] ensureSpaceForAdditionalFrames(
      short[] buffer, int frameCount, int additionalFrameCount) {
    int currentCapacityFrames = buffer.length / channelCount;
    if (frameCount + additionalFrameCount <= currentCapacityFrames) {
      return buffer;
    } else {
      int newCapacityFrames = 3 * currentCapacityFrames / 2 + additionalFrameCount;
      return Arrays.copyOf(buffer, newCapacityFrames * channelCount);
    }
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\common\src\main\java\com\google\android\exoplayer2\audio\Sonic.java 152664
========================================================
