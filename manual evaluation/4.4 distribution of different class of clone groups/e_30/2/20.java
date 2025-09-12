
      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, describe_result struct) throws org.apache.thrift.TException {
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
        oprot.writeBitSet(optionals, 4);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (java.lang.String _iter494 : struct.success)
            {
              oprot.writeString(_iter494);
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
      }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\ConcourseService.java 270019
========================================================


      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, describeTimestr_result struct) throws org.apache.thrift.TException {
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
        oprot.writeBitSet(optionals, 4);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (java.lang.String _iter510 : struct.success)
            {
              oprot.writeString(_iter510);
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
      }


D:\_python\clone\CloneClassification\data_new\db\concourse\concourse-driver-java\src\main\java\com\cinchapi\concourse\thrift\ConcourseService.java 270090
========================================================
