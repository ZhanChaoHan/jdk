package com.jachs.thread.lock.lock.part1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ThreadTest implements Runnable {
	private static int count = 0;
	
	// 公平锁,谁等待时间最长谁先获取锁
//	Lock lock=new ReentrantLock(true);//默认空参是true
	// 非公平锁
	static Lock lock = new ReentrantLock(false);
	private  void add() {
		try {
			lock.lock();
			for (int kk = 0; kk < 10; kk++) {
				count++;
			}
			System.out.println(Thread.currentThread().getName() + "\t" + count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	@Override
	public void run() {
		add();
	}

}
