package com.jachs.jdk.lang.thread.runnable.part1;

import java.util.ArrayList;
import java.util.List;

public class PrintJob implements Runnable{
	private List<String>aList=new ArrayList<String>();
	
	public PrintJob(List<String> aList) {
		super();
		this.aList = aList;
	}


	public void run() {
		long sTime=System.currentTimeMillis();
		for (String str : aList) {
			//模拟业务处理耗时
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long eTime=System.currentTimeMillis();
		
		System.out.println(Thread.currentThread().getName()+"\t"+(eTime-sTime));
	}

}
