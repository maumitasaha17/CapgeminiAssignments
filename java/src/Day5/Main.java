package Day5;

public class Main {

	public static void main(String[] args) {
		
	//	Parent p = new Parent(); //valid
		Parent p = new Child(); //upcasting
		System.out.println(p.getObj());
		System.out.println(p.getPerson()); //when ever your trying to print object then it will print the package name and then class n then hass code- pkg.class@hashcode
		//Day5.Person@5d22bbb7
		
		/*
		Child c = new Child(); // can access both parent and child class
		System.out.println(c.x); //10
		System.out.println(c.y); //20
		c.m2();//parent - m2 method
		c.m3();//child - m3 method
		
		System.out.println();
		Parent p = new Parent();
		System.out.println(p.x);
		p.m2(); //parent - m2 method
		p.m1(); //parent - m1 method
		
		System.out.println();
		//upcasting
		Parent p1 = new Child(); //upcasting/Overriding - object is child. parent is refernce
		//p1.m1(); //child - m1 method
		
		System.out.println(p1.x); //10
		p1.m1(); //child - m1 method - if there is no parent class then it will be parent m1 method
		p1.m2(); //parent - m2 method
		
	
		//downcasting
		Child c2 = (Child) new Parent(); //downcasting - convert parent object to child
		System.out.println(c.x); //10
		System.out.println(c.y); //20
		c.m2();//parent - m2 method
		c.m3();//child - m3 method
	
	*/
	
	
	
	}

}
