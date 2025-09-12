

  public static void scheduleAppToUserNotification(
      String title,
      String body,
      Bitmap media,
      int timeInterval,
      @Nullable String payload,
      GraphRequest.Callback callback)
      throws FileNotFoundException {
    MediaUploadCallback mediaUploadCallback =
        new MediaUploadCallback(title, body, timeInterval, payload, callback);
    Bundle parameters = getParameters();
    GamingMediaUploader.uploadToGamingServices(
        SDKConstants.PARAM_A2U_CAPTION, media, parameters, mediaUploadCallback);
  }


D:\_python\clone\CloneClassification\data_new\android\facebook-android-sdk\facebook-gamingservices\src\main\java\com\facebook\gamingservices\cloudgaming\AppToUserNotificationSender.java 35239
========================================================

  public static void scheduleAppToUserNotification(
      String title,
      String body,
      File media,
      int timeInterval,
      @Nullable String payload,
      GraphRequest.Callback callback)
      throws FileNotFoundException {
    MediaUploadCallback mediaUploadCallback =
        new MediaUploadCallback(title, body, timeInterval, payload, callback);
    Bundle parameters = getParameters();
    GamingMediaUploader.uploadToGamingServices(
        SDKConstants.PARAM_A2U_CAPTION, media, parameters, mediaUploadCallback);
  }


D:\_python\clone\CloneClassification\data_new\android\facebook-android-sdk\facebook-gamingservices\src\main\java\com\facebook\gamingservices\cloudgaming\AppToUserNotificationSender.java 35240
========================================================
  }

  public static void scheduleAppToUserNotification(
      String title,
      String body,
      Uri media,
      int timeInterval,
      @Nullable String payload,
      GraphRequest.Callback callback)
      throws FileNotFoundException {
    MediaUploadCallback mediaUploadCallback =
        new MediaUploadCallback(title, body, timeInterval, payload, callback);
    Bundle parameters = getParameters();
    GamingMediaUploader.uploadToGamingServices(
        SDKConstants.PARAM_A2U_CAPTION, media, parameters, mediaUploadCallback);
  }


D:\_python\clone\CloneClassification\data_new\android\facebook-android-sdk\facebook-gamingservices\src\main\java\com\facebook\gamingservices\cloudgaming\AppToUserNotificationSender.java 35241
========================================================
