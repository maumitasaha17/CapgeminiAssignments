package ArrayLabAssignments2;

public class RemoveDuplicates {

	public static int removeDuplicate(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
		if (arr[i] != arr[i + 1]) {
			temp[j++] = arr[i];
			}
		}
			temp[j++] = arr[n - 1];
		// changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 10, 10, 15, 20, 15, 30, 50, 90, 90, 100 };
		int length = arr.length;
		length = removeDuplicate(arr, length);

		// printing array
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

		// Sort array in descending order

			System.out.println();

			System.out.println("Array in Decending order: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
