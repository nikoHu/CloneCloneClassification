

  private static int getMediaItemTransitionReason(
      State previousState,
      State newState,
      int positionDiscontinuityReason,
      boolean isRepeatingCurrentItem,
      Timeline.Window window) {
    Timeline previousTimeline = previousState.timeline;
    Timeline newTimeline = newState.timeline;
    if (newTimeline.isEmpty() && previousTimeline.isEmpty()) {
      return C.INDEX_UNSET;
    } else if (newTimeline.isEmpty() != previousTimeline.isEmpty()) {
      return MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED;
    }
    Object previousWindowUid =
        previousState.timeline.getWindow(getCurrentMediaItemIndexInternal(previousState), window)
            .uid;
    Object newWindowUid =
        newState.timeline.getWindow(getCurrentMediaItemIndexInternal(newState), window).uid;
    if (previousWindowUid instanceof PlaceholderUid && !(newWindowUid instanceof PlaceholderUid)) {
      // An auto-generated placeholder was resolved to a real item.
      return C.INDEX_UNSET;
    }
    if (!previousWindowUid.equals(newWindowUid)) {
      if (positionDiscontinuityReason == DISCONTINUITY_REASON_AUTO_TRANSITION) {
        return MEDIA_ITEM_TRANSITION_REASON_AUTO;
      } else if (positionDiscontinuityReason == DISCONTINUITY_REASON_SEEK) {
        return MEDIA_ITEM_TRANSITION_REASON_SEEK;
      } else {
        return MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED;
      }
    }
    // Only mark changes within the current item as a transition if we are repeating automatically
    // or via a seek to next/previous.
    if (positionDiscontinuityReason == DISCONTINUITY_REASON_AUTO_TRANSITION
        && getContentPositionMsInternal(previousState) > getContentPositionMsInternal(newState)) {
      return MEDIA_ITEM_TRANSITION_REASON_REPEAT;
    }
    if (positionDiscontinuityReason == DISCONTINUITY_REASON_SEEK && isRepeatingCurrentItem) {
      return MEDIA_ITEM_TRANSITION_REASON_SEEK;
    }
    return C.INDEX_UNSET;
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\SimpleBasePlayer.java 67424
========================================================


  private static int getMediaItemTransitionReason(
      State previousState,
      State newState,
      int positionDiscontinuityReason,
      boolean isRepeatingCurrentItem,
      Timeline.Window window) {
    Timeline previousTimeline = previousState.timeline;
    Timeline newTimeline = newState.timeline;
    if (newTimeline.isEmpty() && previousTimeline.isEmpty()) {
      return C.INDEX_UNSET;
    } else if (newTimeline.isEmpty() != previousTimeline.isEmpty()) {
      return MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED;
    }
    Object previousWindowUid =
        previousState.timeline.getWindow(getCurrentMediaItemIndexInternal(previousState), window)
            .uid;
    Object newWindowUid =
        newState.timeline.getWindow(getCurrentMediaItemIndexInternal(newState), window).uid;
    if (previousWindowUid instanceof PlaceholderUid && !(newWindowUid instanceof PlaceholderUid)) {
      // An auto-generated placeholder was resolved to a real item.
      return C.INDEX_UNSET;
    }
    if (!previousWindowUid.equals(newWindowUid)) {
      if (positionDiscontinuityReason == DISCONTINUITY_REASON_AUTO_TRANSITION) {
        return MEDIA_ITEM_TRANSITION_REASON_AUTO;
      } else if (positionDiscontinuityReason == DISCONTINUITY_REASON_SEEK) {
        return MEDIA_ITEM_TRANSITION_REASON_SEEK;
      } else {
        return MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED;
      }
    }
    // Only mark changes within the current item as a transition if we are repeating automatically
    // or via a seek to next/previous.
    if (positionDiscontinuityReason == DISCONTINUITY_REASON_AUTO_TRANSITION
        && getContentPositionMsInternal(previousState) > getContentPositionMsInternal(newState)) {
      return MEDIA_ITEM_TRANSITION_REASON_REPEAT;
    }
    if (positionDiscontinuityReason == DISCONTINUITY_REASON_SEEK && isRepeatingCurrentItem) {
      return MEDIA_ITEM_TRANSITION_REASON_SEEK;
    }
    return C.INDEX_UNSET;
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\common\src\main\java\com\google\android\exoplayer2\SimpleBasePlayer.java 152174
========================================================
