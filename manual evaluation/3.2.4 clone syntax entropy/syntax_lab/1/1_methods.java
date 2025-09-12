
        public Builder(ConsumerGroupMember member, String newMemberId) {
            Objects.requireNonNull(member);

            this.memberId = Objects.requireNonNull(newMemberId);
            this.memberEpoch = member.memberEpoch;
            this.previousMemberEpoch = member.previousMemberEpoch;
            this.instanceId = member.instanceId;
            this.rackId = member.rackId;
            this.rebalanceTimeoutMs = member.rebalanceTimeoutMs;
            this.clientId = member.clientId;
            this.clientHost = member.clientHost;
            this.subscribedTopicNames = member.subscribedTopicNames;
            this.subscribedTopicRegex = member.subscribedTopicRegex;
            this.serverAssignorName = member.serverAssignorName;
            this.state = member.state;
            this.assignedPartitions = member.assignedPartitions;
            this.partitionsPendingRevocation = member.partitionsPendingRevocation;
            this.classicMemberMetadata = member.classicMemberMetadata;
        }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\group-coordinator\src\main\java\org\apache\kafka\coordinator\group\modern\consumer\ConsumerGroupMember.java 8380
========================================================

        public Builder(ShareGroupMember member, String newMemberId) {
            Objects.requireNonNull(member);

            this.memberId = Objects.requireNonNull(newMemberId);
            this.memberEpoch = member.memberEpoch;
            this.previousMemberEpoch = member.previousMemberEpoch;
            this.rackId = member.rackId;
            this.clientId = member.clientId;
            this.clientHost = member.clientHost;
            this.subscribedTopicNames = member.subscribedTopicNames;
            this.assignedPartitions = member.assignedPartitions;
        }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\group-coordinator\src\main\java\org\apache\kafka\coordinator\group\modern\share\ShareGroupMember.java 8471
========================================================
