package com.jachs.thread.threadlocal.part2;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Td3 implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"\t");
		Demo.tl_3.get().forEach(a->{
			System.out.println(a);
		});
	}

}
