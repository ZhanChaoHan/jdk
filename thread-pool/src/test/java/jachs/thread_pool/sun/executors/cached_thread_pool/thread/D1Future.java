package jachs.thread_pool.sun.executors.cached_thread_pool.thread;

import java.util.concurrent.Callable;

public class D1Future implements Callable<String>{

    @Override
    public String call () throws Exception {
        return "D1Future执行完毕";
    }

}
