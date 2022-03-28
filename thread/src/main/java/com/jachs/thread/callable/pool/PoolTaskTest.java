package com.jachs.thread.callable.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import com.jachs.thread.callable.future.CallableThread;

/***
 * 
 * @author zhanchaohan
 *
 */
public class PoolTaskTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		FutureTask fTask1=new FutureTask<String>(new CallThread("链接数据库"));
		FutureTask fTask2=new FutureTask<String>(new CallThread("选择表"));
		FutureTask fTask3=new FutureTask<String>(new CallThread("读取表字段"));
		FutureTask fTask4=new FutureTask<String>(new CallThread("读取表数据"));
		FutureTask fTask5=new FutureTask<String>(new CallThread("关闭链接"));
		
		executorService.submit(fTask1);
		executorService.submit(fTask2);
		executorService.submit(fTask3);
		executorService.submit(fTask4);
		executorService.submit(fTask5);
		
		System.out.println(fTask1.get());
		System.out.println(fTask2.get());
		System.out.println(fTask3.get());
		System.out.println(fTask4.get());
		System.out.println(fTask5.get());
		
		System.out.println("全部任务执行完毕");
		executorService.shutdown();
	}
}
