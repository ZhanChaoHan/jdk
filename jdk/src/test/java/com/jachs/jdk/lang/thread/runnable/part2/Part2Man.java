package com.jachs.jdk.lang.thread.runnable.part2;

import com.jachs.jdk.lang.thread.runnable.part2.job.BreakFastJob;
import com.jachs.jdk.lang.thread.runnable.part2.job.WakeUpJob;
import com.jachs.jdk.lang.thread.runnable.part2.job.WalkToSchool;

/***
 * 
 * @author zhanchaohan</br>
 *         多线程模拟同步获取结果集</br>
 *
 */
public class Part2Man {

	public static void main(String[] args) throws InterruptedException {
		Thread wakeUpJob=new Thread(new WakeUpJob());
		Thread breakFastJob=new Thread(new BreakFastJob());
		Thread walkToSchool=new Thread(new WalkToSchool());
		
		wakeUpJob.start();
		wakeUpJob.join();//等待该线程终止。
		
		
		breakFastJob.start();
		breakFastJob.join();//等待该线程终止。
		
		walkToSchool.start();
	}
}
