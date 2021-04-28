package StringsAssignment3;

import java.util.*;

public class StringToken {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		System.out.print("Enter numbers = ");
		String input = str.next();
		StringTokenizer st = new StringTokenizer(input, "+");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int n = 0;
			n = Integer.parseInt(st.nextToken());
			System.out.println("Number is = " + n);
			sum += n;
		}
		System.out.println("Sum of the number is = " + sum);
	}

}
