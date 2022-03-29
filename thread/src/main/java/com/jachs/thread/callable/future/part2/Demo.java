package com.jachs.thread.callable.future.part2;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Demo {
	 public static void main(String[] args) throws Exception {
		 Long sTime=System.currentTimeMillis();
				 
		 RunnableFuture<String>runtask=new FutureTask<String>(new CallThread());
		 RunnableFuture<String>runtask1=new FutureTask<String>(new CallThread());
		 RunnableFuture<String>runtask2=new FutureTask<String>(new CallThread());
		 RunnableFuture<String>runtask3=new FutureTask<String>(new CallThread());
		 
		 new Thread(runtask,"A").start();
		 new Thread(runtask1,"B").start();
		 new Thread(runtask2,"C").start();
		 new Thread(runtask3,"D").start();
		 
		 String tName=runtask.get();
		 String tName1=runtask1.get();
		 String tName2=runtask2.get();
		 String tName3=runtask3.get();
		 
		 
		 System.out.println(tName);
		 System.out.println(tName1);
		 System.out.println(tName2);
		 System.out.println(tName3);
		 
		 Long eTime=System.currentTimeMillis();
		 
		 System.out.println("耗时:\t"+(eTime-sTime));
	 }
}
