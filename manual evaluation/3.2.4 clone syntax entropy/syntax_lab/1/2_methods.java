   */
  private NewApplication createNewApplication() {
    GetNewApplicationRequest req =
        recordFactory.newRecordInstance(GetNewApplicationRequest.class);
    GetNewApplicationResponse resp;
    try {
      resp = rm.getClientRMService().getNewApplication(req);
    } catch (YarnException e) {
      String msg = "Unable to create new app from RM web service";
      LOG.error(msg, e);
      throw new YarnRuntimeException(msg, e);
    }
    NewApplication appId =
        new NewApplication(resp.getApplicationId().toString(),
            new ResourceInfo(resp.getMaximumResourceCapability()));
    return appId;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\webapp\RMWebServices.java 64272
========================================================
   */
  private NewReservation createNewReservation() throws IOException {
    GetNewReservationRequest req =
        recordFactory.newRecordInstance(GetNewReservationRequest.class);
    GetNewReservationResponse resp;
    try {
      resp = rm.getClientRMService().getNewReservation(req);
    } catch (YarnException e) {
      String msg = "Unable to create new reservation from RM web service";
      LOG.error(msg, e);
      throw new YarnRuntimeException(msg, e);
    }
    NewReservation reservationId =
        new NewReservation(resp.getReservationId().toString());
    return reservationId;
  }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\webapp\RMWebServices.java 64282
========================================================
