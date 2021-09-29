package com.jachs.jdk.lang.thread;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ThreadTest1 extends Thread {
	@Override
	public void run() {
		System.out.println("线程执行");
	}

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();

		tt1.start();// 启动线程
		System.out.println("activeCount:" + tt1.activeCount());// 返回当前线程的线程组中活动线程的数目
		tt1.checkAccess();// 判定当前运行的线程是否有权修改该线程。
//		System.out.println("countStackFrames:"+tt1.countStackFrames() );//已过时。 该调用的定义依赖于 suspend()，但它遭到了反对。此外，该调用的结果从来都不是意义明确的。
		System.out.println("getId:" + tt1.getId());// 返回该线程的标识符。
		System.out.println("getName:" + tt1.getName());// 返回该线程的名称
		System.out.println("getPriority:" + tt1.getPriority());// 返回线程的优先级。
		System.out.println("interrupted:"+tt1.interrupted() );//测试当前线程是否已经中断。
		System.out.println("isAlive:"+tt1.isAlive() );//测试线程是否处于活动状态。
		System.out.println("isDaemon:"+tt1.isDaemon());//测试该线程是否为守护线程
		System.out.println("isInterrupted:"+tt1.isInterrupted());//测试线程是否已经中断
		
	}
}
