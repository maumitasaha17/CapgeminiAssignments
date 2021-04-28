package Practice;

import java.util.Scanner;

public class RepeateString {
	StringBuilder repeat(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = n; i > 0; i--) {
			sb.append(s.substring(0, i));
		}
		return sb;
	}

	public static void main(String[] args) {

		RepeateString rp = new RepeateString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr two String and length:");
		String s1 = sc.nextLine();
		sc.next();
		int n = sc.nextInt();
		System.out.println(rp.repeat(s1, n));
		sc.close();
	}

}