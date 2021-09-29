package com.jachs.jdk.lang.thread.daemon.job;

public class SimpleJob implements Runnable {

	public void run() {
		for (int kk = 0; kk < 10; kk++) {
			System.out.println("多线程:"+kk);
		}
	}
}
