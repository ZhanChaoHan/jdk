package jachs.thread_pool.sun.executors.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ThreadPoolExecutorDemo {
	/***
	 * 1.corePoolSize、 maximumPoolSize。线程池会自动根据corePoolSize和maximumPoolSize去调整当前线程池的大小。</br>
	 * 当你通过submit或者execute方法提交任务的时候，如果当前线程池的线程数小于corePoolSize,那么线程池就会创建一个新的线程处理任务,</br>
	 *  即使其他的core线程是空闲的。如果当前线程数大于corePoolSize并且小于maximumPoolSize，那么只有在队列"满"的时候才会创建新的线程。</br>
	 *  因此这里会有很多的坑，比如你的core和max线程数设置的不一样，希望请求积压在队列的时候能够实时的扩容，但如果制定了一个无界队列，那么就不会扩容了，因为队列不存在满的概念。</br>
	 *  2.keepAliveTime。如果当前线程池中的线程数超过了corePoolSize，那么如果在keepAliveTime时间内都没有新的任务需要处理，</br>
	 *  那么超过corePoolSize的这部分线程就会被销毁。默认情况下是不会回收core线程的，可以通过设置allowCoreThreadTimeOut改变这一行为。</br>
	 *  3.workQueue。即实际用于存储任务的队列，这个可以说是最核心的一个参数了，直接决定了线程池的行为，比如说传入一个有界队列，</br>
	 *  那么队列满的时候，线程池就会根据core和max参数的设置情况决定是否需要扩容，如果传入了一个SynchronousQueue，</br>
	 *  这个队列只有在另一个线程在同步remove的时候才可以put成功，对应到线程池中，简单来说就是如果有线程池任务处理完了，</br>
	 *  调用poll或者take方法获取新的任务的时候，新提交的任务才会put成功，否则如果当前的线程都在忙着处理任务，那么就会put失败，</br>
	 *  也就会走扩容的逻辑，如果传入了一个DelayedWorkQueue，顾名思义，任务就会根据过期时间来决定什么时候弹出，</br>
	 *  即为ScheduledThreadPoolExecutor的机制。</br>
	 *  4.threadFactory。创建线程都是通过ThreadFactory来实现的，如果没指定的话，</br>
	 *  默认会使用Executors.defaultThreadFactory()，一般来说，我们会在这里对线程设置名称、异常处理器等。</br>
	 *  5.handler。即当任务提交失败的时候，会调用这个处理器，ThreadPoolExecutor内置了多个实现，比如抛异常、直接抛弃等。</br>
	 *  这里也需要根据业务场景进行设置，比如说当队列积压的时候，针对性的对线程池扩容或者发送告警等策略。</br>
	 */
	static ExecutorService executorService = new ThreadPoolExecutor
			(2,5,10,TimeUnit.MILLISECONDS,
					new LinkedBlockingQueue<>(),
					new ThreadFactoryEx(),
					new RejectedExecutionHandlerEx());

	public static void main(String[] args) {
		
		for (int kk = 0; kk < 50; kk++) {
			executorService.execute(new ThreadEx(kk));
		}
		executorService.shutdown();
	}
}
