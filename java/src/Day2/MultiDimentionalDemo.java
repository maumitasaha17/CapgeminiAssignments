package Day2;

import java.util.Scanner;

public class MultiDimentionalDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = scanner.next();
		System.out.println(name);
		System.out.println("Enter any number ");
		int num = scanner.nextInt();
		System.out.println(num);
		System.out.println("Enter size of an array ");
		int[] y = new int(size);
		System.out.println("Enter array element");
		for(int i = 0; i<y.length; i++) {
			y[i] = scanner.nextInt();
			
		}
		
	}
}
		
		
		
		
		/*int[][] intArr = new int[2][3];
		int[][] intArr1 = {{1,2,3},{4,5,6},{7,8,9}}; //3x3

		for(int i = 0; i<intArr1.length; i++) {; //{1,2,3}
			for(int j = 0; j<intArr1[i].length; j++) {
				System.out.println(intArr1[i][j] +" ");
				//intArr1[0][0] - 1
				//intArr1[0][1] - 2
				//intArr1[0][2] - 3
				//intArr1[1][0] - 4
				//intArr1[1][1] - 5
				//intArr1[1][2] - 6
				//intArr1[2][0] - 7
				//intArr1[2][1] - 8
				//intArr1[2][2] - 9
			}
		}
	}
}*/
