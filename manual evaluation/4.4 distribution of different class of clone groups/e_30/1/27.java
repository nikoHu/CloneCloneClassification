
	public Action createThinkSayBubbleAction(Sprite sprite, SequenceAction sequence,
			AndroidStringProvider androidStringProvider, Formula text, int type) {
		ThinkSayBubbleAction action = action(ThinkSayBubbleAction.class);
		action.setText(text);
		Scope scope = new Scope(ProjectManager.getInstance().getCurrentProject(), sprite, sequence);
		action.setScope(scope);
		action.setAndroidStringProvider(androidStringProvider);
		action.setType(type);
		return action;
	}


D:\_python\clone\CloneClassification\data_new\android\Catroid\catroid\src\main\java\org\catrobat\catroid\content\ActionFactory.java 27607
========================================================

	public Action createThinkSayForBubbleAction(Sprite sprite, SequenceAction sequence,
			AndroidStringProvider androidStringProvider, Formula text, int type) {
		ThinkSayBubbleAction action = action(ThinkSayBubbleAction.class);
		action.setText(text);
		Scope scope = new Scope(ProjectManager.getInstance().getCurrentProject(), sprite, sequence);
		action.setScope(scope);
		action.setAndroidStringProvider(androidStringProvider);
		action.setType(type);
		return action;
	}


D:\_python\clone\CloneClassification\data_new\android\Catroid\catroid\src\main\java\org\catrobat\catroid\content\ActionFactory.java 27608
========================================================
