package Day9;
/*
 * Synchronization
 * 
 * to overcome problem with inconsistency in data, we need to go for synchroization
 * synchronized is a modifier applicable for methods and blocks
 * once u added synchronized keyword to a method/block then method/block will enter into critical section
 * to access critical section. thread need to acquire lock
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

class Counter {
	int count; // 0, num = 5

	/*
	 * void incr(int num) { for(int i=0; i<5; i++) { System.out.println(count+=num);
	 * // 5,10,15,20,25 //35,45,55,65,75
	 */ // data incoistency whenever run again and again

	synchronized void incr(int num) {
		for (int i = 0; i < 5; i++) {

			System.out.println(count += num);
			// synchronized is used then there will be data consistency
			// 5.10,15,20,25,30,35,40,45,55
		}
	}

//to create a thread define the thread and extend the thread
	class MyThread5 extends Thread {

		Counter c; // c is defined as global level
		// parameterized constructor

		MyThread5(Counter c) {
			this.c = c;
		}

		public void run() {
			c.incr(5);
		}

	}

	class MyThread10 extends Thread {
		Counter c;

		MyThread10(Counter c) {
			this.c = c;
		}

		// My thread will register the thread 10
		public void run() {
			c.incr(10);
		}

	}

public class SynchronizationDemo {

	
	public static void main(String[] args) {
	Counter c = new Counter();
	
	MyThread5 mt5 = new MyThread5(c); // c is the counter object
	MyThread10 mt10 = new MyThread10(c);
	
	mt5.start();
	mt10.start();
	
	
	}

}
