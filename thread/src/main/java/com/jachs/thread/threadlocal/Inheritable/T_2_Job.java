package com.jachs.thread.threadlocal.Inheritable;

/**
 * 
 * @author zhanchaohan
 *
 */
public class T_2_Job implements Runnable{

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		
		System.out.println(t.getName()+"\t"+Demo.t2.get());
	}

}
