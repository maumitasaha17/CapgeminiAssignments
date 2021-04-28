package Day5;

import java.util.List;

/*
 * interface naming convention starts with I
 * to create a class - class is interface
 * 
 * there wont be any concreet methods
 * everything will be abstract
 * 
 * 
 */
public interface IProduct {

	int x = 100; // public, static, final

	Product getProduct();

	Product updateProduct();

	Product deleteProduct();

	List[] viewAllProduct();

	Product viewProductByName();

	// default & static method
	default void m1() {
		System.out.println("IProduct - m1 method");
	}

	default void m2() {
		System.out.println("IProduct - m2 method");
	}

}
