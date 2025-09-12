
    public AuthenticationHelperImpl(SipStackImpl sipStack, AccountManager accountManager,
            HeaderFactory headerFactory) {
        this.accountManager = accountManager;
        this.headerFactory = headerFactory;
        this.sipStack = sipStack;

        this.cachedCredentials = new CredentialsCache(((SIPTransactionStack) sipStack).getTimer());
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\gov\nist\javax\sip\clientauthutils\AuthenticationHelperImpl.java 123474
========================================================

    public AuthenticationHelperImpl(SipStackImpl sipStack, SecureAccountManager accountManager,
            HeaderFactory headerFactory) {
        this.accountManager = accountManager;
        this.headerFactory = headerFactory;
        this.sipStack = sipStack;

        this.cachedCredentials = new CredentialsCache(((SIPTransactionStack) sipStack).getTimer());
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\gov\nist\javax\sip\clientauthutils\AuthenticationHelperImpl.java 123475
========================================================
