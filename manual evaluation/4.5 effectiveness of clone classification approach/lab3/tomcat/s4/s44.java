tomcat-main\java\org\apache\naming\NamingContext.java   
public void unbind(Name name) throws NamingException {

    if (!checkWritable()) {
        return;
    }

    while ((!name.isEmpty()) && (name.get(0).isEmpty())) {
        name = name.getSuffix(1);
    }
    if (name.isEmpty()) {
        throw new NamingException(sm.getString("namingContext.invalidName"));
    }

    NamingEntry entry = bindings.get(name.get(0));

    if (entry == null) {
        throw new NameNotFoundException(sm.getString("namingContext.nameNotBound", name, name.get(0)));
    }

    if (name.size() > 1) {
        if (entry.type == NamingEntry.CONTEXT) {
            ((Context) entry.value).unbind(name.getSuffix(1));
        } else {
            throw new NamingException(sm.getString("namingContext.contextExpected", name.get(0)));
        }
    } else {
        bindings.remove(name.get(0));
    }

}


/************************************************************************/
tomcat-main\java\org\apache\naming\NamingContext.java
    public void destroySubcontext(Name name) throws NamingException {

        if (!checkWritable()) {
            return;
        }

        while ((!name.isEmpty()) && (name.get(0).isEmpty())) {
            name = name.getSuffix(1);
        }
        if (name.isEmpty()) {
            throw new NamingException(sm.getString("namingContext.invalidName"));
        }

        NamingEntry entry = bindings.get(name.get(0));

        if (entry == null) {
            throw new NameNotFoundException(sm.getString("namingContext.nameNotBound", name, name.get(0)));
        }

        if (name.size() > 1) {
            if (entry.type == NamingEntry.CONTEXT) {
                ((Context) entry.value).destroySubcontext(name.getSuffix(1));
            } else {
                throw new NamingException(sm.getString("namingContext.contextExpected", name.get(0)));
            }
        } else {
            if (entry.type == NamingEntry.CONTEXT) {
                ((Context) entry.value).close();
                bindings.remove(name.get(0));
            } else {
                throw new NotContextException(sm.getString("namingContext.contextExpected", name.get(0)));
            }
        }

    }

