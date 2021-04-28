package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Collection - Representing group of objects as a single entity
 * 
 * Stream - If you want to process objects from collections
 * Calling stream() method on Collection instance, stream will get created
 * 
 * * 
 * 
 */
public class StreamAPIDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(65);
		marks.add(100);
		marks.add(80);
		marks.add(30);
		marks.add(43);

		System.out.println(marks);

		// marks greater than 50
		List<Integer> m = marks.stream().filter(num -> num > 50).collect(Collectors.toList());
		System.out.println("marks greater than 50 " + m);

		// filtering even nnumber
		List<Integer> m1 = marks.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers " + m1);

		// Adding Function .map()
		List<Integer> m2 = marks.stream().map(ele -> ele + 5).collect(Collectors.toList());
		System.out.println(m2);

		// Count
		long m3 = marks.stream().filter(num -> num > 50).count();
		System.out.println(m3);
		System.out.println();

		// acessending or decending order
		List<Integer> m4 = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(m4);
		List<Integer> m5 = marks.stream().sorted((obj1, obj2) -> obj1.compareTo(obj2)).collect(Collectors.toList());
		System.out.println(m5);
		System.out.println();

		// acc using teneary operation
		List<Integer> m6 = marks.stream().sorted((obj1, obj2) -> obj1 > obj2 ? 1 : obj1 < obj2 ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println(m6);
		// dec using teneary operation
		List<Integer> m7 = marks.stream().sorted((obj1, obj2) -> obj1 > obj2 ? 1 : obj1 < obj2 ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(m7);
		System.out.println();

		// MAX and MIN
		Integer min = marks.stream().min((obj1, obj2) -> obj1.compareTo(obj2)).get();
		System.out.println(min);
		Integer max = marks.stream().min((obj1, obj2) -> obj2.compareTo(obj1)).get();
		System.out.println(max);
		System.out.println();

		// displaying array list elements
		marks.stream().forEach(el -> System.out.println(el));
		System.out.println();

		// to process the stream in objects
		// converting list of numbers to stream
		Stream<Integer> s = Stream.of(10, 20, 30, 40, 50); // 10,20 are not part of the collection still i can access
															// using Stream
		// long count = s.count();
		// System.out.println(count);
		s.forEach(el -> System.out.println(el));

		// Min & Max
		// Sorting asc/dec
		// asc- 0th elem - min - 5 & last elem - max - 30
		// dec- 0th elem - min - 30 & last elem - max - 5
		// comparable - compareTo() //single sorting sequence
		// Comparator - compare() & equal() //multiple sorting sequence
		// obj1 should come after obj2 - +ve
		// obj1 should come before obj2 - -ve
		// obj1 & obj2 are same - 0

		/*
		 * public void compare(Object obj1, Object obj2 ){ if(obj1>obj2) { return 1; }
		 * else if(obj1<obj2) { return -1; } else { return 0; }
		 */

		// obj1>obj2?1:obj1<obj2?-1:0 = Teranarry operation

	}

}
