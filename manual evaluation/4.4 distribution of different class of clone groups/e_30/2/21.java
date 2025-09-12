
    static synchronized void setEnabledSingleShiftTables(int[] tables) {
        sEnabledSingleShiftTables = tables;
        sDisableCountryEncodingCheck = true;

        if (tables.length > 0) {
            sHighestEnabledSingleShiftCode = tables[tables.length - 1];
        } else {
            sHighestEnabledSingleShiftCode = 0;
        }
    }


D:\_python\clone\CloneClassification\data_new\android\android-smsmms\library\src\main\java\com\android\internal\telephony\GsmAlphabet.java 30781
========================================================

    private static void enableCountrySpecificEncodings() {
        // See comments in frameworks/base/core/res/res/values/config.xml for allowed values
        sEnabledSingleShiftTables = new int[1];
        sEnabledLockingShiftTables = new int[1];

        if (sEnabledSingleShiftTables.length > 0) {
            sHighestEnabledSingleShiftCode =
                    sEnabledSingleShiftTables[sEnabledSingleShiftTables.length - 1];
        } else {
            sHighestEnabledSingleShiftCode = 0;
        }
    }


D:\_python\clone\CloneClassification\data_new\android\android-smsmms\library\src\main\java\com\android\internal\telephony\GsmAlphabet.java 30782
========================================================

    static synchronized void setEnabledSingleShiftTables(int[] tables) {
        sEnabledSingleShiftTables = tables;

        if (tables.length > 0) {
            sHighestEnabledSingleShiftCode = tables[tables.length - 1];
        } else {
            sHighestEnabledSingleShiftCode = 0;
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\com\android\internal\telephony\GsmAlphabet.java 131091
========================================================
