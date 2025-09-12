

    public boolean canEditStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        if (storyItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (storyItem.dialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(currentAccount).getUser(storyItem.dialogId);
            if (user != null && user.bot && user.bot_can_edit) {
                return true;
            }
        }
        if (storyItem.dialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(-storyItem.dialogId);
            if (chat == null) {
                return false;
            }
            if (chat.creator) {
                return true;
            }
            if (storyItem.out && chat.admin_rights != null && (chat.admin_rights.post_stories || chat.admin_rights.edit_stories)) {
                return true;
            }
            if (!storyItem.out && chat.admin_rights != null && chat.admin_rights.edit_stories) {
                return true;
            }
        }
        return false;
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Stories\StoriesController.java 46440
========================================================
  

    public boolean canDeleteStory(TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return false;
        }
        if (storyItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (storyItem.dialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(currentAccount).getUser(storyItem.dialogId);
            if (user != null && user.bot && user.bot_can_edit) {
                return true;
            }
        }
        if (storyItem.dialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(-storyItem.dialogId);
            if (chat == null) {
                return false;
            }
            if (chat.creator) {
                return true;
            }
            if (storyItem.out && chat.admin_rights != null && (chat.admin_rights.post_stories || chat.admin_rights.delete_stories)) {
                return true;
            }
            if (!storyItem.out && chat.admin_rights != null && chat.admin_rights.delete_stories) {
                return true;
            }
        }
        return false;
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Stories\StoriesController.java 46441
========================================================
