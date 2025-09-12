

  static
  {
    FILTER_CONSTRUCTOR_MAP.put(UIDFilterConstructor.FILTER_TYPE, new UIDFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(FacetSelectionFilterConstructor.FILTER_TYPE, new FacetSelectionFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(RangeFilterConstructor.FILTER_TYPE, new RangeFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(TermFilterConstructor.FILTER_TYPE, new TermFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(PathFilterConstructor.FILTER_TYPE, new PathFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(TermsFilterConstructor.FILTER_TYPE, new TermsFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(NullFilterConstructor.FILTER_TYPE, new NullFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(CustomFilterConstructor.FILTER_TYPE, new CustomFilterConstructor());
    FILTER_CONSTRUCTOR_MAP.put(ConstExpFilterConstructor.FILTER_TYPE, new ConstExpFilterConstructor());
  }


D:\_python\clone\CloneClassification\data_new\db\sensei\sensei-core\src\main\java\com\senseidb\search\query\filters\FilterConstructor.java 221418
========================================================

  static
  {
    QUERY_CONSTRUCTOR_MAP.put(DistMaxQueryConstructor.QUERY_TYPE, new DistMaxQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(PrefixQueryConstructor.QUERY_TYPE, new PrefixQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(WildcardQueryConstructor.QUERY_TYPE, new WildcardQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(RangeQueryConstructor.QUERY_TYPE, new RangeQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(PathQueryConstructor.QUERY_TYPE, new PathQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(SpanFirstQueryConstructor.QUERY_TYPE, new SpanFirstQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(SpanNearQueryConstructor.QUERY_TYPE, new SpanNearQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(SpanNotQueryConstructor.QUERY_TYPE, new SpanNotQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(SpanOrQueryConstructor.QUERY_TYPE, new SpanOrQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(SpanTermQueryConstructor.QUERY_TYPE, new SpanTermQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(MatchAllQueryConstructor.QUERY_TYPE, new MatchAllQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(TermQueryConstructor.QUERY_TYPE, new TermQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(TermsQueryConstructor.QUERY_TYPE, new TermsQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(UIDQueryConstructor.QUERY_TYPE, new UIDQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(CustomQueryConstructor.QUERY_TYPE, new CustomQueryConstructor());
    QUERY_CONSTRUCTOR_MAP.put(ConstExpQueryConstructor.QUERY_TYPE, new ConstExpQueryConstructor());
  }


D:\_python\clone\CloneClassification\data_new\db\sensei\sensei-core\src\main\java\com\senseidb\search\query\QueryConstructor.java 221455
========================================================
