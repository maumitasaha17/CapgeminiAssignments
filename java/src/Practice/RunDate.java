package Practice;

import java.util.Date;

public class RunDate {

	public String myAddit(String greet, int additive, int art) {
		
	
	String myGreet = greet;
	int myintx = additive;
	int myinty = art;
	int sum = myintx + myinty;
	return myGreet+ ", the sum is:" +sum;
	
	public static void main(String[] args) {
		Date dt = new Date();
		
		RunDate rundt = new RunDate();
		String baseStr = rundt.myAddit("Welcome", 7,4);
		
		System.out.println("The date is " +dt+ "\n" +baseStr);
		
	}
	}

}
