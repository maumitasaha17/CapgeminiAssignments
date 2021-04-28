/*
 * Collections: if you want to represent group of individuals objects single entity
 * grow-able in size
 * Homogeneous and Heterogeneous
 * Wont support primitive
 * supports only non primitive/objects
 * Performance slow compared to arrays
 * Methods = add(), addAll(), remove(), get(), getAll(), insert()
 * collections are implemented based on underlying data structures
 * 
 * 
 * Arrays: - Drawbacks:
 * fixed in size
 * homogeneous elements
 * support both primitive(byte, short, int) and non primitive (null, array, String, Employees) data types
 * no predefined methods
 * no underlying data structures
 * Performance is good compared to collections
 * 
 * 
 * 9 key interfaces in collection framework
 * Collection(I)
 * 1.List(I)
 * 	IMPL CLASSES - ArrayList, LinkedLiswt, Vector, Stack
 * 	Legacy Classes - Vector & Stacl (1.0v)
 *  Hiracrchy of List(I)
 * 
 * 2.Set(I)
 * 	SortedSet(I)
 * 	NavigableSet(I)
 * 
 * Impl classes: HashSet, LinkedHashSet & TreeSet
 * Hiracrchy of Set(I) => HashSet => SortedSet(I) => NavigableSet(I) => TreeSet
 *
 * 
 * 3.Queue(I)
 * 	PriorityQueue
 * 	BlockingQueue
 * 		PriorityBlockingQueue
 * 		LinkedBlockingQueue
 * 
 * 4.Map(I)
 * 		HashMap
 * 			LinkedHashMap
 * 		SortedMap(I)
 * 			NavigableMap(I)
 * 				TreeMap
 * 		IdentityHashMap
 *		WeakHashMap
 *	
 *		Dictionary(Abstract class)
 * 			HashTable
 * 				Properties
 * 
 * 
 * List 
 * 	Collection - Root interface for List, Set & QUEUE
 * 	List - Root Interface for ArrayList, LinkedList, Vector & Stack
 *  interface - interface - extends
 *  class - class - extends
 *  class - interface - implements
 *  
 *  class can implement multiple interfaces? yess
 *  class can extend multiple classes? No
 *  
 *  Need of List:
 *  1.Maintain insertion order
 *  2.Allows duplicate elements
 *  3.Homogeneous & Hetrogenious elements
 *  
 *  ArrayList
 * 1. Growable in nature
 * 2.Maintain insertion order
 * 3.Allows duplicate elements
 * 4.Homogeneous & Hetrogenious elements
 * 5.Accessing/retrival elements faster
 * 6.Clonable, Serializable(write objects in class file) & RandamAccess(array list implements random access)
 * 7. null values are allowed
 * 
 * 
 * Drawback:
 * when you are performing insert/remove operations lot shift operation will perform.
 * and performance will get affected
 * 
 * |value|address|
 * |"A"|"B"|"V"|"X"|
 * al.add(2,"M"); in postion 2 M will be placed
 * |"A"|"B"|"M"|"V"|"X"|
 * al.remove("M"); // M value will be removed and rest of the values will be shifted there and there wont be any empty space left there
 * |"A"|"B"|"V"|"X"|
 * 
 * pk: java.util
 * 
 * constructors
 * ------------
 * 1. ArrayList al = new ArrayList(); //Empty ArrayList
 * initial capacity - 10
 * capacity(); // number of elements can be stored
 * size();// number of elements occupied
 * a1.add("A");
 * a1.add("B");
 * ...
 * insert 11th element
 * 	creates new ArrayList Object with size (initialCapacity*3/2)+1
 * 	10*3/2+1 = 16 => 16*3/2+1 = 25
 * copy all elements from old arrayList object to New ArrayList object and 
 * new element added at the end 
 * old object ArrayList will be garbage collection list
 * reference will be pointed to new ArrayList Object
 * Old ArrayList object is eligible for GC
 * 
 * 
 * 2.ArrayList al = new ArrayList(int initialCapacity);
 * 	ArrayList al = new ArrayList(30);
 * 
 * 3.ArrayList al = new ArrayList(Collection c);
 * 
 * 
 * LinkedList: 
 * 1. Growable in nature
 * 2.Maintain insertion order
 * 3.Allows duplicate elements
 * 4.Homogeneous & Hetrogenious elements
 * 5.Clonable, Serializable(write objects in class file) & RandamAccess(invalid)
 * 6. null values are allowed
 * 7. Insertion & removal operations are fast
 * 8. elements are not stored in contiguous memory locations
 * 9.LinkedList underlying data structures.
 * 10. node - addresss ress & value
 * 11. not threat safe
 * 
 * drawback:
 * search/retrival operations are slower
 * 
 * 
 * |"value"|address|
 * |"A"|100|	|"B"|101|	|"C"|102|
 * one node		another node
 * consist of value and address
 * 
 * ll.add(1,"D") 
 * |"A"|104|	|"D"|100|	|"B"|101|	|"C"|102|
 * 
 * 
 * Vector: Legacy class-introduced in 1.0 version
 * * 1. Growable in nature
 * 2.Maintain insertion order
 * 3.Allows duplicate elements
 * 4.Homogeneous & Hetrogenious elements
 * 5.Clonable, Serializable(write objects in class file) & RandamAccess(invalid)
 * 6.null values are allowed
 * 7.implements RandomAccess interface
 * 8.search operation is faster
 * 9.Most of the methods declared in vector are synchronised(Thread safe can be achieved)
 * 10.Enumeration interface can be used to iterate
 * 11. Methods names are lengthy
 * 
 * 		addElements(Object obj);
 * 		
 * 		removeAllElements(Object o);
 * 		removeElements(int index);
 *		
 *		Object elementAt(int index);
 * 		Object firstElementAt();
 *		Object lastElementAt();
 *
 *Constructors
 *------------
 *Vector v = new Vector(); // default capacity - 10
 *Vector v = new Vector(int initialCapacity);
 *Vector v = new Vector(int initialCapacity, int incrementalCapacity);
 *Vector v = new Vector(Collection c); // collection to vector
 *
 *newCapacity = 2 * currentCapacity;
 *Vector v = new Vector(1000);
 *2*1000 = 2000
 *Vector v = new Vector(1000,50);
 *
 *convert collection into vector
 *size();
 *only one main threads that will be performed
 *
 *
 *
 *Stack: is a child class of vector
 *-LIFO
 *
 *Stack stack = new Stack()
 *most commonly used methods are:
 *push(Object o); //add elements
 *pop(); // remove and return top of stack
 *peek(); // remove top of element
 *empty(); // check stack is empty or not
 *search(); // search element in stack, return offset
 *			offset - s.search("A"); from top of stack offset of "A"
 *			return '-1'; // when no element
 *
 *stack.push("A");
 *stack.push("B");
 *stack.push("C");
 *stack.push("A");
 *
 *"C" - 1
 *"B" - 2
 *"A" - 3
 *
 *stack.search("A"); // 3 (offset Value)
 *stack.search("G"); // -1 when the value is not mentioned in the list
 *
 *Insertion order - maintains
 *duplicates - allowed
 *
 *-------------------------------------------------------
 *
 *Set(I):
 *	HashSet
 *		LinkedHashSet
 * 	SortedSet(I)
 * 		NavigableSet(I)
 * 			TreeSet
 * 
 * 
 * insertion order is not mantained
 * duplicates are not allowed
 * only one null value can be inserted
 * Homogeneous element are allowed
 * Heterogeneous elements are not supported in TreeSet
 * 
 * HashSet
  * insertion order is not mantained
 * duplicates are not allowed
 * only one null value can be inserted
 * Homogeneous element are allowed
 * Heterogeneous elements are not supported in TreeSet
 * Clonable, Serializable(write objects in class file) & RandamAccess(invalid)
 *
 * HashSet hs = new HashSet();
 * default size - 16 
 * fill ratio - 0.75
 * HashSet hs = new HashSet(int initialCapacity);
 * HashSet hs = new HashSet(int initialCapacity, float loadFactor);
 * HashSet hs = new HashSet();
 * 
 * 
 * 
 * LinkedHashSet:
 * 
 * 
 * insertion order is not mantained
 * duplicates are not allowed
 * only one null value can be inserted
 * Homogeneous element are allowed
 * Heterogeneous elements are not supported in TreeSet
 * 
 * 
 *  
 * TreeSet:
 * insertion order is not mantained : because it store elements based on default natural sorting
 * number-asc
 * String- alpha
 * Stores elements
 * duplicates are not allowed
 * only one null value can be inserted
 * Homogeneous element are allowed
 * Heterogeneous elements are not supported in TreeSet
 * 
 * 
 * 
 * 
 *
 */

package Day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionDemo {

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * ArrayList al = new ArrayList(); al.add("A"); al.add(null); al.add("B");
	 * al.add("A"); al.add(null); al.add(10); System.out.println(al);
	 * 
	 * al.remove(2); al.remove("A"); System.out.println(al);
	 * 
	 * al.add(1, "C"); System.out.println(al); ArrayList<String> al1 = new
	 * ArrayList(); al1.add("X"); al1.add("Y");
	 * 
	 * /*
	 * 
	 * foreach for Iterator object ListIterator different ways to iterator in a
	 * collection Enumeration Interface - legacy class - Vector, stack & HashTable
	 * Enum - class -define constants
	 * 
	 * 
	 * 
	 * for(String str: al1) { System.out.print(str+ ""); }
	 * 
	 * //Iterator Iterator itr = al1.iterator();
	 * 
	 * while(itr.equals(itr.hasNext()){ System.out.print(itr.next() + " "); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * LinkedList l1 = new LinkedList(); l1.add("A"); l1.add("A"); l1.add("A");
	 * l1.add("A");
	 */

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push("A");
		s.push("A");// 3
		s.push("D");// 2
		s.push(null);// 1
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("A"));

	}
}