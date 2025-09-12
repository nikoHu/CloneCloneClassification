
    public Function newInstance(int position, ObjList<Function> args, IntList argPositions, CairoConfiguration configuration, SqlExecutionContext sqlExecutionContext) {
        Function func = args.getQuick(0);
        if (func.isConstant()) {
            StringSink sink = Misc.getThreadLocalSink();
            sink.put(func.getDate(null));
            return new StrConstant(Chars.toString(sink));
        }
        return new Func(args.getQuick(0));
    }


D:\_python\clone\CloneClassification\data_new\db\questdb\core\src\main\java\io\questdb\griffin\engine\functions\cast\CastDateToStrFunctionFactory.java 226139
========================================================

    public Function newInstance(
            int position,
            ObjList<Function> args,
            IntList argPositions,
            CairoConfiguration configuration,
            SqlExecutionContext sqlExecutionContext
    ) {
        Function func = args.getQuick(0);
        if (func.isConstant()) {
            StringSink sink = Misc.getThreadLocalSink();
            sink.put(func.getDate(null));
            return new VarcharConstant(Chars.toString(sink));
        }
        return new Func(args.getQuick(0));
    }


D:\_python\clone\CloneClassification\data_new\db\questdb\core\src\main\java\io\questdb\griffin\engine\functions\cast\CastDateToVarcharFunctionFactory.java 226203
========================================================
