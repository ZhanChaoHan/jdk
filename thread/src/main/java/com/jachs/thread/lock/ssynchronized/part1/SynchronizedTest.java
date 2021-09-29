package com.jachs.thread.lock.ssynchronized.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class SynchronizedTest {
	public static void main(String[] args) {
		new Thread(new CountThread()).start();
		new Thread(new CountThread()).start();
		new Thread(new CountThread()).start();
		new Thread(new CountThread()).start();
		new Thread(new CountThread()).start();
	}
}
