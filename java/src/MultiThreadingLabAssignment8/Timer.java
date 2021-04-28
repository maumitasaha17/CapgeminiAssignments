package MultiThreadingLabAssignment8;

import java.util.Date;

public class Timer implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(new Date());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}