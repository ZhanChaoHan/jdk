package com.jachs.jdk.lang.thread.runnable.part2.job;

/***
 * 
 * @author zhanchaohan
 *
 */
public class BreakFastJob implements Runnable{

	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("恰饭");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
