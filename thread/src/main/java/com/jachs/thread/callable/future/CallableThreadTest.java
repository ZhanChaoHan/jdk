package com.jachs.thread.callable.future;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CallableThreadTest {
	
	public static void main(String[] args) throws Exception {
		CallableThread ct1=new CallableThread();
		
		String str=ct1.call();//方法调用
		System.out.println(str);
		
		RunnableFuture<String>runtask=new FutureTask<String>(new CallableThread());
		RunnableFuture<String>runtask1=new FutureTask<String>(new CallableThread());
		RunnableFuture<String>runtask2=new FutureTask<String>(new CallableThread());
		RunnableFuture<String>runtask3=new FutureTask<String>(new CallableThread());
		
		new Thread(runtask,"001").start();
		new Thread(runtask1,"002").start();
		new Thread(runtask2,"003").start();
		new Thread(runtask3,"004").start();
		
		System.out.println(runtask.get());
		System.out.println(runtask1.get());
		System.out.println(runtask2.get());
		System.out.println(runtask3.get());
		
	}

}
