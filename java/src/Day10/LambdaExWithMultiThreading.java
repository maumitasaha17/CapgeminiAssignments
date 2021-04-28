package Day10;

import java.util.ArrayList;

public class LambdaExWithMultiThreading {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		// al.forEach(n->System.out.println(n)); //10,20,10,30
		al.forEach(n -> System.out.println(n + 5)); // 15,25,15,35

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};

		// public java.lang.Thread(java.lang.Runnable);
		Thread t = new Thread(r);
		t.start(); // output 0,1,2,3,4

	}
}
