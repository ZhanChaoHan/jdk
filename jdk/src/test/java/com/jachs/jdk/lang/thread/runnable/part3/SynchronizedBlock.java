package com.jachs.jdk.lang.thread.runnable.part3;

import java.util.Random;

/***
 * 对象方法同步
 * @author zhanchaohan
 *
 */
public class SynchronizedBlock {
	private static Long countMonery = 0L;
	private static String lastCustomer = null;
	private static Long maxMonery = 20000L;
	private static Random random = new Random();

	private static int intCount = 0;

	public void Count() {
		synchronized (this) {
			++intCount;
			System.out.println(Thread.currentThread().getName() + "\t" + intCount);
		}
	}

	public void Bidding() {
		synchronized (this) {
			String thName = Thread.currentThread().getName();// 线程名称
			if (thName.equals(lastCustomer)) {// 本次竞价和最高竞价同一个人跳过
				return;
			} else {
				lastCustomer = thName;
			}
			int randomC = random.nextInt(1000);
			if (randomC == 0) {
				return;
			}
			if ((countMonery + randomC) >= maxMonery) {
				System.exit(0);
			} else {
				countMonery = countMonery + randomC;
				System.out.println(lastCustomer + "最新价:" + countMonery);
			}
		}
	}
}
