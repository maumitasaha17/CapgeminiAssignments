package LambdaExpressionsAndStreamAPILabAssignments9;

@FunctionalInterface
interface Intf {
	int a(int x, int y);
}

public class Number1 {

	Intf a = (x, y) -> {
		return x * y;
	};

	public static void main(String[] args) {
		Intf i = (x, y) -> {
			return x * y;
		};
		System.out.println(i.a(10, 20));

	}

}
