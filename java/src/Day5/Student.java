package Day5;

public class Student extends Person{
	
	private int rollNo;
	
	Student(int rollNo, String name, int age){
		super(name, age);
		this.rollNo = rollNo;
		
	}
//getters & setters should be public type
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
