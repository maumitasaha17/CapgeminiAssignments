package ArrayLabAssignments2;

public class reverseOrder {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 27, 30, 45, 73 };
		System.out.println("Print Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Array in reverse order: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");

		}
	}
}
