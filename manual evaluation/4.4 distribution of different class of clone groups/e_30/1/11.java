 
        public void serializeToStream(OutputSerializedData stream) {
            stream.writeInt32(constructor);
            set.serializeToStream(stream);
            Vector.serialize(stream, packs);
            Vector.serialize(stream, keywords);
            Vector.serialize(stream, documents);
        }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java 42625
========================================================

        public void serializeToStream(OutputSerializedData stream) {
            stream.writeInt32(constructor);
            set.serializeToStream(stream);
            Vector.serialize(stream, packs);
            Vector.serialize(stream, keywords);
            Vector.serialize(stream, documents);
        }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java 43148
========================================================
