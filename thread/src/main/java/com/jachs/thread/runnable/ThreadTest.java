package com.jachs.thread.runnable;

/***
 * 
 * @author zhanchaohan
 *@see Thread
 */
public class ThreadTest {
	public static void init1() {
		//简单创建线程
		new Thread(new TestRunnble()).start();
		//创建线程指定名称
		new Thread(new TestRunnble(),"T1").start();
		//创建线程群组，创建线程
		new Thread(new ThreadGroup("G1"), new TestRunnble()).start();
		//  long stackSize：线程栈的大小，这个值一般是CPU页面的整数倍。如x86的页面大小是4KB.在x86平台下，默认的线程栈大小是12KB。
		new Thread(new ThreadGroup("G2"), new TestRunnble(),"NS",24).start();
	
		Thread td=new Thread(new TestRunnble());
		td.setDaemon(true);//是否为守护线程
		td.setName("守护线程");//设置线程名称
		td.setPriority(Thread.MAX_PRIORITY);//优先级
		
		td.start();
	}

	public static void main(String[] args) {
		init1();
	}
}
