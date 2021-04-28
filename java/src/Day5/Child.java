package Day5;

public class Child extends Parent {
	int y = 20;

	void m1() {
		System.out.println("Child-m1 method");
	};

	void m3() {
		System.out.println("Child- m3 method");
	}

	Employee getPerson() {
		Employee emp = new Employee();
		return emp;
	}

	@Override
	String getObj() {
		String str = new String("Hello");
		return str;

	}

}
