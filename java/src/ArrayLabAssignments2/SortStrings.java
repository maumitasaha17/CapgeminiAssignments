package ArrayLabAssignments2;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {

		String[] fruits = { "Orange", "Grapes", "Apple", "Banana", "Mango" };
		int size = fruits.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < fruits.length; j++) {

				if (fruits[i].compareTo(fruits[j]) > 0) {

					String temp = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(fruits));

	}

}
