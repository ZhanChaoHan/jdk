package com.jachs.thread.callable;


/***
 * 
 * @author zhanchaohan
 *
 */
public class CallableThreadTest {
	
	public static void main(String[] args) throws Exception {
		CallableThread ct1=new CallableThread();
		
		String str=ct1.call();
		System.out.println(str);
	}

}
