package Day3;
/*string - sequence of characters using double qoutes
 * immutable
 * 
 * 
 * 
 * 
 */
public class StringsDemo {

	public static void main(String[] args) {
		/*String str1 = new String("Hello ");
		//1 in heap area & 1 in SCP area
		String str2 = new String("Hello");
		//1 object in heap area
		//2 in heap & 1 in SCP
		String str3 = "Hello";
		//0 in heap & 0 in SCP
		//2 in heap & 1 in SCP
		
		
		//Case 2
		str1.concat("World");
			System.out.println(str1);
		str1 = str1.concat("World");
			System.out.println(str1);
	}
		
		//equals & ==
		String str1 = new String("Hello ");
		String str1 = new String("Hello ");
		//heap-2
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);*/
	
		/*case
		String str1 = new String("hello");
		String str2=str1;
		str1= "world";*/
		
		String s1 = new String("Java");
		//1 in heap - Java 
		//1 in SCP-java
		s1.concat("Programming");
		//1 in heap - JavaPrograming
		// 1 in SCP - Programing
		String s2 = s1.concat("Language");
		//1 in heap- javalanguage
		//1 in scp- language
		s2.concat("For Developers");
		//1 in heap - javalanguagefor developers
		//scp - for developers
		System.out.println(s1); //Java
		System.out.println(s2); //JavaLanguage
		
	    // how many objects in heap & SCP? - 4 in heap & 4 in SCP
	
	}
