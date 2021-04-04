package Day5;

/*
 * CLASS
 * OBJECT
 * INHERITANCE
 * SINGLE, MULTILEVEL & HIRARCHICAL
 * POLYMORPHISM
 * GETTERS & SETTERS - TO ALLOW OTHERS TO ACCESS DATA
 * COMPILE TIME POLYMORPHISM
 * 		-OPERATOR OVERLOADING
 * 		-CONSTRUCTOR OVERLOADING
 * 		-METHOD OVERLOADING 
 * 
 * RUNTIME POLYMORPHISM
 * 		-OVERRIDING
 * 
 * ENCAPSULATION - IF YOU WANT TO PROTECT YOUR DATA
 *     - GROUPING YOUR METHODS
 *     - DOESNT ALLOW OTHER USERS TO ACCESS YOUR DATA
 * 		-PRIVATE
 * 		-SECURITY
 * 		-RESTRICTED
 * 
 * ABSTRACTION
 * 
 * 
 * 
 * 
 * 
 */




public class EncapsulationDemo {

	public static void main(String[] args) {
		Student std = new Student(101, "ram", 15);
		
		System.out.println(std.getRollNo());
		std.setRollNo(102);
		System.out.println(std.getRollNo());
		
		
		
	}

}
