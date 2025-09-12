
            @Override
            public void read(org.apache.thrift.protocol.TProtocol prot,
                    getDumpList_args struct)
                    throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
                java.util.BitSet incoming = iprot.readBitSet(2);
                if(incoming.get(0)) {
                    struct.environment = iprot.readString();
                    struct.setEnvironmentIsSet(true);
                }
                if(incoming.get(1)) {
                    struct.creds = new com.cinchapi.concourse.thrift.AccessToken();
                    struct.creds.read(iprot);
                    struct.setCredsIsSet(true);
                }
            }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\management\ConcourseManagementService.java 287792
========================================================

            @Override
            public void read(org.apache.thrift.protocol.TProtocol prot,
                    repairData_args struct)
                    throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
                java.util.BitSet incoming = iprot.readBitSet(2);
                if(incoming.get(0)) {
                    struct.environment = iprot.readString();
                    struct.setEnvironmentIsSet(true);
                }
                if(incoming.get(1)) {
                    struct.creds = new com.cinchapi.concourse.thrift.AccessToken();
                    struct.creds.read(iprot);
                    struct.setCredsIsSet(true);
                }
            }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\management\ConcourseManagementService.java 288239
========================================================


            @Override
            public void read(org.apache.thrift.protocol.TProtocol prot,
                    compactData_args struct)
                    throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
                java.util.BitSet incoming = iprot.readBitSet(2);
                if(incoming.get(0)) {
                    struct.environment = iprot.readString();
                    struct.setEnvironmentIsSet(true);
                }
                if(incoming.get(1)) {
                    struct.creds = new com.cinchapi.concourse.thrift.AccessToken();
                    struct.creds.read(iprot);
                    struct.setCredsIsSet(true);
                }
            }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-server\src\main\java\com\cinchapi\concourse\server\management\ConcourseManagementService.java 288271
========================================================
