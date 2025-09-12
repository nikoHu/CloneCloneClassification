tomcat-main\java\org\apache\tomcat\dbcp\dbcp2\cpdsadapter\PooledConnectionImpl.java    
CallableStatement prepareCall(final String sql) throws SQLException {
    if (pStmtPool == null) {
        return getRawConnection().prepareCall(sql);
    }
    try {
        return (CallableStatement) pStmtPool.borrowObject(createKey(sql, StatementType.CALLABLE_STATEMENT));
    } catch (final RuntimeException e) {
        throw e;
    } catch (final Exception e) {
        throw new SQLException("Borrow prepareCall from pool failed", e);
    }
}


/************************************************************************/
tomcat-main\java\org\apache\tomcat\dbcp\dbcp2\cpdsadapter\PooledConnectionImpl.java
CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency)
        throws SQLException {
    if (pStmtPool == null) {
        return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency);
    }
    try {
        return (CallableStatement) pStmtPool.borrowObject(
                createKey(sql, resultSetType, resultSetConcurrency, StatementType.CALLABLE_STATEMENT));
    } catch (final RuntimeException e) {
        throw e;
    } catch (final Exception e) {
        throw new SQLException("Borrow prepareCall from pool failed", e);
    }
}


/************************************************************************/
tomcat-main\java\org\apache\tomcat\dbcp\dbcp2\cpdsadapter\PooledConnectionImpl.java
CallableStatement prepareCall(final String sql, final int resultSetType, final int resultSetConcurrency,
        final int resultSetHoldability) throws SQLException {
    if (pStmtPool == null) {
        return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }
    try {
        return (CallableStatement) pStmtPool.borrowObject(createKey(sql, resultSetType, resultSetConcurrency,
                resultSetHoldability, StatementType.CALLABLE_STATEMENT));
    } catch (final RuntimeException e) {
        throw e;
    } catch (final Exception e) {
        throw new SQLException("Borrow prepareCall from pool failed", e);
    }
}


