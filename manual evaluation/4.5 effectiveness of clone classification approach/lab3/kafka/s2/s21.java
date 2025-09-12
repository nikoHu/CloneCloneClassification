kafka-trunk/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java
        ListGroupsResults(Collection<Node> leaders,
                          KafkaFutureImpl<Collection<Object>> future) {
            this.errors = new ArrayList<>();
            this.listings = new HashMap<>();
            this.remaining = new HashSet<>(leaders);
            this.future = future;
            tryComplete();
        }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java
        ListConsumerGroupsResults(Collection<Node> leaders,
                                  KafkaFutureImpl<Collection<Object>> future) {
            this.errors = new ArrayList<>();
            this.listings = new HashMap<>();
            this.remaining = new HashSet<>(leaders);
            this.future = future;
            tryComplete();
        }



/************************************************************************/
