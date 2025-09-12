
      public void write(org.apache.thrift.protocol.TProtocol prot, chronologizeKeyRecordStartstr_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetEx()) {
          optionals.set(1);
        }
        if (struct.isSetEx2()) {
          optionals.set(2);
        }
        if (struct.isSetEx3()) {
          optionals.set(3);
        }
        if (struct.isSetEx4()) {
          optionals.set(4);
        }
        oprot.writeBitSet(optionals, 5);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (java.util.Map.Entry<java.lang.Long, java.util.Set<com.cinchapi.concourse.thrift.TObject>> _iter405 : struct.success.entrySet())
            {
              oprot.writeI64(_iter405.getKey());
              {
                oprot.writeI32(_iter405.getValue().size());
                for (com.cinchapi.concourse.thrift.TObject _iter406 : _iter405.getValue())
                {
                  _iter406.write(oprot);
                }
              }
            }
          }
        }
        if (struct.isSetEx()) {
          struct.ex.write(oprot);
        }
        if (struct.isSetEx2()) {
          struct.ex2.write(oprot);
        }
        if (struct.isSetEx3()) {
          struct.ex3.write(oprot);
        }
        if (struct.isSetEx4()) {
          struct.ex4.write(oprot);
        }
      }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\ConcourseService.java 269668
========================================================


      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, selectKeyCclOrder_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetEx()) {
          optionals.set(1);
        }
        if (struct.isSetEx2()) {
          optionals.set(2);
        }
        if (struct.isSetEx3()) {
          optionals.set(3);
        }
        if (struct.isSetEx4()) {
          optionals.set(4);
        }
        oprot.writeBitSet(optionals, 5);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (java.util.Map.Entry<java.lang.Long, java.util.Set<com.cinchapi.concourse.thrift.TObject>> _iter3205 : struct.success.entrySet())
            {
              oprot.writeI64(_iter3205.getKey());
              {
                oprot.writeI32(_iter3205.getValue().size());
                for (com.cinchapi.concourse.thrift.TObject _iter3206 : _iter3205.getValue())
                {
                  _iter3206.write(oprot);
                }
              }
            }
          }
        }
        if (struct.isSetEx()) {
          struct.ex.write(oprot);
        }
        if (struct.isSetEx2()) {
          struct.ex2.write(oprot);
        }
        if (struct.isSetEx3()) {
          struct.ex3.write(oprot);
        }
        if (struct.isSetEx4()) {
          struct.ex4.write(oprot);
        }
      }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\ConcourseService.java 274008
========================================================


            @Override
            public void write(org.apache.thrift.protocol.TProtocol prot,
                    navigateKeyCcl_result struct)
                    throws org.apache.thrift.TException {
                org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
                java.util.BitSet optionals = new java.util.BitSet();
                if(struct.isSetSuccess()) {
                    optionals.set(0);
                }
                if(struct.isSetEx()) {
                    optionals.set(1);
                }
                if(struct.isSetEx2()) {
                    optionals.set(2);
                }
                if(struct.isSetEx3()) {
                    optionals.set(3);
                }
                if(struct.isSetEx4()) {
                    optionals.set(4);
                }
                oprot.writeBitSet(optionals, 5);
                if(struct.isSetSuccess()) {
                    {
                        oprot.writeI32(struct.success.size());
                        for (java.util.Map.Entry<java.lang.Long, java.util.Set<com.cinchapi.concourse.thrift.TObject>> _iter381 : struct.success
                                .entrySet()) {
                            oprot.writeI64(_iter381.getKey());
                            {
                                oprot.writeI32(_iter381.getValue().size());
                                for (com.cinchapi.concourse.thrift.TObject _iter382 : _iter381
                                        .getValue()) {
                                    _iter382.write(oprot);
                                }
                            }
                        }
                    }
                }
                if(struct.isSetEx()) {
                    struct.ex.write(oprot);
                }
                if(struct.isSetEx2()) {
                    struct.ex2.write(oprot);
                }
                if(struct.isSetEx3()) {
                    struct.ex3.write(oprot);
                }
                if(struct.isSetEx4()) {
                    struct.ex4.write(oprot);
                }
            }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\ConcourseNavigateService.java 282408
========================================================
