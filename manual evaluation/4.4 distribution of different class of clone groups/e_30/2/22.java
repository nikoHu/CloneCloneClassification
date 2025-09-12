
    private static class TCriteriaStandardScheme
            extends StandardScheme<TCriteria> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TCriteria struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // SYMBOLS
                    if(schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                        {
                            org.apache.thrift.protocol.TList _list0 = iprot
                                    .readListBegin();
                            struct.symbols = new ArrayList<TSymbol>(
                                    _list0.size);
                            TSymbol _elem1;
                            for (int _i2 = 0; _i2 < _list0.size; ++_i2) {
                                _elem1 = new TSymbol();
                                _elem1.read(iprot);
                                struct.symbols.add(_elem1);
                            }
                            iprot.readListEnd();
                        }
                        struct.setSymbolsIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            struct.validate();
        }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\TCriteria.java 282873
========================================================

    private static class TOrderStandardScheme extends StandardScheme<TOrder> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TOrder struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // SPEC
                    if(schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                        {
                            org.apache.thrift.protocol.TList _list8 = iprot
                                    .readListBegin();
                            struct.spec = new ArrayList<TOrderComponent>(
                                    _list8.size);
                            TOrderComponent _elem9;
                            for (int _i10 = 0; _i10 < _list8.size; ++_i10) {
                                _elem9 = new TOrderComponent();
                                _elem9.read(iprot);
                                struct.spec.add(_elem9);
                            }
                            iprot.readListEnd();
                        }
                        struct.setSpecIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            struct.validate();
        }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\TOrder.java 286359
========================================================
