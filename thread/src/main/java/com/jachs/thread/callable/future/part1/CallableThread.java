package com.jachs.thread.callable.future.part1;

import java.util.Random;
import java.util.concurrent.Callable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CallableThread implements Callable<String>{

	public String call() throws Exception {
		Random radom=new Random();
		Thread.sleep(radom.nextInt(5000));
		return Thread.currentThread().getName();
	}

}
