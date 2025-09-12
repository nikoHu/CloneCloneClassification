
  protected void parseLiteralVariableBlockComment() {
    String variableName = tokenType.extract(token);
    if (variableName.isEmpty()) {
      throw new JdbcException(
          Message.DOMA2228, sql, tokenizer.getLineNumber(), tokenizer.getPosition(), token);
    }
    LiteralVariableNode node = new LiteralVariableNode(getLocation(), variableName, token);
    InNode inNode = findInNode();
    node.setInNode(inNode);
    appendNode(node);
    push(node);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\internal\jdbc\sql\SqlParser.java 242502
========================================================


  protected void parseEmbeddedVariableBlockComment() {
    String variableName = tokenType.extract(token);
    if (variableName.isEmpty()) {
      throw new JdbcException(
          Message.DOMA2121, sql, tokenizer.getLineNumber(), tokenizer.getPosition(), token);
    }
    EmbeddedVariableNode node = new EmbeddedVariableNode(getLocation(), variableName, token);
    appendNode(node);
    push(node);
  }


D:\_python\clone\CloneClassification\data_new\db\doma\doma-core\src\main\java\org\seasar\doma\internal\jdbc\sql\SqlParser.java 242503
========================================================
