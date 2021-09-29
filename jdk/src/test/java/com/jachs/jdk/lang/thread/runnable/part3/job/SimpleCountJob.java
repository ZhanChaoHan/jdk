package com.jachs.jdk.lang.thread.runnable.part3.job;

import com.jachs.jdk.lang.thread.runnable.part3.SynchronizedBlock;

/***
 * 
 * @author zhanchaohan
 *
 */
public class SimpleCountJob implements Runnable{
	private SynchronizedBlock synchronizedBlock;
	
	
	public SimpleCountJob(SynchronizedBlock synchronizedBlock) {
		super();
		this.synchronizedBlock = synchronizedBlock;
	}


	public void run() {
		synchronizedBlock.Count();
	}

}
