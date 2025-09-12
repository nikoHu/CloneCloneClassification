

    public void removeAcceptedArbitrator(Arbitrator arbitrator) {
        if (userPayload.getAcceptedArbitrators() != null) {
            boolean changed = userPayload.getAcceptedArbitrators().remove(arbitrator);
            if (changed)
                requestPersistence();
        }
    }


D:\_python\clone\CloneClassification\data_new\network\bisq\core\src\main\java\bisq\core\user\User.java 355891
========================================================


    public void removeAcceptedMediator(Mediator mediator) {
        if (userPayload.getAcceptedMediators() != null) {
            boolean changed = userPayload.getAcceptedMediators().remove(mediator);
            if (changed)
                requestPersistence();
        }
    }


D:\_python\clone\CloneClassification\data_new\network\bisq\core\src\main\java\bisq\core\user\User.java 355893
========================================================
