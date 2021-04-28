package Day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {

		// Pattern pattern1 = Pattern.compile(".*");

		Pattern pattern1 = Pattern.compile("[mM]rs?\\.");
		Pattern pattern2 = Pattern.compile("[0-2]{3}-[0-9]{8}");
		Pattern pattern3 = Pattern.compile("^(\\+)\\s91\\s\\d{2}\\s\\d{4}\\s\\d{4}.*");
		Pattern pattern4 = Pattern.compile("\\d{3}\\s\\d{3}\\s\\d{5}.*");
		Pattern pattern5 = Pattern.compile("MTNL / BSNL");

		Matcher matcher1 = pattern1.matcher("Mr."); // "Mr. & Mrs. "
		Matcher matcher2 = pattern2.matcher("020-26231407");
		Matcher matcher3 = pattern3.matcher("+91 20 2623 1407 (International call rates applicable)");
		Matcher matcher4 = pattern4.matcher("613 701 98270 (Toll Number) #");
		Matcher matcher5 = pattern5.matcher("MTNL / BSNL");

		if (matcher1.matches()) {
			System.out.println(matcher1.group());
		} else {
			System.out.println("Matcher not found in given input");
		}

		if (matcher2.matches()) {
			System.out.println(matcher2.group());
		} else {
			System.out.println("Matcher not found in given input");
		}

		if (matcher3.matches()) {
			System.out.println(matcher3.group());
		} else {
			System.out.println("Matcher not found in given input");
		}

		if (matcher4.matches()) {
			System.out.println(matcher4.group());
		} else {
			System.out.println("Matcher not found in given input");
		}

		if (matcher5.matches()) {
			System.out.println(matcher5.group());
		} else {
			System.out.println("Matcher not found in given input");
		}

	}

}
