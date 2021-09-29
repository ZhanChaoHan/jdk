package com.jachs.jdk.lang.thread.daemon.job;


public class SimpleDaemonJob implements Runnable {

	public void run() {
		for (int kk = 0; kk < 10; kk++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("守护线程"+kk);
		}
	}

}
