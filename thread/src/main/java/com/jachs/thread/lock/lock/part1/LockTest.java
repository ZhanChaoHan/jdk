package com.jachs.thread.lock.lock.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class LockTest {
	public static void main(String[] args) {
		new Thread(new ThreadTest()).start();
		new Thread(new ThreadTest()).start();
		new Thread(new ThreadTest()).start();
		new Thread(new ThreadTest()).start();
		new Thread(new ThreadTest()).start();
	}
}
