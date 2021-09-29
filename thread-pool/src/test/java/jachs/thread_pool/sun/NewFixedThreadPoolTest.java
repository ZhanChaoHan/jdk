package jachs.thread_pool.sun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * 
 * @author zhanchaohan
 *
 */
public class NewFixedThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}