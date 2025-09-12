
  @Override
  protected void logTransactionBegun(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241525
========================================================


  @Override
  protected void logTransactionEnded(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241526
========================================================


  @Override
  protected void logTransactionSavepointCreated(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      String savepointName,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241527
========================================================

  @Override
  protected void logTransactionCommitted(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241528
========================================================


  @Override
  protected void logTransactionRolledback(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241529
========================================================

  @Override
  protected void logTransactionSavepointRolledback(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      String savepointName,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241530
========================================================
 
  @Override
  protected void logTransactionSavepointReleased(
      String callerClassName,
      String callerMethodName,
      String transactionId,
      String savepointName,
      Level level,
      Supplier<String> messageSupplier) {
    log(
        LogKind.LOCAL_TRANSACTION.fullName(),
        level,
        callerClassName,
        callerMethodName,
        null,
        messageSupplier);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-slf4j\src\main\java\org\seasar\doma\slf4j\Slf4jJdbcLogger.java 241531
========================================================
