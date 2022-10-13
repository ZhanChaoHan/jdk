package com.jachs.thread.threadlocal.part1;

/***
ThreadLocal不是用来解决共享对象的多线程访问问题的，一般情况下，通过ThreadLocal.set() 到线程中的对象是该线程自己使用的对象，其他线程是不需要访问的，也访问不到的。各个线程中访问的是不同的对象。<br>
ThreadLocal使得各线程能够保持各自独立的一个对象，并不是通过ThreadLocal.set()来实现的，而是通过每个线程中的new操作创建新的对象实现的。通过ThreadLocal.set()将这个新j建对象的引用保存到各线程的自己的一个map中，
每个线程都有这样一个map，执行ThreadLocal.get()时，各线程从自己的map中取出放进去的对象，因此取出来的是线程自己的对象，ThreadLocal实例是作为map的key来使用的。<br>
如果ThreadLocal.set()进去的东西本来就是多个线程共享的同一个对象，那么多个线程的ThreadLocal.get()取得的还是这个共享对象本身，还是有并发访问问题。<br>
 * @author zhanchaohan
 *
 */
public class Demo {
	//初始化全局变量
	static ThreadLocal<Integer> localInt = ThreadLocal.withInitial(() -> 6);
	
	
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadDemo());
		Thread t2=new Thread(new ThreadDemo());
		Thread t3=new Thread(new ThreadDemo());
		Thread t4=new Thread(new ThreadDemo());
		Thread t5=new Thread(new ThreadDemo());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
