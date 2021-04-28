package Day11;
/*
 * 
 * :: operator introduced in java 1.8v
 * other name for :: is operator is scope resolution operator
 * 
 * whenever u want to use functional programing then u can use lambda expression or functional interface
 * 
 * 
 * 
 */

import Day10.Intf0;
import Day10.Intf01;
import Day10.RefDemo;
import Day10.Student;

@FunctionalInterface
interface Intf0 {
	int math(int x);
}

@FunctionalInterface
interface Intf01 {
	Student getStudent();
}

/*
 * Student getStudent(){ Student s = new Student(); return new Student(); }
 */

class Student {
	String name;

	// Consturctors
	Student() {
	}

	Student(String name) {
		this.name = name;
	}
}

public class RefDemo {
//once abstact is created u cant extent the class

	// Square of number
	public int m1(int x) {
		System.out.println("Inside m1 method");
		return x * x;
	}

	// static method - cube operation
	static int m2(int x) {
		System.out.println("Inside m2 method");
		return x * x * x;
	}

	public static void main(String[] args) {
		// find square of given number
		int y = 10;
		Intf0 i = x -> x * x;
		System.out.println(i.math(y));

		// instead of rewriting the same code again u can refer the existing function
		// use double operator::

		// Method Reference
		RefDemo rd = new RefDemo();
		Intf0 i1 = rd::m1;
		// Instance of the class::which method is represented
		System.out.println(i1.math(y));

		// Static method reference
		Intf0 i2 = RefDemo::m2;
		System.out.println(i2.math(20));

		// Constructor reference
		Intf01 i3 = () -> {
			return new Student();
		};
		// Intf01 i3=()-> new Student();
		System.out.println(i3.getStudent());

	}
}
