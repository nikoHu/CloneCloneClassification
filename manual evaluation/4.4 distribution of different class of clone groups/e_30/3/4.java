
    public void onServiceConnected(ComponentName className, IBinder service) {
        if (false) {
            Log.v(TAG, "Connected to Media Scanner");
        }
        synchronized (this) {
            mService = IMediaScannerService.Stub.asInterface(service);
            if (mService != null && mClient != null) {
                mClient.onMediaScannerConnected();
            }
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\android\media\MediaScannerConnection.java 111134
========================================================

    public void onServiceDisconnected(ComponentName className) {
        if (false) {
            Log.v(TAG, "Disconnected from Media Scanner");
        }
        synchronized (this) {
            mService = null;
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\android\media\MediaScannerConnection.java 111135
========================================================
