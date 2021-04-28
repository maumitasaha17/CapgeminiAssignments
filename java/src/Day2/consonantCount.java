package Day2;

public class consonantCount {

	int getCount(char[] arr) {
		int ovalCount = 0;
		int Count = 0;
		for (char c : arr) {

			switch (c) {
			case 'a':
				ovalCount += 1;
				break;
			case 'e':
				ovalCount += 1;
				break;
			case 'i':
				ovalCount += 1;
				break;
			case 'o':
				ovalCount += 1;
				break;
			case 'u':
				ovalCount += 1;
				break;
			default:
				Count += 1;
				break;
			}
		}
		return Count;

	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'e', 'i', 'b', 'i', 'o', 'u', 'x', 'y' };
		consonantCount fd = new consonantCount();
		System.out.println("Consonant Count: " + fd.getCount(arr));

	}

}
