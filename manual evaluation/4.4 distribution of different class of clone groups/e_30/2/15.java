
    private static boolean passcode() {
        final int uptime = (int) (SystemClock.elapsedRealtime() / 1000);
        return (
            SharedConfig.passcodeHash.length() > 0 && (
                SharedConfig.appLocked ||
                SharedConfig.autoLockIn != 0 && SharedConfig.lastPauseTime != 0 && (SharedConfig.lastPauseTime + SharedConfig.autoLockIn) <= uptime ||
                uptime + 5 < SharedConfig.lastPauseTime
            )
        );
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\messenger\MusicBrowserService.java 62243
========================================================


    public static boolean needShowPasscode(boolean reset) {
        boolean wasInBackground = ForegroundDetector.getInstance().isWasInBackground(reset);
        if (reset) {
            ForegroundDetector.getInstance().resetBackgroundVar();
        }
        int uptime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (BuildVars.LOGS_ENABLED && reset && SharedConfig.passcodeHash.length() > 0) {
            FileLog.d("wasInBackground = " + wasInBackground + " appLocked = " + SharedConfig.appLocked + " autoLockIn = " + SharedConfig.autoLockIn + " lastPauseTime = " + SharedConfig.lastPauseTime + " uptime = " + uptime);
        }
        return SharedConfig.passcodeHash.length() > 0 && wasInBackground &&
                (SharedConfig.appLocked ||
                        SharedConfig.autoLockIn != 0 && SharedConfig.lastPauseTime != 0 && !SharedConfig.appLocked && (SharedConfig.lastPauseTime + SharedConfig.autoLockIn) <= uptime ||
                        uptime + 5 < SharedConfig.lastPauseTime);
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\messenger\AndroidUtilities.java 64106
========================================================
