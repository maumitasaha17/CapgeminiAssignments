package Day2;

public class Sum {

	public static void main(String[] args) {
		int[] arr = new int [] {1,2,3,4};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
			System.out.println("sum of all the numbers= "+sum);
	}

}
