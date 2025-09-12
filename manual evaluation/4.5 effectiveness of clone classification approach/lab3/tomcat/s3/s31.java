tomcat-main\test\org\apache\catalina\tribes\test\channel\TestDataIntegrity.java    
public void setUp() throws Exception {
    channel1 = new GroupChannel();
    channel1.addInterceptor(new MessageDispatchInterceptor());
    channel2 = new GroupChannel();
    channel2.addInterceptor(new MessageDispatchInterceptor());
    listener1 = new Listener();
    channel2.addChannelListener(listener1);
    TesterUtil.addRandomDomain(new ManagedChannel[] {channel1, channel2});
    channel1.start(Channel.DEFAULT);
    channel2.start(Channel.DEFAULT);
}

/************************************************************************/
tomcat-main\test\org\apache\catalina\tribes\test\channel\TestRemoteProcessException.java
public void setUp() throws Exception {
    channel1 = new GroupChannel();
    channel2 = new GroupChannel();
    listener1 = new Listener();
    channel2.addChannelListener(listener1);
    TesterUtil.addRandomDomain(new ManagedChannel[] {channel1, channel2});
    channel1.start(Channel.DEFAULT);
    channel2.start(Channel.DEFAULT);
}

