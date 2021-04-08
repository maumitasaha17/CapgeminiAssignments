package Day8;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
	//	Map m = new Hashtable();
		//leagacy class -1.0v
		//insertion order - wont maintain
		//duplicate keys - wont allow
		//duplicate values - allowed
		//null keys - not allow
		//null values - not allowed
		// Thread Safety can be achieved
		//position of bucket can be identified based on hashcode() method
		//enumeration for iteration
		//inherit the dictionary class
	Hashtable<String, Integer> m = new Hashtable();

		m.put("Ram", 60);
		m.put("Sam", 80);
		m.put("Ravi", 80);
		m.put("Ramya", 90);
		m.put("Sam", 100);
		m.put("null", 100);
		m.put("Max", null);
		
		System.out.println(m);
		
		Set<String> keys = m.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
			System.out.println();
			System.out.println("Enumeration output");
			Enumeration<Integer> e = m.elements();
			while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
		
		
		
		
		/* TreeMap
		Map m = new TreeMap();

		m.put("Ram", 60);
		m.put("Sam", 80);
		m.put("Ravi", 80);
		m.put("Ramya", 90);
		m.put("Sam", 100);
		m.put("null", 100);
		m.put("Max", null);
		
		//A-65
		//a-97
		
		System.out.println(m);
		//duplicate keys not allowed
		//insertion key is not maintained
		*/
		
	