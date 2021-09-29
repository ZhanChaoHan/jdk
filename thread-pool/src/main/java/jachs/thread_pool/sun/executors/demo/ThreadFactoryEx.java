package jachs.thread_pool.sun.executors.demo;

import java.util.concurrent.ThreadFactory;

/***
 * 
 * @author zhanchaohan
 *
 */
public class ThreadFactoryEx implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		//这里可以给新建的线程进行二次操作，比如修改线程名称或状态
		System.out.println(r.toString());
		Thread tr=new Thread(r);
		tr.setName("修改名称:"+tr.getName());
//		tr.setPriority(500);
		return tr;
	}

}
