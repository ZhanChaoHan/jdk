package com.jachs.thread.lock.atomic.part1;

import java.util.concurrent.atomic.AtomicInteger;

/***
乐观锁：顾名思义，就是很乐观，每次去拿数据的时候都认为别人不会修改，所以不会上锁，但是在更新的时候会判断一下在此期间别人有没有去更新这个数据，可以使用版本号等机制。在Java中j原子变量类就是使用了乐观锁的一种实现方式CAS实现的。
乐观锁的实现方式： 使用版本标识来确定读到的数据与提交时的数据是否一致。提交后修改版本标识，不一致时可以采取丢弃和再次尝试的策略。
 * @author zhanchaohan
 *
 */
public class AtomicIntegerThread implements Runnable{
	static AtomicInteger aic=new AtomicInteger();
	
	private static void add() {
		for (int kk = 0; kk < 10; kk++) {
			aic.getAndIncrement();
		}
		System.out.println(Thread.currentThread().getName()+"\t"+aic.get());
	}
	@Override
	public void run() {
		add();
	}

}
