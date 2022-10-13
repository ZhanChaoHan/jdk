package com.jachs.thread.threadlocal.Inheritable;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Demo {
	public final static ThreadLocal<String> t1 = new ThreadLocal<>();
	public final static InheritableThreadLocal<String> t2 = new InheritableThreadLocal<>();
	
	public static void main(String[] args) {
		t1.set("初始化t1");
		t2.set("初始化t2");
		
		new Thread(new T_1_Job()).start();
		new Thread(new T_2_Job()).start();
	}
}
