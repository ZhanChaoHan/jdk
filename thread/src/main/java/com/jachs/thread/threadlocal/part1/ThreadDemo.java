package com.jachs.thread.threadlocal.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"\t"+Demo.localInt.get());
	}

}
