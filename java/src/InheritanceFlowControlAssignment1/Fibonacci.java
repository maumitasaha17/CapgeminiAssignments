package InheritanceFlowControlAssignment1;

import java.util.Scanner;

public class Fibonacci {
	int usingRecursion(int number) {
		if (number == 0)
			return 0;
		else if (number == 1 || number == 2)
			return 1;
		return usingRecursion(number - 1) + usingRecursion(number - 2);
	}

	public static void main(String[] args) {
		Fibonacci fibb = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sequence number:");
		int number = sc.nextInt();
		for (int index = 0; index <= number; index++) {
			System.out.print(fibb.usingRecursion(index) + " ");
		}
		sc.close();
	}

}