package com.jachs.thread.callable.future.part2;

import java.util.concurrent.Callable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CallThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return Thread.currentThread().getName()+"\t执行完毕";
	}

}
