package CollectionFrameworkLabAssignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort {

	
	public static void main(String[] args) {
	//creating a list 
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(50);
		a.add(30);
		a.add(10);
		a.add(40);
		a.add(60);
		
		Collections.sort(a, Collections.reverseOrder());
		
		System.out.println("Array List: "+a);
	
	}

}
