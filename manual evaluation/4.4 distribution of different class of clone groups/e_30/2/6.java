
    @Override
    public void runLoop() {
        try {
            while(true) {
                doOne();
            }
        } catch (NoConnectionsException e) {
            return;
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(System.err);
            throw new RuntimeException(e);
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\benchmarks\org\voltdb\benchmark\dedupe\ClientBenchmark.java 302651
========================================================

    @Override
    public void runLoop() {
        try {
            while(true) {
                doOne();
            }
        } catch (NoConnectionsException e) {
            return;
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(System.err);
            throw new RuntimeException(e);
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\benchmarks\org\voltdb\benchmark\twentyindex\ClientBenchmark.java 302664
========================================================
