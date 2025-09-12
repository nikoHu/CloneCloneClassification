
    public static DataEmitter getWrappedDataEmitter(DataEmitter emitter, Class wrappedClass) {
        if (wrappedClass.isInstance(emitter))
            return emitter;
        while (emitter instanceof DataEmitterWrapper) {
            emitter = ((AsyncSocketWrapper)emitter).getSocket();
            if (wrappedClass.isInstance(emitter))
                return emitter;
        }
        return null;
    }


D:\_python\clone\CloneClassification\data_new\android\RemoteDroid\app\src\main\java\com\koushikdutta\async\Util.java 36052
========================================================


    public static DataEmitter getWrappedDataEmitter(DataEmitter emitter, Class wrappedClass) {
        if (wrappedClass.isInstance(emitter))
            return emitter;
        while (emitter instanceof DataEmitterWrapper) {
            emitter = ((AsyncSocketWrapper)emitter).getSocket();
            if (wrappedClass.isInstance(emitter))
                return emitter;
        }
        return null;
    }


D:\_python\clone\CloneClassification\data_new\network\AndroidAsync\AndroidAsync\src\com\koushikdutta\async\Util.java 342236
========================================================
