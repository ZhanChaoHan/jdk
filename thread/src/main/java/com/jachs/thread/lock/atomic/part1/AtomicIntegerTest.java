package com.jachs.thread.lock.atomic.part1;

/***
 * 
 * @author zhanchaohan
 *
 */
public class AtomicIntegerTest {
	public static void main(String[] args) {
		new Thread(new AtomicIntegerThread()).start();
		new Thread(new AtomicIntegerThread()).start();
		new Thread(new AtomicIntegerThread()).start();
		new Thread(new AtomicIntegerThread()).start();
		new Thread(new AtomicIntegerThread()).start();
	}
}
