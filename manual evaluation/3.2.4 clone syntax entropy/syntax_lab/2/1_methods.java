    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubscriptionCount that = (SubscriptionCount) o;

        if (byNameCount != that.byNameCount) return false;
        return byRegexCount == that.byRegexCount;
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\kafka-trunk\group-coordinator\src\main\java\org\apache\kafka\coordinator\group\modern\SubscriptionCount.java 8429
========================================================
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      CardinalityConstraint that = (CardinalityConstraint) o;

      if (minCardinality != that.minCardinality) {
        return false;
      }
      if (maxCardinality != that.maxCardinality) {
        return false;
      }
      if (scope != null ? !scope.equals(that.scope) : that.scope != null) {
        return false;
      }
      return allocationTags != null ? allocationTags.equals(that.allocationTags)
          : that.allocationTags == null;
    }


\\?\D:\java\javacode\codeCloneClassification\lab3dastset\hadoop-trunk\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-api\src\main\java\org\apache\hadoop\yarn\api\resource\PlacementConstraint.java 48796
========================================================
