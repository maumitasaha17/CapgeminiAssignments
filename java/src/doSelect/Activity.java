package doSelect;

public class Activity {

	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

}

class Source {

	public Source() {

	}

	public String handleException(Activity a) throws Exception {
		try {
			if (a.string1 == null || a.string2 == null)
				;

		} catch (NullPointerException e) {
			System.out.println("Null values found");
		}

		if (a.operator != "+" && a.operator != "-") {
			throw new Exception(a.operator);
		} else
			return "No exception found";
	}

	public String doOperation(Activity a) {
		String str = "";
		switch (a.operator)

		{

		case "+":
			str = a.string1.concat(a.string2);
			break;
		case "-":
			str = a.string1.replace(a.string2, "");
			str = str.trim();
			break;
		}
		return str;
	}

	public static void main(String[] args) throws Exception {
		Activity a = new Activity("HelloWorld", "World", "+");
		Source s = new Source();
		System.out.println(s.handleException(a));
		System.out.println(s.doOperation(a));

	}

}
