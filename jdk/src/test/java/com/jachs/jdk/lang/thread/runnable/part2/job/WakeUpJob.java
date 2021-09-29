package com.jachs.jdk.lang.thread.runnable.part2.job;

/***
 * 
 * @author zhanchaohan
 *
 */
public class WakeUpJob implements Runnable{

	public void run() {
		try {
			//模拟起床耗时1秒
			Thread.sleep(1000);
			System.out.println("起床");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
