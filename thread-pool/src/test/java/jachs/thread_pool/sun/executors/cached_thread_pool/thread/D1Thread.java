package jachs.thread_pool.sun.executors.cached_thread_pool.thread;

/***
 * 
 * @author zhanchaohan
 *
 */
public class D1Thread implements Runnable{

    @Override
    public void run () {
        System.out.println ( Thread.currentThread ().getId () );
    }

}
