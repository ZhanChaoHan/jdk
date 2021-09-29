package com.jachs.jdk.lang.thread.runnable.part1;

import java.util.ArrayList;

/***
 * 
 * @author zhanchaohan </br>
 *         简单多线程模拟大数据处理
 */
public class Part1Man {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> aList = new ArrayList<String>();

		for (int kk = 0; kk < 10000; kk++) {
			aList.add(kk + "条消息");
		}
		/***
		 * 五条线程耗时如下 Thread-3 2579 </br>
		 * Thread-4 2579 </br>
		 * Thread-1 2586 </br>
		 * Thread-2 2587 </br>
		 * Thread-0 2593
		 */
		new Thread(new PrintJob(aList.subList(0, 2000))).start();
		new Thread(new PrintJob(aList.subList(2000, 4000))).start();
		new Thread(new PrintJob(aList.subList(4000, 6000))).start();
		new Thread(new PrintJob(aList.subList(6000, 8000))).start();
		new Thread(new PrintJob(aList.subList(8000, 10000))).start();

		// 耗时，12905
//		long sTime=System.currentTimeMillis();
//		for (String str : aList) {
//			Thread.sleep(1);
//		}
//		long eTime=System.currentTimeMillis();
//		System.out.println(eTime-sTime);
	}
}
