package com.jachs.jdk.utill.concurrent.threadpoolexecutor;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.jachs.jdk.utill.concurrent.threadpoolexecutor.job.ScanDickJob;

/***
 * 线程池
 * 
 * @author zhanchaohan
 *
 */
public class ThreadPoolExecutorTest {
	private static int corePoolSize = 5;// 核心线程数
	private static int maximumPoolSize = 10;// 最大线程数
	/***
	 * 表示线程没有任务执行时最多保持多久时间会终止。默认情况下，只有当线程池中的线程数大于corePoolSize时，keepAliveTime才会起作用，</br>
	 * 直到线程池中的线程数不大于corePoolSize，即当线程池中的线程数大于corePoolSize时，如果一个线程空闲的时间达到keepAliveTime，</br>
	 * 则会终止，直到线程池中的线程数不超过corePoolSize。但是如果调用了allowCoreThreadTimeOut(boolean)方法，</br>
	 * 在线程池中的线程数不大于corePoolSize时，keepAliveTime参数也会起作用，直到线程池中的线程数为0；</br>
	 */
	private static Long keepAliveTime = 5000L;
	/***
	 * 参数keepAliveTime的时间单位，有7种取值，在TimeUnit类中有7种静态属性</br>
	 * TimeUnit.DAYS; //天</br>
	 * TimeUnit.HOURS; //小时</br>
	 * TimeUnit.MINUTES; //分钟</br>
	 * TimeUnit.SECONDS; //秒</br>
	 * TimeUnit.MILLISECONDS; //毫秒</br>
	 * TimeUnit.MICROSECONDS; //微妙</br>
	 * TimeUnit.NANOSECONDS; //纳秒</br>
	 */
	private static TimeUnit timeUnit = TimeUnit.NANOSECONDS;

	/****
	 * ArrayBlockingQueue;</br>
	 * LinkedBlockingQueue;</br>
	 * SynchronousQueue;</br>
	 */

	private static ArrayBlockingQueue workQueue = new ArrayBlockingQueue(10);
	private static LinkedBlockingQueue lworkQueue = new LinkedBlockingQueue(10);
	private static SynchronousQueue sworkQueue = new SynchronousQueue(true);// 是否先进先出，ture是.

	/****
	 * 异常处理实现类 ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常。
	 * </br>
	 * ThreadPoolExecutor.DiscardPolicy：也是丢弃任务，但是不抛出异常。 </br>
	 * ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）</br>
	 * ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务 </br>
	 */
	private static RejectedExecutionHandler handler = new MyHandler();

	private static MyThreadFactory myThreadFactory = new MyThreadFactory();

	
	static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
			timeUnit, workQueue);

	// 用给定的初始参数和默认的线程工厂及被拒绝的执行处理程序创建新的 ThreadPoolExecutor。
	static ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
			timeUnit, workQueue, handler);
	// 用给定的初始参数和默认的线程工厂创建新的 ThreadPoolExecutor。
	static ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
			timeUnit, workQueue, myThreadFactory);
	// 用给定的初始参数和默认被拒绝的执行处理程序创建新的 ThreadPoolExecutor。
	static ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
			timeUnit, workQueue, myThreadFactory, handler);
	
	public static void main(String[] args) throws InterruptedException {
		File[] roots = File.listRoots();
		for (File file : roots) {
			threadPoolExecutor.execute(new ScanDickJob(file));
		}
		threadPoolExecutor.shutdown();//不在接受新任务
		while(true) {
			if(threadPoolExecutor.isTerminated()){//线程池是否执行完毕
				for (int i = 0; i < roots.length; i++) {
				    System.out.print("磁盘路径:"+roots[i].getPath()+"; ");//磁盘路径
				    System.out.print("磁盘空间大小:"+roots[i].getTotalSpace()/1024/1024/1024+"; ");//磁盘总空间大小
				    System.out.print("磁盘已使用空间:"+roots[i].getUsableSpace()/1024/1024/1024+"; ");//磁盘使用空间大小
				    System.out.println("磁盘剩余空间"+roots[i].getFreeSpace()/1024/1024/1024);//剩余磁盘空间大小
				}
			}
			Thread.sleep(5000);
		}
	}
}
