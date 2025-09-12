
        public static DFSCondition dfs(HGHandle start, 
									   HGAtomPredicate linkPredicate, 
									   HGAtomPredicate siblingPredicate,
									   boolean returnPreceeding,
									   boolean returnSucceeding) 
		{ 
			DFSCondition c = new DFSCondition(start);
			c.setLinkPredicate(linkPredicate);
			c.setSiblingPredicate(siblingPredicate);
			c.setReturnPreceeding(returnPreceeding);
			c.setReturnSucceeding(returnSucceeding);
			return c;
		}


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\HGQuery.java 7244
========================================================
     
        public static DFSCondition dfs(Ref<HGHandle> start, 
									   HGAtomPredicate linkPredicate, 
									   HGAtomPredicate siblingPredicate,
									   boolean returnPreceeding,
									   boolean returnSucceeding) 
		{ 
			DFSCondition c = new DFSCondition(start);
			c.setLinkPredicate(linkPredicate);
			c.setSiblingPredicate(siblingPredicate);
			c.setReturnPreceeding(returnPreceeding);
			c.setReturnSucceeding(returnSucceeding);
			return c;
		}


D:\_python\clone\CloneClassification\data_new\algorithm\hypergraphdb\core\src\java\org\hypergraphdb\HGQuery.java 7245
========================================================
