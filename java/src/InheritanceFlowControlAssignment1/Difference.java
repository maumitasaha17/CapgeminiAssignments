package InheritanceFlowControlAssignment1;

public class Difference {

	public static int calculateDifference(int n) {
		// sum of squares of n natural numbers
		int sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;
		System.out.println("sum of squares of n natural numbers= " + sumSquare);
		// sum of n natural numbers
		int sum = (n * (n + 1)) / 2;
		System.out.println("sum of n natural numbers= " + sum);
		// square of sum if n natural numbers
		int squareSum = sum * sum;
		System.out.println("square of sum if n natural numbers= " + squareSum);
		// difference
		return Math.abs(sumSquare - squareSum);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Enter the number= " + n);
		System.out.println("Difference= " + calculateDifference(n));

	}

}
