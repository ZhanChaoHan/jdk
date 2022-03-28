package com.jachs.thread.callable.pool;

import java.nio.file.spi.FileSystemProvider;
import java.util.Random;
import java.util.concurrent.Callable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CallThread implements Callable<String>{
	private String thing;
	
	public CallThread(String thing) {
		super();
		this.thing = thing;
	}

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"开始执行:"+thing);
		Random radom=new Random();
		Thread.sleep(radom.nextInt(5000));
		
		System.out.println(Thread.currentThread().getName()+"执行完毕:"+thing);
		return "done:\t"+thing;
	}

}
