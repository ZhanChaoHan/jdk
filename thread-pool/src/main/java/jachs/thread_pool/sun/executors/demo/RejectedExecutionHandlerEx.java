package jachs.thread_pool.sun.executors.demo;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/***
 * 失败策略
 * @author zhanchaohan
 *
 */
public class RejectedExecutionHandlerEx implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(r.toString()+"\t\t"+executor.toString());
	}

}
