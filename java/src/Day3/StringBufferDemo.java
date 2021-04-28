package Day3;

/* String - immutable
 * StringBuffer - mutable
 * StringBuilder - mutable
 * javap.java.lang.Object in comment promt
 * javap.java.lang.StringBuffer in compt
 * String is a child for Object class
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello ");

		System.out.println(sb1);// Hello
		sb1.append("World");
		System.out.println(sb1);// Hello World
		/*
		 * //equals() & == StringBuffer sb2 = new StringBuffer("Hello ");
		 * 
		 * System.out.println(sb1.equals(sb2));//false
		 * System.out.println(sb1==sb2);//ref, false
		 * 
		 */
		StringBuffer sb2 = new StringBuffer("Hello ");
		StringBuffer sb3 = sb2;
		System.out.println(sb2.equals(sb3));// ref, true
		System.out.println(sb2 == sb3);// ref, true

		// Capacity
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity()); // 16
		sb4.append("hello");
		System.out.println(sb4.capacity());

		System.out.println();
		sb4.ensureCapacity(20); // oldCapacity*2+2
		System.out.println(sb4.capacity()); // 34

		StringBuffer sb5 = new StringBuffer("abc");
		System.out.println(sb5.capacity()); // 16+3
		sb5.ensureCapacity(30); // oldCapacity*2+2
		System.out.println(sb5.capacity()); // 40
		System.out.println();
		// String Builder

		StringBuilder sbl = new StringBuilder();
		System.out.println(sb1.capacity());// 22
		StringBuilder sbl2 = new StringBuilder();
		System.out.println(sb2.capacity()); // 19
		sbl2.ensureCapacity(30);
		System.out.println(sb2.capacity()); // 40

	}

}
