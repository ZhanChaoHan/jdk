package com.jachs.jdk.utill.concurrent.threadpoolexecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/***
 * 自定义异常处理
 * @author zhanchaohan
 *
 */
public class MyHandler implements RejectedExecutionHandler {

	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("出现异常:"+r.toString()+executor.toString());
	}

}
