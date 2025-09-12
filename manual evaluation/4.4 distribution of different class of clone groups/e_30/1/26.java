

        public void serializeToStream(OutputSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeString(url);
            stream.writeInt32(size);
            stream.writeString(mime_type);
            Vector.serialize(stream, attributes);
        }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java 43021
========================================================


        public void serializeToStream(OutputSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeString(url);
            stream.writeInt32(size);
            stream.writeString(mime_type);
            Vector.serialize(stream, attributes);
        }


D:\_python\clone\CloneClassification\data_new\android\Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java 43362
========================================================
