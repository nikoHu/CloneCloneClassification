
    void checkInsert(Session session, Table table, Object[] row) {

        switch (constType) {

            case CHECK :
                if (!isNotNull) {
                    checkCheckConstraint(session, table, row);
                }

                return;

            case FOREIGN_KEY :
                PersistentStore store =
                    session.sessionData.getRowStore(core.mainTable);

                if (ArrayUtil.hasNull(row, core.refCols)) {
                    if (core.matchType == OpTypes.MATCH_SIMPLE) {
                        return;
                    }

                    if (core.refCols.length == 1) {
                        return;
                    }

                    if (ArrayUtil.hasAllNull(row, core.refCols)) {
                        return;
                    }

                    // core.matchType == OpTypes.MATCH_FULL
                } else if (core.mainIndex.exists(session, store, row,
                                                 core.refCols)) {
                    return;
                } else if (core.mainTable == core.refTable) {

                    // special case: self referencing table and self referencing row
                    int compare = core.mainIndex.compareRowNonUnique(row,
                        core.refCols, row);

                    if (compare == 0) {
                        return;
                    }
                }

                String[] info = new String[] {
                    core.refName.name, core.mainTable.getName().name
                };

                throw Error.error(ErrorCode.X_23502, ErrorCode.CONSTRAINT,
                                  info);
        }
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\hsqldb19b3\org\hsqldb\Constraint.java 310329
========================================================
  
    boolean checkHasMainRef(Session session, Object[] row) {

        if (ArrayUtil.hasNull(row, core.refCols)) {
            return false;
        }

        PersistentStore store =
            session.sessionData.getRowStore(core.mainTable);
        boolean exists = core.mainIndex.exists(session, store, row,
                                               core.refCols);

        if (!exists) {
            String[] info = new String[] {
                core.refName.name, core.mainTable.getName().name
            };

            throw Error.error(ErrorCode.X_23502, ErrorCode.CONSTRAINT, info);
        }

        return exists;
    }


D:\_python\clone\CloneClassification\data_new\db\h-store\src\hsqldb19b3\org\hsqldb\Constraint.java 310333
========================================================
