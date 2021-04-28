package Day8;

/*
 * 
 * map is unordered group key value pairs that are indexed by a key
 * 
 * HashMap - no order is guarenteed
 * 
 * LinkedHashMap - insertion order is preserved
 * 
 * TreeMap - elements are in sorted order by key
 * 
 * Set - a group of unique values without index
 */
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map m = new TreeMap();

		m.put("Ram", 60);
		m.put("Sam", 80);
		m.put("Ravi", 80);
		m.put("Ramya", 90);
		m.put("Sam", 100);
		m.put("null", 100);
		m.put("Max", null);

		// A-65
		// a-97

		System.out.println(m);
		// duplicate keys not allowed
		// insertion key is not maintained

	}

}
