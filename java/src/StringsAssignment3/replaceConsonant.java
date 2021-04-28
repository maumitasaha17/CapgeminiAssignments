package StringsAssignment3;

import java.util.Scanner;

public class replaceConsonant {

	public String rConsonants(String str) {

		StringBuffer sbr = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			char c = sbr.charAt(i);
			if (!(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o'
					|| c == 'U' || c == 'u')) {
				sbr.replace(i, i + 1, String.valueOf((char) (c + 1)));
			}
		}
		return sbr.toString();
	}

	public static void main(String[] args) {

		replaceConsonant r = new replaceConsonant();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string = ");
		String str = s.next();
		System.out.println(r.rConsonants(str));
	}

}
