package LambdaExpressionsAndStreamAPILabAssignments9;

public interface Password3 {
	boolean checkIdentity(String username, String password);
}

public class boolean3 {

	public static void main(String[] args) {

		String name = "Ramesh";
		String pass = "ramYAD";
		Password3 p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Ramesh", "ramYAD"));
	}
}
