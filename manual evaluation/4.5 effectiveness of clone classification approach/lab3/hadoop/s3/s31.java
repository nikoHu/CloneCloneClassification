hadoop-trunk/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/auth/RolePolicies.java
public static final List<String> S3_PATH_RW_OPERATIONS =
        Collections.unmodifiableList(Arrays.asList(new String[]{
                S3_ALL_GET,
                S3_PUT_OBJECT,
                S3_PUT_OBJECT_ACL,
                S3_DELETE_OBJECT,
                S3_ABORT_MULTIPART_UPLOAD
        }));


/*********************************************************************/
hadoop-trunk/hadoop-tools/hadoop-aws/src/main/java/org/apache/hadoop/fs/s3a/auth/RolePolicies.java
public static final List<String> S3_ROOT_RW_OPERATIONS =
        Collections.unmodifiableList(Arrays.asList(new String[]{
                S3_ALL_GET,
                S3_PUT_OBJECT,
                S3_PUT_OBJECT_ACL,
                S3_DELETE_OBJECT,
                S3_ABORT_MULTIPART_UPLOAD
        }));

