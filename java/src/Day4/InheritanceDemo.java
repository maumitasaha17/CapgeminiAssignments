package Day4;

/*
 * Class
 * Object
 * Inheritance
 * Polymorphism
 * Encapsulation
 * Abstraction
 * 
 * INHERITANCE - 
 * 
 * reuse code
 * 'extends' keyword
 * 
 * 
 * INHERITANCE TYPES
 * 1.	Single - Java
 * 2.	Multiple
 * 3.	Multilevel - Java
 * 4.	Hierarchical - Java
 * 5.	Hybrid
 * 
 * 
 * IS a inheritance
 * 
 * Animal - Dog - is a relationship
 * 			Cat 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student(101,"Raj", 24, 'M');
		Student student2 = new Student(102,"Rohan", 25, 'M');
	/*	
		System.out.println(student1.rollNo);
		System.out.println(student1.name);
		System.out.println(student1.gender);
		System.out.println(student1.age);
	*/
		System.out.println(student1); //pkgName.ClassName@hashcode
		System.out.println(student2); //pkgName.ClassName@hashcode
		
		Employee emp1 = new Employee(10001,"ravi", 'm', 22);
		Employee emp1 = new Employee(10001,"sam", 'm', 21);
		
		System.out.println(emp.1); //pkgName.ClassName@hashcode
		System.out.println(emp.2);
		
		Address addr1=new Address("123B", "4th Main Road");
		Address addr1=new Address("123B", "4th Main Road");
		
		student1.addr = addr1;
		emp2.addr=addr2;
		
		System.out.println();
		System.out
	}

}
