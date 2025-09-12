kafka-trunk/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java
        private synchronized void tryComplete() {
            if (remaining.isEmpty()) {
                ArrayList<Object> results = new ArrayList<>(listings.values());
                results.addAll(errors);
                future.complete(results);
            }
        }



/************************************************************************/
kafka-trunk/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java
        private synchronized void tryComplete() {
            if (remaining.isEmpty()) {
                ArrayList<Object> results = new ArrayList<>(listings.values());
                results.addAll(errors);
                future.complete(results);
            }
        }



/************************************************************************/
