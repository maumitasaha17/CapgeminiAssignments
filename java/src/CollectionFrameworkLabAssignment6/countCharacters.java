package CollectionFrameworkLabAssignment6;
import java.util.HashMap;
public class countCharacters {

	private static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		//converting string to Char array
		char[] strArray = inputString.toCharArray();
		//checking for each char to strArray
		for(char ch:strArray) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}
			else {
				charCountMap.put(ch, 1);
			}
		}
			System.out.println(inputString+ " : "+charCountMap);
	}
	
	
	public static void main(String[] args) {
		characterCount("hello world");

	}

}
