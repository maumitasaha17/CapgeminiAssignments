package Day11;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 
 * Concurrrent collections
 * 
 * java.util.Collections
 * synchronizedSet
 * synchronizedList
 * synchronizedMap
 * 
 * -only one thread allowed at a time
 * -poor performance
 * 
 * concurrent collections
 * Map(I)
 * 	ConcurrentMap(I)
 * 		ConcurrentHashMap(C)
 * 
 * Collection(I)
 * 	List(I)
 * 		CopyOnWriteArrayList(C)
 * 	Set(I)
 * 		CopyOnWriteSet(C)
 * 
 * 
 * 
 * 
 * 
 * allows multiple read operations simultaneously and write/update operations are limited to 16
 * null key/value are not allowed
 * thread safe
 * while one thread iterating map other thread can able to perform update
 * we wont get ConcurrentModificationException
 * 
 * 
 * 
 */
public class ConcurrentCollectionsDemo {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put(10, "Pooja");
		m.put(10, "Shiva");
		System.out.println(m); // {10, Shiva}

		m.remove(10);
		System.out.println(m); // {}

		m.put(10, "Pooja");
		m.replace(10, "Shiva");
		System.out.println(m); // {10, Shiva}
		System.out.println();

		// pkg: java.util.concorrent
		System.out.println("ConcurrentHashMap");
		ConcurrentHashMap cm = new ConcurrentHashMap();
		cm.putIfAbsent(10, "Pooja");
		cm.putIfAbsent(10, "Shiva");
		System.out.println(cm); // {10, Pooja}

		cm.remove(10, "Shiva");
		System.out.println(cm); // {10, Pooja}

	}

}
