tomcat-main\java\org\apache\el\parser\AstAssign.java    
public Object getValue(EvaluationContext ctx) throws ELException {
    Object value = children[1].getValue(ctx);

    children[0].setValue(ctx, value);

    return value;
}

/************************************************************************/
tomcat-main\java\org\apache\el\parser\AstAssign.java
public Class<?> getType(EvaluationContext ctx) throws ELException {
    Object value = children[1].getValue(ctx);

    children[0].setValue(ctx, value);

    return children[1].getType(ctx);
}


