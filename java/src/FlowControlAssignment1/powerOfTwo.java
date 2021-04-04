package FlowControlAssignment1;

public class powerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("The number is the power of two: " +powerOfTwo(6));
	}

	public static boolean powerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		while (n > 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
}