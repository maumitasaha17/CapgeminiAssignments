package Practice;

import java.util.ArrayList;
import java.util.List;

/*Task6
abstract class A{
	void m1() {
		System.out.println("Parent m1 method");
	};
}
class B extends A{
	@Override
	void m1() {
		System.out.println("Child m1 method");
	}
}


Task9
class MyThread extends Thread{
	public void run() {
		System.out.println("Thread-1 running...");
	}
	public void run(int x) {
		System.out.println("Thread-2 running...");
	}
	public void run(long y) {
		System.out.println("Thread-3 running...");
	}
}

*/

public class trial {

	/*
	 * Task 3 int x = 20; //instance variable trial() { int x = 40; // local
	 * variable //this.x=40; }
	 * 
	 * Task 4 int z; trial(){} trial(int x, int y){ this.z = x*y; } trial(double x,
	 * double y){ this.z = (int) (x+y); } trial(float x, float y){ this.z = (int)
	 * (x/y); }
	 * 
	 * 
	 * Task5 private static String m1(String str, char c) { if(str==null) return
	 * null; return str.replaceAll(Character.toString(c), "").toUpperCase(); }
	 */

	public static void main(String[] args) {

		/*
		 * task1 int x=5; int y=6; System.out.println(x++ + ++y + ++x + y++); //26
		 * //5+7+7+7=26
		 * 
		 * Task2 int intArr[][]= {{1,2,3},{4,5,6},{7,8,9}}; int sum=0; for(int i=0;
		 * i<=3; ++i) {; for(int j=0; j<3; ++j) { sum = sum + intArr[i][j]; } }
		 * System.out.println(sum);//45 }
		 * 
		 * 
		 * Task3 int x = 60; // local to main method trial t = new trial();
		 * System.out.println(t.x); //20 System.out.println(x); //60
		 * //System.out.println(this.x); //400
		 * 
		 * 
		 * Task4 trial t1 = new trial(10.0, 10.0); System.out.println(t1.z); //20
		 * 
		 * 
		 * Task5 String str = "Hello World!"; System.out.println(m1(str,'o')); //HELL
		 * WRLD
		 * 
		 * 
		 * Task6 A a = new B(); a.m1(); // Child m1 method - overriding parent method
		 * 
		 * 
		 * Task7 try { int i, sum; sum=10; for(i=-1;i<3;++i) { sum =(sum/i);
		 * System.out.print(i);
		 * 
		 * } }catch (ArithmeticException e) { System.out.print("0"); //-10
		 * 
		 * }
		 * 
		 * 
		 * Task8 List<Integer> list = new ArrayList<>();
		 * java.util.ListIterator<Integer>a = list.listIterator();
		 * if(a.previousIndex()!=-1) while(a.hasNext()) System.out.print(a.next()+ " ");
		 * else System.out.print("Empty"); //Empty
		 * 
		 * 
		 * 
		 * Task9 MyThread t = new MyThread(); t.start(); //thread-1 running
		 */

	}

}


