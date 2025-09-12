kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/UUIDDeserializer.java

    @Override
    public UUID deserialize(String topic, byte[] data) {
        try {
            if (data == null)
                return null;
            else
                return UUID.fromString(new String(data, encoding));
        } catch (UnsupportedEncodingException e) {
            throw new SerializationException("Error when deserializing byte[] to UUID due to unsupported encoding " + encoding, e);
        } catch (IllegalArgumentException e) {
            throw new SerializationException("Error parsing data into UUID", e);
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/UUIDDeserializer.java

    @Override
    public UUID deserialize(String topic, Headers headers, ByteBuffer data) {
        try {
            if (data == null) {
                return null;
            }

            if (data.hasArray()) {
                return UUID.fromString(new String(data.array(), data.arrayOffset() + data.position(), data.remaining(), encoding));
            }
            return UUID.fromString(new String(Utils.toArray(data), encoding));
        } catch (UnsupportedEncodingException e) {
            throw new SerializationException("Error when deserializing ByteBuffer to UUID due to unsupported encoding " + encoding, e);
        } catch (IllegalArgumentException e) {
            throw new SerializationException("Error parsing data into UUID", e);
        }
    }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/common/serialization/StringDeserializer.java

    @Override
    public String deserialize(String topic, Headers headers, ByteBuffer data) {
        if (data == null) {
            return null;
        }

        if (data.hasArray()) {
            return new String(data.array(), data.position() + data.arrayOffset(), data.remaining(), encoding);
        }
        return new String(Utils.toArray(data), encoding);
    }



/************************************************************************/
