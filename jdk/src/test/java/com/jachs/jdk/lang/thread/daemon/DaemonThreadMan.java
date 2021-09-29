package com.jachs.jdk.lang.thread.daemon;

import com.jachs.jdk.lang.thread.daemon.job.SimpleDaemonJob;
import com.jachs.jdk.lang.thread.daemon.job.SimpleJob;

/***
 * 守护线程测试，守护线程就是当所有线程执行完毕后才执行的线程，当全部线程执行完毕不管守护线程是否执行完毕程序都将退出，所有守护线程里不要写功能代码执行执行jvm内存清空以及连接关闭等辅助功能
 * @author zhanchaohan
 *
 */
public class DaemonThreadMan {
	public static void main(String[] args) {
		Thread thread=new Thread(new SimpleJob());
		Thread daeThread=new Thread(new SimpleDaemonJob());
		
		daeThread.setDaemon(true);
		
		System.out.println(daeThread.isDaemon());
		daeThread.start();
		thread.start();
	}
}
