package MultiThreadingLabAssignment8;

public class TimerMain {

	public static void main(String[] args) {
		Timer t1 = new Timer();
		Thread n = new Thread(t1);
		n.start();
	}

}
