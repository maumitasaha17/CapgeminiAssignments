package Day4;

/* java.util.regex
 * 
 * Patterns-
 * 
 * Meta characters like
 * . - any single character
 * \d - any single digit
 * \D - other than digit
 * \w - any single word char - alphabets(upper/lower), digits, _,$
 * \W - other than word char
 * \s - space
 * \S - other than space
 * ^ - start with
 *  $ - ends with
 * 
 * 
 * Quantifiers - quantity
 * ? - 0 or 1
 * + - 1 or more times
 * * - 0 or more times
 * {} - define size of the numbers - characters to be repeated. 
 * eg.  {5} means characters should be repeated 5 times, 
 * 		{5,10} means characters should be min-5 & max-10
 * 		{5,} means min 5 & max can be anything
 * [] - representing group of char
 * eg.  [abc] means any one character should match with any of the chars given in []
 * 		[^abc] means other than these characters
 * 		^[abc] means starts with either a or b or c
 * 		[abc]$ means given input should end with a or b or c
 * 		[0-9] - any single digit
 * 		[789] means any single digit that can be 7 or 8 or 9
 * 		[0-5] means 0 to 5
 * 
 * Patterns-
 * 	e.g.1923 - 4 digits means four times \d (\d\d\d\d)
 * 		1923| 2345 means \d\d\d\d
 * 				- [0-9][0-9][0-9][0-9]
 * 				- [0-9]{4}
 * 				- \d{4}
 * 
 * 
 * 1800 123 1234 - \d{4}\s\d{3}\s\d{4}
 * if exactly your are expecting 1800 - 1800\s\d{3}\s\d{4}
 * 
 * 1700 123 4567 - ^[17|18]\d{2}\s[0-9]{3}\s[0-9]{4}
 * 			- if number should either start with 17 or 18
 * 
 *  write pattern that matches 0-50?
 *  0-50 - [0-9][0-9]
 *  	 - it matches 00, 60, 80, 90, 99
 * 		 - [0-4][0-9] - 49
 * 
 * 192.168.1.1 - [0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9](1,3}
 * 			or else \d{1,3}\.\d{1,3}\.\d{1,3}\.\d(1,3}
 * 
 * 8 char length
 * char's shouldnt repeated
 * combination of numbers, alphabets & spl chars
 * 
 * 12345678
 * asb12345
 * 13455&ab
 * 
 * 
 * 
 * 
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsDemo {

	
	public static void main(String[] args) {
	/*
		Pattern pattern = Pattern.compile("[0-4][0-9]"); //define pattern
		Matcher matcher = pattern.matcher("abcxyz43lmo"); //define input
		
		if(matcher.matches()) {
			System.out.println(matcher.group()); //group method will return the strings
		} else {
			System.out.println("Matcher not found in given input");
		}
		if(matcher.find()) {
			System.out.println(matcher.group()); 
		} else {
			System.out.println("Matcher not found in given input");
		}*/
	    
		//test@gmail.com
		Pattern pattern1 = Pattern.compile("\\w{4}@\\w{5}\\.\\w{3}");
		Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.com"); //define pattern
		
		Matcher matcher1 = pattern2.matcher("test123@gmail.com"); //define input
	
		/*if(matcher1.matches()) {
			System.out.println(matcher1.group()); //group method will return the strings
		} else {
			System.out.println("Matcher not found in given input");
		}*/
		
		if(matcher1.find()) {
			System.out.println(matcher1.group()); 
		} else {
			System.out.println("Matcher not found in given input");
		}
/*	
	1. write pattern to match mr. and mrs. ?
		[mM]rs?\\.
		
	2. 020-26231407
		\d{8}-\d{8},
		[0-2]{3}-[0-9]{8},
		
		
		
	3. +91 20 2623 1407 (International call rates applicable)
		"\\+"\s91\s\d{2}\s\d{4}\s\d{4}\s(International call rates applicable)"
		
	4. 613 701 98270 (toll number) #
		\d{3}\s\d{3}\s\d{5}.*
		
		Pattern pattern4 = Pattern.compile("(\\d{3})\\s(\\d{3})\\s(\\d{5}).*");
		Matcher matcher4 = pattern4.matcher("613 701 98270 (Toll Number) #"); 
		if(matcher4.matches()) {
			System.out.println(matcher4.group()); 
			System.out.println(matcher4.group(1)); //613 for individual set of group
			System.out.println(matcher4.group(2)); //701
			System.out.println(matcher4.group(3)); //98270
		} else {
			System.out.println("Matcher not found in given input");
		}
	
	5. MTNL / BSNL
	 	MTNL\/BSNL
	
*
*
*
*
*/
	}
}
