package com.jachs.jdk.lang.thread.runnable.part2.job;

/***
 * 
 * @author zhanchaohan
 *
 */
public class WalkToSchool implements Runnable{

	public void run() {
		try {
			//模拟走路上学休眠3000毫秒
			Thread.sleep(30);
			System.out.println("走路上学");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
