package Practice;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfProducts = sc.nextInt();
		String products[] = new String[noOfProducts];
		for (int i = 0; i < noOfProducts; i++) {
			products[i] = sc.next();
		}
		sc.close();
		Discounts ds = new Discounts();
		ds.productDiscount(products);
	}

}
