package Day5;

public class Parent {
	
	int x =10;
	
	void m1() {
		System.out.println("Parent - m1 method");
	};
	
	Person getPerson() {
		Person p = new Person();
		return p;
	}
	
	Object getObj() {
		Object obj = new Objecdt();
		return obj;
	}
	//if the declaring  final as method the child has to obey the parent
	// if class is declared final in the parent class then it cant be inhereted to child class
	//whenever a class is having abstract method then there isnt any implementation happening. 
	
	void m2() {
		System.out.println("Parent - m2 method");
	}
	
	void m3() {
		System.out.println("Parent - m3 method");
	}	

}
