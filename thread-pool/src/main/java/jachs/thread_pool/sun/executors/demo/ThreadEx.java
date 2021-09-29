package jachs.thread_pool.sun.executors.demo;

/***
 * 模拟线程创建
 * @author zhanchaohan
 *
 */
public class ThreadEx implements Runnable {
	private int kk;
	
	
	public ThreadEx(int kk) {
		super();
		this.kk = kk;
	}


	@Override
	public void run(){
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"\t\t"+kk);
	}

}
