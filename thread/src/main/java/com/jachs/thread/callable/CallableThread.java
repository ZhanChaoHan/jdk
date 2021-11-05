package com.jachs.thread.callable;

import java.util.concurrent.Callable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CallableThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName();
	}

}
