
  @Override
  public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
    Assertions.checkIndex(windowIndex, 0, 1);
    long windowDefaultStartPositionUs = this.windowDefaultStartPositionUs;
    if (isDynamic && !suppressPositionProjection && defaultPositionProjectionUs != 0) {
      if (windowDurationUs == C.TIME_UNSET) {
        // Don't allow projection into a window that has an unknown duration.
        windowDefaultStartPositionUs = C.TIME_UNSET;
      } else {
        windowDefaultStartPositionUs += defaultPositionProjectionUs;
        if (windowDefaultStartPositionUs > windowDurationUs) {
          // The projection takes us beyond the end of the window.
          windowDefaultStartPositionUs = C.TIME_UNSET;
        }
      }
    }
    return window.set(
        Window.SINGLE_WINDOW_UID,
        mediaItem,
        manifest,
        presentationStartTimeMs,
        windowStartTimeMs,
        elapsedRealtimeEpochOffsetMs,
        isSeekable,
        isDynamic,
        liveConfiguration,
        windowDefaultStartPositionUs,
        windowDurationUs,
        /* firstPeriodIndex= */ 0,
        /* lastPeriodIndex= */ 0,
        windowPositionInPeriodUs);
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\source\SinglePeriodTimeline.java 66440
========================================================

  // Provide backwards compatibility.
  @Override
  public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
    Assertions.checkIndex(windowIndex, 0, 1);
    long windowDefaultStartPositionUs = this.windowDefaultStartPositionUs;
    if (isDynamic && !suppressPositionProjection && defaultPositionProjectionUs != 0) {
      if (windowDurationUs == C.TIME_UNSET) {
        // Don't allow projection into a window that has an unknown duration.
        windowDefaultStartPositionUs = C.TIME_UNSET;
      } else {
        windowDefaultStartPositionUs += defaultPositionProjectionUs;
        if (windowDefaultStartPositionUs > windowDurationUs) {
          // The projection takes us beyond the end of the window.
          windowDefaultStartPositionUs = C.TIME_UNSET;
        }
      }
    }
    return window.set(
        Window.SINGLE_WINDOW_UID,
        mediaItem,
        manifest,
        presentationStartTimeMs,
        windowStartTimeMs,
        elapsedRealtimeEpochOffsetMs,
        isSeekable,
        isDynamic,
        liveConfiguration,
        windowDefaultStartPositionUs,
        windowDurationUs,
        /* firstPeriodIndex= */ 0,
        /* lastPeriodIndex= */ 0,
        windowPositionInPeriodUs);
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\source\SinglePeriodTimeline.java 153622
========================================================
