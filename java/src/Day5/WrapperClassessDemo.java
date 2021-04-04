package Day5;

/*
 * Wrapper classes - convert primitive data type to object type
 * cloning, 
 * serialization - copy obj to file n transfer to transfer machine
 * deserialization - reading the object into file 
 * Collections -
 * 
 *  wrapper classes
 *  byte	- Byte
 *  short	- Short
 *  int		- Integer
 *  long	- Long
 *  float	- Float
 *  double	- Double
 *  char	- Character
 *  boolean	- Boolean
 * 
 * java.lang - pkg
 * 
 * primitive to object
 * 1. constructor
 * 2. valueOf()
 * 
 * Object to primitive
 * xxxValue() - intValue(), doubleValue(), floatValue()
 * 
 * Wrapper Obj to string
 * toString()
 * 
 * primitive to string
 * String.valueOf()
 * 
 * string to primitive
 * Integer.parseInt();
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class WrapperClassessDemo {

	public static void main(String[] args) {
		int i = 10; //convert primitive to object
		Integer i1 = new Integer(i);
		Integer i2 = new Integer("10");
		
		//System.out.println(i.getClass().getName()); - runtime error
		System.out.println(i1.getClass().getName());
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i2.getClass().getName());
	
		float f = 10.0f;
		Float f1 = new Float(f);
		System.out.println(f1.getClass().getName());
		System.out.println(f1);

		Float f2 = new Float("10.6f");
		System.out.println(f2.getClass().getName());
		System.out.println(f2);
		
		
		Float f3 = Float.valueOf(10.05f);
		//System.out.println(f3.getClass().getName());

		Character ch = Character.valueOf('a');
		//System.out.println(ch.getClass().getName());
	
		Integer x = 10; // auto boxing - converting primitive to object to
		System.out.println(x.getClass().getName());
		
		//Wrapper Object to primitive data type
		// xxxValue()
		
		int y = i1.intValue();
		float z = f1.floatValue();
		
		System.out.println(y);
		System.out.println(z);
		
		
		//auto unboxing
		int j = i2; //i2 is wrapper object. so automatically it will convert wrapper object to primitive
		System.out.println(j);
		
		
		//Wrapper object to string
		String str1 = i1.toString();
		String str2 = i1.toString(); 
		
		System.out.println(str1+str2); //1010
		
		//primitive to string
		int k = 10;
		String str = String.valueOf(k);
		System.out.println(str.getClass().getName()); //string
		
		
		//string to primitive
		
		String str3 = "10";
		int m = Integer.parseInt(str3); // parse - method converts sting to integer
		System.out.println(m);
		System.out.println(str3.getClass().getName()); //string
		
		
		
		
		
		
		
	}

}
