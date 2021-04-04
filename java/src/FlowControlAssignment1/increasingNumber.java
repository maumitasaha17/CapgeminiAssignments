package FlowControlAssignment1;

public class increasingNumber {

	public static boolean increasingNumber(int n) {
		String str = Integer.toString(n);
		char[] chr = str.toCharArray();

		for (int i = 0; i < chr.length - 1; i++) {
			if (chr[i] > chr[i + 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(increasingNumber(134468));

	}

}
