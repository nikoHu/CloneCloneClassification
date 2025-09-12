

  public static long getDocumentSize(@Nullable String contentRangeHeader) {
    if (TextUtils.isEmpty(contentRangeHeader)) {
      return C.LENGTH_UNSET;
    }
    Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(contentRangeHeader);
    return matcher.matches() ? Long.parseLong(checkNotNull(matcher.group(1))) : C.LENGTH_UNSET;
  }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\upstream\HttpUtil.java 67523
========================================================

  public static long getDocumentSize(@Nullable String contentRangeHeader) {
    if (TextUtils.isEmpty(contentRangeHeader)) {
      return C.LENGTH_UNSET;
    }
    Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(contentRangeHeader);
    return matcher.matches() ? Long.parseLong(checkNotNull(matcher.group(1))) : C.LENGTH_UNSET;
  }


D:\_python\clone\CloneClassification\data_new\android\ExoPlayer\library\datasource\src\main\java\com\google\android\exoplayer2\upstream\HttpUtil.java 156882
========================================================
