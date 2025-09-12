
    public static PublicKey toJavaKey(SigningPublicKey pk)
                              throws GeneralSecurityException {
        switch (pk.getType().getBaseAlgorithm()) {
            case DSA:
                return toJavaDSAKey(pk);
            case EC:
                return toJavaECKey(pk);
            case EdDSA:
                return toJavaEdDSAKey(pk);
            case RSA:
                return toJavaRSAKey(pk);
            default:
                throw new InvalidKeyException("unsupported key: " + pk);
        }
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\core\java\src\net\i2p\crypto\SigUtil.java 334823
========================================================

    public static PrivateKey toJavaKey(SigningPrivateKey pk)
                              throws GeneralSecurityException {
        switch (pk.getType().getBaseAlgorithm()) {
            case DSA:
                return toJavaDSAKey(pk);
            case EC:
                return toJavaECKey(pk);
            case EdDSA:
                return toJavaEdDSAKey(pk);
            case RSA:
                return toJavaRSAKey(pk);
            default:
                throw new InvalidKeyException("unsupported key: " + pk);
        }
    }


D:\_python\clone\CloneClassification\data_new\network\i2p.i2p\core\java\src\net\i2p\crypto\SigUtil.java 334824
========================================================
