
    @Override
    public void close() throws IOException {
      if (closed) {
        return;
      }
      closed = true;
      flush();
      try {
        fileOutputStream.getFD().sync();
      } catch (IOException e) {
        Log.w(TAG, "Failed to sync file descriptor:", e);
      }
      fileOutputStream.close();
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\util\AtomicFile.java 68057
========================================================


    @Override
    public void close() throws IOException {
      if (closed) {
        return;
      }
      closed = true;
      flush();
      try {
        fileOutputStream.getFD().sync();
      } catch (IOException e) {
        Log.w(TAG, "Failed to sync file descriptor:", e);
      }
      fileOutputStream.close();
    }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\common\src\main\java\com\google\android\exoplayer2\util\AtomicFile.java 152335
========================================================
