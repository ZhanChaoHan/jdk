package com.jachs.jdk.lang.thread.runnable.part3;

import com.jachs.jdk.lang.thread.runnable.part3.job.BiddingJob;
import com.jachs.jdk.lang.thread.runnable.part3.job.SimpleCountJob;

/***
 * 测试线程同步
 * 
 * @author zhanchaohan 模拟竞价,规则如下:</br>
 *         1:同一个人不能再最高价基础上再次加价,最高价不能等于再次竞价</br>
 *         2：最高价为maxMonery不能超过</br>
 */
public class Part3Man {
	

	public static void main(String[] args) throws InterruptedException {
		SynchronizedBlock synchronizedBlock=new SynchronizedBlock();
		
		//测试Synchronized同步块的方法同步
//		new Thread(new BiddingJob(synchronizedBlock)).start();
//		new Thread(new BiddingJob(synchronizedBlock)).start();
//		new Thread(new BiddingJob(synchronizedBlock)).start();
//		new Thread(new BiddingJob(synchronizedBlock)).start();
//		new Thread(new BiddingJob(synchronizedBlock)).start();
		
		//测试简单线程执行顺序打印
		new Thread(new SimpleCountJob(synchronizedBlock)).start();
		new Thread(new SimpleCountJob(synchronizedBlock)).start();
		new Thread(new SimpleCountJob(synchronizedBlock)).start();
		new Thread(new SimpleCountJob(synchronizedBlock)).start();
		new Thread(new SimpleCountJob(synchronizedBlock)).start();
		
	}
}
