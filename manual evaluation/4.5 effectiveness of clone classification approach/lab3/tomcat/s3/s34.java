tomcat-main\test\org\apache\catalina\tribes\test\channel\TestDataIntegrity.java        
public static Data createRandomData() {
    int i = r.nextInt();
    i = ( i % 127 );
    int length = Math.abs(r.nextInt() % 65555);
    Data d = new Data();
    d.length = length;
    d.key = (byte)i;
    d.data = new byte[length];
    Arrays.fill(d.data,d.key);
    return d;
}

/************************************************************************/
tomcat-main\test\org\apache\catalina\tribes\test\channel\TestRemoteProcessException.java
public static Data createRandomData(boolean error) {
    int i = r.nextInt();
    i = ( i % 127 );
    int length = Math.abs(r.nextInt() % 65555);
    Data d = new Data();
    d.length = length;
    d.key = (byte)i;
    d.data = new byte[length];
    Arrays.fill(d.data,d.key);
    d.error = error;
    return d;
}

