
    public boolean checkCompliant(){
        checkValid();
        try{
            driverParamCheckGE(      "iConfiguredCustomerCount", (int)cur_iConfiguredCustomerCount, 5000);
            driverParamCheckGE(      "iActiveCustomerCount",     (int)cur_iActiveCustomerCount,     5000);
            driverParamCheckEqual(   "iActiveCustomerCount",     (int)cur_iActiveCustomerCount, (int)cur_iConfiguredCustomerCount);
            driverParamCheckDefault( dft_iScaleFactor, cur_iScaleFactor, "iScaleFactor" );
            driverParamCheckDefault( dft_iDaysOfInitialTrades, cur_iDaysOfInitialTrades, "iDaysOfInitialTrades" );
            return true;
        }catch(CheckException e){
            return false;
        }
        
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\benchmarks\edu\brown\benchmark\tpce\generators\TDriverCETxnSettings.java 303385
========================================================

    public boolean checkCompliant() {
        checkValid();
        try{
            driverParamCheckGE(      "iConfiguredCustomerCount", (int)cur_iConfiguredCustomerCount, 5000);
            driverParamCheckGE(      "iActiveCustomerCount",     (int)cur_iActiveCustomerCount,     5000);
            driverParamCheckEqual(   "iActiveCustomerCount",     (int)cur_iActiveCustomerCount, (int)cur_iConfiguredCustomerCount);
            driverParamCheckDefault( dft_iScaleFactor, cur_iScaleFactor, "iScaleFactor" );
            driverParamCheckDefault( dft_iDaysOfInitialTrades, cur_iDaysOfInitialTrades, "iDaysOfInitialTrades" );
            return true;
        }catch(CheckException e){
            return false;
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\benchmarks\edu\brown\benchmark\tpce\generators\TDriverCETxnSettings.java 303390
========================================================
