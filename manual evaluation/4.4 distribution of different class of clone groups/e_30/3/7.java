
    public synchronized void shutdown(String[] args) {
        if (_state == STOPPED)
            return;
        changeState(STOPPING);
        if (_trayManager != null)
            _trayManager.stopManager();
        changeState(STOPPED);
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\apps\desktopgui\src\net\i2p\desktopgui\Main.java 340631
========================================================

    public synchronized void shutdown(String[] args) {
        if (_state == STOPPED)
            return;
        changeState(STOPPING);
        stop();
        changeState(STOPPED);
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\apps\i2pcontrol\java\net\i2p\i2pcontrol\I2PControlController.java 340954
========================================================

    public synchronized void shutdown(String[] args) {
        if (_state == STOPPED)
            return;
        changeState(STOPPING);
        stop();
        changeState(STOPPED);
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\apps\i2pcontrol\java\net\i2p\i2pcontrol\SocketController.java 340963
========================================================
