package com.jachs.jdk.lang.thread.runnable.part3.job;

import com.jachs.jdk.lang.thread.runnable.part3.SynchronizedBlock;

public class BiddingJob implements Runnable {
	SynchronizedBlock synchronizedBlock;
	
	
	public BiddingJob(SynchronizedBlock synchronizedBlock) {
		super();
		this.synchronizedBlock = synchronizedBlock;
	}


	public void run() {
		while (true) {
			synchronizedBlock.Bidding();
			try {
				Thread.sleep(1000);// 休眠方便控制台打印
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
