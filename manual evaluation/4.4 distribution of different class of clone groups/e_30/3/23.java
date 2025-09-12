

  @Override
  public void release() {
    synchronized (lock) {
      if (Util.SDK_INT >= 32 && spatializer != null) {
        spatializer.release();
      }
    }
    super.release();
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\trackselection\DefaultTrackSelector.java 67917
========================================================


  @Override
  public void release() {
    synchronized (lock) {
      if (Util.SDK_INT >= 32 && spatializer != null) {
        spatializer.release();
      }
    }
    super.release();
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\trackselection\DefaultTrackSelector.java 154102
========================================================
