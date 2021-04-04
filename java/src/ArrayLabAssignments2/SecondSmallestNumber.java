package ArrayLabAssignments2;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int temp;
		int size;
		int array[] = {100,3,10,7,8};
		size = array.length;
		
		for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
		if(array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
					
				}
			}
		}
				System.out.println("The Second Smallest Enumber is "+array[0]);
	
	}

}
