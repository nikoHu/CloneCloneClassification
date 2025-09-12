
    public static void post(Handler handler, Runnable runnable) {
        RunnableWrapper wrapper = new RunnableWrapper();
        ThreadQueue threadQueue = ThreadQueue.getOrCreateThreadQueue(handler.getLooper().getThread());
        wrapper.threadQueue = threadQueue;
        wrapper.handler = handler;
        wrapper.runnable = runnable;

        threadQueue.add(wrapper);
        handler.post(wrapper);

        // run the queue if the thread is blocking
        threadQueue.queueSemaphore.release();
    }


D:\_python\clone\CloneClassification\data_new\android\RemoteDroid\app\src\main\java\com\koushikdutta\async\AsyncServer.java 36060
========================================================


    public static void post(Handler handler, Runnable runnable) {
        RunnableWrapper wrapper = new RunnableWrapper();
        ThreadQueue threadQueue = ThreadQueue.getOrCreateThreadQueue(handler.getLooper().getThread());
        wrapper.threadQueue = threadQueue;
        wrapper.handler = handler;
        wrapper.runnable = runnable;

        // run it in a blocking AsyncSemaphore or a Handler, whichever gets to it first.
        threadQueue.add(wrapper);
        handler.post(wrapper);

        // run the queue if the thread is blocking
        threadQueue.queueSemaphore.release();
    }


D:\_python\clone\CloneClassification\data_new\network\AndroidAsync\AndroidAsync\src\com\koushikdutta\async\AsyncServer.java 342244
========================================================
