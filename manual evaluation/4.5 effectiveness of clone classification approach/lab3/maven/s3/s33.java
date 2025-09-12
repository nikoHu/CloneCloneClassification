maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/model/DefaultModelValidator.java

        @Override
        protected ActivationFile.Builder transformActivationFile_Missing(
                Supplier<? extends ActivationFile.Builder> creator,
                ActivationFile.Builder builder,
                ActivationFile target) {
            stk.push(nextFrame("missing"));
            try {
                return super.transformActivationFile_Missing(creator, builder, target);
            } finally {
                stk.pop();
            }
        }



/************************************************************************/
maven-master/impl/maven-impl/src/main/java/org/apache/maven/impl/model/DefaultModelValidator.java

        @Override
        protected Activation.Builder transformActivation_Packaging(
                Supplier<? extends Activation.Builder> creator, Activation.Builder builder, Activation target) {
            stk.push(nextFrame("packaging"));
            try {
                return super.transformActivation_Packaging(creator, builder, target);
            } finally {
                stk.pop();
            }
        }



/************************************************************************/
