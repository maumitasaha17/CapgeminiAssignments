package Day9;
/*
 * Multithreading - process based multitasking - OS, executing multiple applications parallely
 * 	ex: notepad, mp3, browsing
 * thread based multitasking - Java supports
 * single app, multiple independent tasks, that are executing parallel
 * 
 * ways to implement multithreading concept.
 * 1. by extending Thread class
 * 2. by implementing Runnable interface.
 * 
 * Priority - 10 is highest  & 1 is the least priority
 * ----------------------------------------------------
 * Thread state()
 * start();
 * run();
 * 
 * 
 * 
 * 
 * 
 * -----------------------------------------
 * MyThread mt = new MyThread(); //State-New
 * mt.start(); // Runnable
 * after recieving resources for execution, thread in Running
 * calling sleep(), wait() methods on running thread, brings thread into Blocking state
 * blocking state :  notify(), notifyAll() -->Runnable
 * Execution of run() method completed, then state of the thread is Dead state
 * 
 * sleep(1000) -->Runnable
 * sleep(milli, nano)
 * wait()
 * 
 * 
 * 
 * Interthread communication
 *------------------------------------------------------ 
 * memory will be shared by the threads
 * 
 * producers(to produce the output), consumers(COnsume), buffer pool (memory where you can store data)
 *
 *
 *producer - produce the output
 *consumer - consume
 *				Buffer Pool
 *				-------------
 *Producer			1
 *	wait		-------------notify		consumer
 *notify			2		 wait
 *notifyAll		-------------
 *					3
 *				-------------
 *
 *-------------
 *
 *				-------------
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
 *
 *
 */

/*
class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThead1");
			try {
				Thread.sleep(100); // thread will pass for given ammount of time that means here 100 is given so 100milliseconds
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThead2");
			try {
				Thread.sleep(100); // thread will pass for given ammount of time that means here 100 is given so 100milliseconds
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}//if run method is not there then the main Thread will be printed 5 times

		}
	}
	//public synchronized void start() {
		//System.out.println("Start Method"); // will print start Method instead of thread2
	
	}
}

public class MultiThreading {
	
	public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
		mt1.start(); // thread is created main thread first then my thread
		// 2 threads, 1 main & 1 user defined thread
		
		//mt1.run(); //MyThread - 5  first then main thread 5 times
		

		MyThread2 mt2 = new MyThread2();
		mt2.start(); // 2 my thread & 1 main thread
		//mt2.run(); // 3, 1 main & 2 user defined thread 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println("MainThead");//MainThread 5 times
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		
		}
		; // mainThread- MyThread and continoue
	}

}
 */

//RUNABLE INTERFACE

class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100); // thread will pass for given ammount of time that means here 100 is given so
									// 100milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100); // thread will pass for given ammount of time that means here 100 is given so
									// 100milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // if run method is not there then the main Thread will be printed 5 times

		}
	}
	/*
	 * public synchronized void start() { System.out.println("Start Method"); //
	 * will print start Method instead of thread2
	 * 
	 * } }
	 */
}

public class MultiThreading {

	public static void main(String[] args) {

		MyThread1 mt1 = new MyThread1();
		mt1.start(); // thread is created main thread first then my thread
		// 2 threads, 1 main & 1 user defined thread

		// mt1.run(); //MyThread - 5 first then main thread 5 times

		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);

		t2.start(); // 2 my thread & 1 main thread
		// mt2.run(); // 3, 1 main & 2 user defined thread 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());// to know the name of current thread
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		; // mainThread- MyThread and continoue
	}

}