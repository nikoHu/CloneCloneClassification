
    private boolean parsePackageList() {
        boolean parsed = false;

        final String gamingModeString = Settings.System.getString(getContentResolver(),
                Settings.System.GAMING_MODE_VALUES);

        if (!TextUtils.equals(mGamingPackageList, gamingModeString)) {
            mGamingPackageList = gamingModeString;
            mGamingPackages.clear();
            parseAndAddToMap(gamingModeString, mGamingPackages);
            parsed = true;
        }

        return parsed;
    }


D:\_python\clone\CloneClassification\data_new\android\Resurrection_packages_apps_Settings\src\com\android\settings\rr\fragments\GamingMode.java 78733
========================================================

    private boolean parsePackageList() {
        boolean parsed = false;
        final String blacklistString = Settings.System.getString(getActivity().getContentResolver(),
                Settings.System.SLIM_RECENTS_BLACKLIST_VALUES);

        if (!TextUtils.equals(mBlacklistPackageList, blacklistString)) {
            mBlacklistPackageList = blacklistString;
            mBlacklistPackages.clear();
            parseAndAddToMap(blacklistString, mBlacklistPackages);
            parsed = true;
        }

        return parsed;
    }


D:\_python\clone\CloneClassification\data_new\android\Resurrection_packages_apps_Settings\src\com\android\settings\rr\fragments\SlimRecentsBlacklist.java 78752
========================================================

    private boolean parsePackageList() {
        boolean parsed = false;

        String sensorBlockString = Settings.System.getString(getContentResolver(),
                Settings.System.SENSOR_BLOCKED_APP);

        if (sensorBlockString != null &&
                !TextUtils.equals(mBlockedPackageList, sensorBlockString)) {
            mBlockedPackageList = sensorBlockString;
            mBlockedPackages.clear();
            parseAndAddToMap(sensorBlockString, mBlockedPackages);
            parsed = true;
        }

        return parsed;
    }


D:\_python\clone\CloneClassification\data_new\android\Resurrection_packages_apps_Settings\src\com\android\settings\rr\BatterySettings.java 78961
========================================================
