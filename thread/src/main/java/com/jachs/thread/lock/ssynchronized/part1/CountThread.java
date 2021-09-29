package com.jachs.thread.lock.ssynchronized.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class CountThread implements Runnable {
	private static int count = 0;

	private static synchronized void add() {
		for (int kk = 0; kk < 10; kk++) {
			count++;
		}
		System.out.println(Thread.currentThread().getName() + "\t" + count);
	}

	@Override
	public void run() {
		add();
	}

}
