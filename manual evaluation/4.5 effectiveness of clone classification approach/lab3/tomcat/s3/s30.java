tomcat-main\test\org\apache\catalina\realm\TestGenericPrincipal.java    
private GenericPrincipal serializeAndDeserialize(GenericPrincipal gpIn)
        throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(gpIn);

    byte[] data = bos.toByteArray();

    ByteArrayInputStream bis = new ByteArrayInputStream(data);
    ObjectInputStream ois = new ObjectInputStream(bis);
    return (GenericPrincipal) ois.readObject();
}

/************************************************************************/
tomcat-main\test\org\apache\catalina\users\TestMemoryUserDatabase.java
public void testSerializePrincipal()
    throws Exception {
    User user = db.findUser("admin");
    GenericPrincipal gpIn = new UserDatabaseRealm.UserDatabasePrincipal(user, db);
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(gpIn);

    byte[] data = bos.toByteArray();

    ByteArrayInputStream bis = new ByteArrayInputStream(data);
    ObjectInputStream ois = new ObjectInputStream(bis);
    GenericPrincipal gpOut =  (GenericPrincipal) ois.readObject();

    Assert.assertEquals("admin", gpOut.getName());
    assertPrincipalNames(gpOut.getRoles(), user.getRoles());
}

