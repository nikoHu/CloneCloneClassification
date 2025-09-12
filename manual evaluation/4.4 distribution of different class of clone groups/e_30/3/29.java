
    public TLRPC.Document getStarGiftDocument(String emoji) {
        TLRPC.TL_messages_stickerSet set;
        TLRPC.Document document = null;

        final String packName = "RestrictedEmoji";
        set = MediaDataController.getInstance(currentAccount).getStickerSetByName(packName);
        if (set == null) {
            set = MediaDataController.getInstance(currentAccount).getStickerSetByEmojiOrName(packName);
        }
        if (set != null) {
            for (int i = 0; i < set.packs.size(); ++i) {
                TLRPC.TL_stickerPack pack = set.packs.get(i);
                if (TextUtils.equals(pack.emoticon, emoji) && !pack.documents.isEmpty()) {
                    long documentId = pack.documents.get(0);
                    for (int j = 0; j < set.documents.size(); ++j) {
                        TLRPC.Document d = set.documents.get(j);
                        if (d != null && d.id == documentId) {
                            document = d;
                            break;
                        }
                    }
                    break;
                }
            }
            if (document == null && !set.documents.isEmpty()) {
                document = set.documents.get(0);
            }
        }
        return document;
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Gifts\GiftSheet.java 45917
========================================================


    public static Runnable setStarGiftImage(View view, ImageReceiver imageReceiver, String emoji) {
        final boolean[] played = new boolean[1];
        final int currentAccount = imageReceiver.getCurrentAccount();
        Runnable setImage = () -> {
            TLRPC.TL_messages_stickerSet set;
            TLRPC.Document document = null;

            final String packName = "RestrictedEmoji";
            set = MediaDataController.getInstance(currentAccount).getStickerSetByName(packName);
            if (set == null) {
                set = MediaDataController.getInstance(currentAccount).getStickerSetByEmojiOrName(packName);
            }
            if (set != null) {
                for (int i = 0; i < set.packs.size(); ++i) {
                    TLRPC.TL_stickerPack pack = set.packs.get(i);
                    if (TextUtils.equals(pack.emoticon, emoji) && !pack.documents.isEmpty()) {
                        long documentId = pack.documents.get(0);
                        for (int j = 0; j < set.documents.size(); ++j) {
                            TLRPC.Document d = set.documents.get(j);
                            if (d != null && d.id == documentId) {
                                document = d;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (document == null && !set.documents.isEmpty()) {
                    document = set.documents.get(0);
                }
            }

            if (document != null) {
                imageReceiver.setAllowStartLottieAnimation(true);
                imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                    @Override
                    public void didSetImage(ImageReceiver imageReceiver, boolean set, boolean thumb, boolean memCache) {
                        if (set) {
                            RLottieDrawable drawable = imageReceiver.getLottieAnimation();
                            if (drawable != null && !played[0]) {
                                drawable.setCurrentFrame(0, false);
                                AndroidUtilities.runOnUIThread(drawable::restart);
                                played[0] = true;
                            }
                        }
                    }
                });
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                imageReceiver.setAutoRepeat(0);
                imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr", 160, 160), svgThumb, "tgs", set, 1);
            } else {
                MediaDataController.getInstance(currentAccount).loadStickersByEmojiOrName(packName, false, set == null);
            }
        };
        setImage.run();
        final Runnable cancel1 = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.didUpdatePremiumGiftStickers, args -> setImage.run());
        final Runnable cancel2 = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, args -> setImage.run());
        return () -> {
            cancel1.run();
            cancel2.run();
        };
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Gifts\GiftSheet.java 45918
========================================================


    public static Runnable setGiftImage(View view, ImageReceiver imageReceiver, String emoji, boolean isTon) {
        final boolean[] played = new boolean[1];
        final int currentAccount = imageReceiver.getCurrentAccount();
        Runnable setImage = () -> {
            TLRPC.TL_messages_stickerSet set;
            TLRPC.Document document = null;
            String packName;
            if (isTon) {
                packName = UserConfig.getInstance(currentAccount).premiumTonStickerPack;
                if (packName == null) {
                    MediaDataController.getInstance(currentAccount).checkTonGiftStickers();
                    return;
                }
            } else {
                packName = UserConfig.getInstance(currentAccount).premiumGiftsStickerPack;
                if (packName == null) {
                    MediaDataController.getInstance(currentAccount).checkPremiumGiftStickers();
                    return;
                }
            }

            set = MediaDataController.getInstance(currentAccount).getStickerSetByName(packName);
            if (set == null) {
                set = MediaDataController.getInstance(currentAccount).getStickerSetByEmojiOrName(packName);
            }
            if (set != null) {
                for (int i = 0; i < set.packs.size(); ++i) {
                    TLRPC.TL_stickerPack pack = set.packs.get(i);
                    if (TextUtils.equals(pack.emoticon, emoji) && !pack.documents.isEmpty()) {
                        long documentId = pack.documents.get(0);
                        for (int j = 0; j < set.documents.size(); ++j) {
                            TLRPC.Document d = set.documents.get(j);
                            if (d != null && d.id == documentId) {
                                document = d;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (document == null && !set.documents.isEmpty()) {
                    document = set.documents.get(0);
                }
            }

            if (document != null) {
                imageReceiver.setAllowStartLottieAnimation(true);
                imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                    @Override
                    public void didSetImage(ImageReceiver imageReceiver, boolean set, boolean thumb, boolean memCache) {
                        if (set) {
                            RLottieDrawable drawable = imageReceiver.getLottieAnimation();
                            if (drawable != null && !played[0]) {
                                drawable.setCurrentFrame(0, false);
                                AndroidUtilities.runOnUIThread(drawable::restart);
                                played[0] = true;
                            }
                        }
                    }
                });
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                TLRPC.PhotoSize thumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                imageReceiver.setAutoRepeat(0);
                imageReceiver.setImage(
                    ImageLocation.getForDocument(document), "160_160_nr",
                    ImageLocation.getForDocument(thumb, document), "160_160",
                    svgThumb,
                    document.size, "tgs",
                    set,
                    1
                );
            } else {
                MediaDataController.getInstance(currentAccount).loadStickersByEmojiOrName(packName, false, set == null);
            }
        };
        setImage.run();
        final Runnable cancel1 = NotificationCenter.getInstance(currentAccount).listen(view, isTon ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, args -> setImage.run());
        final Runnable cancel2 = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, args -> setImage.run());
        return () -> {
            cancel1.run();
            cancel2.run();
        };
    }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\ui\Stars\StarsIntroActivity.java 51811
========================================================
