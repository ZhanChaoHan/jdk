package jachs.thread_pool.sun.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/***
 * @author zhanchaohan
 * @see 
 */
public class ThreadPoolExecutorExample {
	//返回用于创建新线程的默认线程工厂。
	private ThreadFactory defaultTF=Executors.defaultThreadFactory() ;
	
	
	//创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。
	private ExecutorService executors=Executors.newSingleThreadExecutor();
	
	
	static ExecutorService executorService = new ThreadPoolExecutor(5,10,10,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
	
	public static void execute() throws InterruptedException, ExecutionException {
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("获取不到返回值");
			}
		});
		
		Future<String> future =executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "执行完毕返回结果";
			}
		});
		System.out.println(future.get());
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		execute();
		/**
		* 首先将线程池的状态设置成SHUTDOWN状态，然后中断所
		* 有没有正在执行任务的线程。
		*/
		executorService.shutdown();

		/**
		* 首先将线程池的状态设置为STOP，然后开始尝试停止所有的正在
		* 工作或暂停任务的线程
		*/
		executorService.shutdownNow();
	}
}
