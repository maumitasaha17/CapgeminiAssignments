package Day5;

/*
 * ABSTRACTION - adding implementation 
 * abstract class 
 * interface
 * 
 * 
 * 
 * abstract class
 * abstract
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class AbstractionDemo {

	public static void main(String[] args) {

		IProduct p1 = new ProductImpl(); // tightly coupling
		p1.getProduct();
		p1.deleteProduct();
		p1.viewAllProduct();

		IProduct p1 = new ProductImpl2(); // runtime polymorphism , loosly coupled
		p1.getProduct();
		p1.deleteProduct();
		p1.viewAllProduct();
		p1.updateProduct();

		IProduct.m2();
		p1.m1();

		/*
		 * easy to test
		 * 
		 * IE ie = new IE();//loosly coupled - easy to test ie.m1 ie.m2
		 * 
		 * Chrome chrome = new Chrome();//tightly coupled ch.x1 ch.x2 Intf intf = new
		 * IF()
		 * 
		 * intf.m1(); open intf.m2(); enter url
		 * 
		 * IE, Firefox, Chrome open browser - m1, x1, enter url- m2, x2 fill form- m3,
		 * x3 submit
		 */

		/*
		 * B b = new B(); b.m1(); b.m2();
		 * 
		 * 
		 * C c = new C(); c.m1(); //A - m1 method c.m3(); //B - m3 method c.m2(); //C -
		 * m2 method c.m4(); //C - m4 method
		 */

	}

}
