package Day4;

public class Student extends Person {

	int rollNo;

	// cONSTRUCTORS
	Student() {
	};

	Student(int rollNo) {
		this.rollNo = rollNo;
	}

	Student(int rollNo, String name, int age, char gender) {
		super(name, gender, age);
		this.rollNo = rollNo;
	}

	public String toString() {
		return ""+rollNo.;
	}

}
