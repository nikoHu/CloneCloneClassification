
    public void writePriKeyField(Object o, EntityOutput output)
        throws RefreshException {

        try {
            if (priKey != null) {
                priKey.write(o, output);
            } else if (superAccessor != null) {
                superAccessor.writePriKeyField(o, output);
            } else {
                throw DbCompat.unexpectedState("No primary key field");
            }
        } catch (IllegalAccessException e) {
            throw DbCompat.unexpectedException(e);
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\third_party\cpp\berkeleydb\lang\java\src\com\sleepycat\persist\impl\ReflectionAccessor.java 313066
========================================================

    public void readPriKeyField(Object o, EntityInput input)
        throws RefreshException {

        try {
            if (priKey != null) {
                priKey.read(o, input);
            } else if (superAccessor != null) {
                superAccessor.readPriKeyField(o, input);
            } else {
                throw DbCompat.unexpectedState("No primary key field");
            }
        } catch (IllegalAccessException e) {
            throw DbCompat.unexpectedException(e);
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\third_party\cpp\berkeleydb\lang\java\src\com\sleepycat\persist\impl\ReflectionAccessor.java 313067
========================================================
