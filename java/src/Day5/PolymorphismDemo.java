package Day5;

/*
 * Polymorphism: One action performed in different ways
 *  many forms
 *  + - numbers - addition
 *  + - string - concats
 *  
 * Compile time polymorphism/static/early binding
 * 		
 * 		1.Operator overloading - Java wont support
 * 		
 * 		2.Method Overloading - improves readability
 * 				method name will be same
 * 				number of args will be different
 *				type of args will be different
 * 				order of args should be differ
 * 				return type can be anything
 * 				ex:
 * 					int add(int x, int y) {}
 * 					float add(float x, float y){}
 * 					int add(int i, int y){} // cant declare one more int type if you have already used int type once. it will be invalid
 * 					double add(float x, int y){}
 * 					int add(int y, float y){}
 * 					float add(float x, float y, float z){}
 * 
 * 					add(10,20); //line 20
 * 					add(10, 10.05f); //line 24
 * 					add(10f, 20f, 20f); //line 25
 * 		3.Constructor Overloading -
 * 				Employee() {//logic}
 * 				Employee(int empID, String name){}
 * 				Employee(int empID, String name, String dept){}
 * 				Employee(Person p);
 *  			
 *  			Employee emp1 = new Employee();
 *  			Person p = new Person();
 *  			Employee emp2 = new Employee(new Person(101, "Ram"));
 *  			Employee emp2 = new Employee(101, "Sam")); //line 32
 *  			Employee emp2 = new Employee(101, "Sam", "IT")); // line 33
 *  
 *  
 *  	4.Runtime polymorphism/dynamic/late binding
 * 				-Method overriding
 * 					parent class method will be override by child class
 * 				- Upcasting - parent class reference pointing to child class reference
 * 					
 * 					Parent p = new Child(); // valid condition, parent can hold the child class. this is an example of upcasting
 * 					
 * 					class Parent{	
 * 						void m1() {sop("parent");}
 * 					} 
 * 					class child extends Parent{
 * 						void m1() {sop("child");}
 * 					} 
 * 					class Main{
 * 					public static void main(String[] args) {
 * 						Parent p = new Child();
 * 						p.m1(); //output is child
 * 					}
 * 					}
 * 					// if there is no parent class then there will be compilation error
 * 					// if there is no child class then the output will be parent class
 * 
 * 
 * 
 * 						- compile time - compiler checks for method in parent will override the child class
 * 						- run time - JVM will call method defined in child class
 * 						- no method in child class - JVM will call parent method
 * 
 * 					Parent p = new Parent();
 * 						using c - can access only parent class variable/method
 * 					
 * 					Child c = new Child();
 * 						using c - can access parent properties as well as child class properties
 * 					
 * 					Child c = new Parent();	//Invalid condition, child cannot hold the parent class. type casting required
 * 		
 * Rules to achieve over riding:
 * 1. method name should be same
 * 2. input args - type,order,number of arguments should be same
 * 3. return type - should be same until java 1.4v . From 1.5version return type can be co-variant type
 * 
 * ex:		class Parent{
 * 				Object m1(){}
 * 				String m1=2(){} //invalid
 * 				Person m3(String name, int age){//logic}
 * 
 * 				Number m4() {}
 * 				
 * 				double m5(){} // invalid
 * 			}
 * 			
 * 			//Co-variant type
 * 			class Child{
 * 				String m1(){}
 * 				StringBuffer m1(){}
 * 				Employee m1(){}
 * 				
 * 				Object m2() {} //invalid
 * 
 * 				Employee m3(String name, int age){} // Valid employee is child of a parent type
 * 
 * 				Number - Integer, Double, Float...
 * 				Integer m4(){}
 * 				
 * 				float m5(){} //invalid
 * 			} 
 * 		
 * 4. Static - overriding concept wont work
 * 5. final - overriding concept wont work
 * 
 * 
 * 
 * 
 */

public class PolymorphismDemo {

	public static void main(String[] args) {

	}

}
