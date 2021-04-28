package InheritanceFlowControlAssignment1;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	void printPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNumbers obj = new PrimeNumbers();
		obj.printPrime(n);
		sc.close();
	}
}