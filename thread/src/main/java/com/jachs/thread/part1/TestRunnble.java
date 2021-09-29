package com.jachs.thread.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class TestRunnble implements Runnable {

	@Override
	public void run() {
		System.out.println("ID:\t"+Thread.currentThread().getId());
		System.out.println("名称:\t"+Thread.currentThread().getName());
		System.out.println("优先级:\t"+Thread.currentThread().getPriority());
		System.out.println("群组:\t"+Thread.currentThread().getThreadGroup());
		
		
		System.out.println("-------------------------------");
	}

}
