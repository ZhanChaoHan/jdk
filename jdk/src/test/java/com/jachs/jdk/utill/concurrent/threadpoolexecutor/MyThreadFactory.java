package com.jachs.jdk.utill.concurrent.threadpoolexecutor;

import java.util.concurrent.ThreadFactory;

/***
 * 集成接口自定义线程实现工厂
 * @author zhanchaohan
 *
 */
public class MyThreadFactory implements ThreadFactory {

	public Thread newThread(Runnable r) {
		return null;
	}

}
