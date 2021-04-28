package InheritanceFlowControlAssignment1;

public class SumOfNnaturalNumber {

	public static int calculateSum(int num) {
		int sum = 0;

		for (int i = 1; i <= num; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(calculateSum(20));
	}

}
