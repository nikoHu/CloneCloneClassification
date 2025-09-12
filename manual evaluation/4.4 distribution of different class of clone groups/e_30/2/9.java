
    public static void gluLookAt(GL10 gl, float eyeX, float eyeY, float eyeZ,
            float centerX, float centerY, float centerZ, float upX, float upY,
            float upZ) {

        float[] scratch = sScratch;
        synchronized(scratch) {
            Matrix.setLookAtM(scratch, 0, eyeX, eyeY, eyeZ, centerX, centerY, centerZ,
                    upX, upY, upZ);
            gl.glMultMatrixf(scratch, 0);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\android\upstream\android\opengl\GLU.java 118572
========================================================

    public static void gluLookAt(GL10 gl, float eyeX, float eyeY, float eyeZ,
            float centerX, float centerY, float centerZ, float upX, float upY,
            float upZ) {

        float[] scratch = sScratch;
        synchronized(scratch) {
            Matrix.setLookAtM(scratch, 0, eyeX, eyeY, eyeZ, centerX, centerY, centerZ,
                    upX, upY, upZ);
            gl.glMultMatrixf(scratch, 0);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\XobotOS\external\opengl\java\android\opengl\GLU.java 132359
========================================================
