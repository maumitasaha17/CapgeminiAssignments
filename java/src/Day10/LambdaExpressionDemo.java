package Day10;
/*
 * 
 * Lambda Expression
 * 
 * java 8 features
 * ------------------------------------
 * Lambda Expresion - used to simplify the program
 * important interview question functions of lambda expression
 * Functional Interface - should have only one abstract method
 * Comparable - compareTo()
 * Interface
 * 	java 1.7 - 100% abstract
 * Stream API
 * :: operator
 * 
 * 
 * java - Object Oriented Programming
 * Functional programming 
 * 
 * int add(int x, int y){
 * return x+y;
 * }
 * add(10,30);
 * 
 * class Test{
 * int add(int x, int y){
 * return x+y;
 * }
 * 
 * public static void main(string[] args){
 * Test t = new. Test();
 * System.out.println(t.add(10,20));
 * }
 * }
 * 
 * 
 * ()-> System.out.println("msg"); //valid
 * msg-> System.out.println("msg"); //valid
 * x -> x*x; //valid
 * x -> return x*x; //invalid
 * x -> :return x*x;}; //valid
 * x,y-> System.out.println(x+y); // invalid, paraenthesis for input args
 * (x,y)-> System.out.println(x+y); // valid
 * (num) ->{ return num%2==0?true:false;};//invalid barckets bare not required
 * num ->{ return num%2==0?true:false;}; //valid 
 *  num ->{ if(num%2==0) {
				return true;
			}else {
				return false;}; //valid 
 * 
 * 
 * 
 * 
 * 
 */

//Functional Interface
@FunctionalInterface
interface Intf {
	int add(int x, int y); // add with two arguments with data type

}

//to include another interface such as substract
@FunctionalInterface
interface Intf1 {
	int sub(int x, int y);
}

@FunctionalInterface
interface Intf2 {
	int sqr(int x); // square this method can be also used for cube operation
	// int m2(int x); //cube
}

@FunctionalInterface
interface Intf3 {
	void greet(String msg);
}

@FunctionalInterface
interface Intf4 {
	void m1();
}

@FunctionalInterface
interface Intf5 {
	boolean m4(int num);
}

public class LambdaExpressionDemo {

	/*
	 * //in JAva we need to define data type int add(int x, int y){ return x+y; //30
	 * output } // LambdaExpression //no name, no return type, no data type // (x,y)
	 * -> {return x+y;} //name less method or anonymous function
	 * 
	 */
	Intf add = (x, y) -> {
		return x + y;
	};
	Intf1 sub = (x, y) -> {
		return x - y;
	};
	Intf2 sqr = (x) -> {
		return x * x;
	};

	void greet(String msg) {
		System.out.println(msg);
	}
	// (msg)-> {System.out.println(msg);};
	// (msg)-> System.out.println(msg);

	void m1() {
		System.out.println("m1 method");
	}

	int m2(int x) {
		return x * x * x;
	}
	// x->x*x*x

	// even or odd
	boolean m4(int num) { // true or false
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		/*
		 * //without lambda Expression LambdaExpressionDemo demo = new
		 * LambdaExpressionDemo(); System.out.println(demo.add(10,20));
		 */

		// with lambda Expression
		Intf i = (x, y) -> {
			return x + y;
		}; // (x,y) should match with interface
		System.out.println(i.add(10, 20));

		Intf1 i1 = (x, y) -> {
			return x - y;
		}; // (x,y) should match with interface
		System.out.println(i1.sub(10, 20));

		Intf2 i2 = (x) -> {
			return x * x;
		}; // (x,y) should match with interface
		System.out.println(i2.sqr(10));

		Intf3 s = (msg) -> {
			System.out.println(msg);
		};
		s.greet("Hello");

		// one argument parenthasis are not required
		// no return type
		// no data type
		// one statement in body and no return keyword - {} not required
		Intf3 s1 = (msg) -> System.out.println(msg);
		s1.greet("World");

		Intf2 i4 = (x) -> x * x * x;
		System.out.println(i4.sqr(10));

		Intf5 isEven = num -> {
			return num % 2 == 0 ? true : false;
		};
		/*
		 * {if(num%2==0) { return true; }else { return false;};
		 */
		System.out.println(isEven.m4(10));
		System.out.println(isEven.m4(7));

	}

}
