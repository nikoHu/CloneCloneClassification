
    @Override
    public void onResume() {
        if (mapView != null && mapsInitialized) {
            try {
                mapView.onResume();
            } catch (Throwable e) {
                FileLog.e(e);
            }
        }
        onResumeCalled = true;
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\ChatAttachAlertLocationLayout.java 54753
========================================================
 
    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout previousLayout) {
        parentAlert.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (mapView.getView().getParent() == null) {
            mapViewClip.addView(mapView.getView(), 0, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, overScrollHeight + AndroidUtilities.dp(10), Gravity.TOP | Gravity.LEFT));
            mapViewClip.addView(overlayView, 1, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, overScrollHeight + AndroidUtilities.dp(10), Gravity.TOP | Gravity.LEFT));
            mapViewClip.addView(loadingMapView, 2, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        }
        searchItem.setVisibility(VISIBLE);

        if (mapView != null && mapsInitialized) {
            try {
                mapView.onResume();
            } catch (Throwable e) {
                FileLog.e(e);
            }
        }
        onResumeCalled = true;
        if (map != null) {
            try {
                map.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        fixLayoutInternal(true);
        boolean keyboardVisible = parentAlert.delegate.needEnterComment();
        AndroidUtilities.runOnUIThread(() -> {
            if (checkPermission && Build.VERSION.SDK_INT >= 23) {
                Activity activity = getParentActivity();
                if (activity != null) {
                    checkPermission = false;
                    if (activity.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        String[] permissions = parentAlert.isStoryLocationPicker && parentAlert.storyLocationPickerPhotoFile != null && Build.VERSION.SDK_INT >= 29 ?
                            new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_MEDIA_LOCATION} :
                            new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};
                        askedForLocation = true;
                        if (adapter != null) {
                            adapter.setMyLocationDenied(locationDenied, askedForLocation);
                        }
                        activity.requestPermissions(permissions, BasePermissionsActivity.REQUEST_CODE_GEOLOCATION);
                    } else if (Build.VERSION.SDK_INT >= 29 && parentAlert.isStoryLocationPicker && parentAlert.storyLocationPickerPhotoFile != null && activity.checkSelfPermission(Manifest.permission.ACCESS_MEDIA_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        askedForLocation = true;
                        if (adapter != null) {
                            adapter.setMyLocationDenied(locationDenied, askedForLocation);
                        }
                        activity.requestPermissions(new String[]{Manifest.permission.ACCESS_MEDIA_LOCATION}, BasePermissionsActivity.REQUEST_CODE_MEDIA_GEO);
                    }
                }
            }
        }, keyboardVisible ? 200 : 0);

        layoutManager.scrollToPositionWithOffset(0, 0);

        updateClipView();
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\ChatAttachAlertLocationLayout.java 54754
========================================================
