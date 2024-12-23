package jachs.thread_pool.sun.executors.cached_thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jachs.thread_pool.sun.executors.cached_thread_pool.thread.D1Future;
import jachs.thread_pool.sun.executors.cached_thread_pool.thread.D1Thread;

/***
- execute(Runnable) 异步执行
- submit(Runnable)  异步获取返回结果
- submit(Callable)
- invokeAny(...) 接收的是一个Callable的集合，执行这个方法不会返回Future，但是会返回所有Callable任务中其中一个任务的执行结果。这个方法也无法保证返回的是哪个任务的执行结果，反正是其中的某一个
- invokeAll(...) 类似也是接收一个Callable集合，但是前者执行之后会返回一个Future的List，其中对应着每个Callable任务执行后的Future对象
 * @author zhanchaohan
 *
 */
public class D1 {
    public static void main ( String[] args ) throws Exception {
        ExecutorService executorService =Executors.newCachedThreadPool ();
        
        executorService.execute ( new D1Thread() );//execute 无返回数据
        Future future =executorService.submit ( new D1Thread() );//submit 可以获取返回数据
        Future future1 =executorService.submit ( new D1Future() );
        
        System.out.println (future.get ()  );
        System.out.println (future1.get ()  );
        
        
        executorService.shutdown ();
    }
}
