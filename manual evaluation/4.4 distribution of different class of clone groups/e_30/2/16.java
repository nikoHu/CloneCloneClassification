
        protected final void clearEpollIn0() {
            assert eventLoop().inEventLoop();
            try {
                readPending = false;
                if (!ops.contains(EpollIoOps.EPOLLIN)) {
                    return;
                }
                ops = ops.without(EpollIoOps.EPOLLIN);
                IoRegistration registration = registration();
                registration.submit(ops);
            } catch (UncheckedIOException e) {
                // When this happens there is something completely wrong with either the filedescriptor or epoll,
                // so fire the exception through the pipeline and close the Channel.
                pipeline().fireExceptionCaught(e);
                unsafe().close(unsafe().voidPromise());
            }
        }


D:\_python\clone\CloneClassification\data_new\network\netty\transport-classes-epoll\src\main\java\io\netty\channel\epoll\AbstractEpollChannel.java 349493
========================================================

        protected final void clearReadFilter0() {
            assert eventLoop().inEventLoop();
            try {
                readPending = false;
                readFilter(false);
            } catch (IOException e) {
                // When this happens there is something completely wrong with either the filedescriptor or epoll,
                // so fire the exception through the pipeline and close the Channel.
                pipeline().fireExceptionCaught(e);
                unsafe().close(unsafe().voidPromise());
            }
        }


D:\_python\clone\CloneClassification\data_new\network\netty\transport-classes-kqueue\src\main\java\io\netty\channel\kqueue\AbstractKQueueChannel.java 355269
========================================================
