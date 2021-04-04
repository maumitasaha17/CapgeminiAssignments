package Day2;

public class ArrayDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1001, "Sonu");
		Employee emp2 = new Employee(1002, "Ram");
		Employee emp3 = new Employee(1003, "Sita");
		
		Employee[] empArr = new Employee[5];
		
		Student std1 = new Student(100, "Ravi");
		Student std2 = new Student(101, "kavi");
		Student std3 = new Student(102, "kavitha");
		
		Object[] objArr = new Object[7];
		objArr[0] = emp1;
		objArr[1] = emp2;
		objArr[2] = emp3;
		objArr[3] = std1;
		objArr[4] = std2;
		objArr[5] = std3;
		
		/*Type Casting
		 *  1. Upcasting - lower to higher (automatic)
		 *  	byte -> short -> long/float/double	
		 *  	int-long
		 *  	int-double
		 *  	int-float
		 *  	byte-int
		 *  	short-int
		 *  
		 *  	
		 *  2. Downcasting - higher to lower (convertion)
		 *		long-int
		 *		double-int
		 *		int-byte
		 *		float-int-10.34f-10
		 *	-loose the information
		 *eg: int j=10;
		 *  long 11=j;
		 *		System.out.println(j);
		 *		System.out.println(11);
		 *eg.float f=10.50f;
		 *		int y = (int)f;
		 *		System.out.println(y);
		 *		System.out.println(f)
		 *
		 */
		
		//Object is parent
		
		for(Object obj : objArr) {
			//System.out.println(obj); //hashcode
			if(obj instanceof Employee) {	
		//Converting one type of data to another type is call typecasting
				Employee emp =(Employee)obj;
					System.out.print(emp.empId+" ");
					System.out.print(emp.empName);
					System.out.println();
				} else if (obj instanceof Student){
					Student std = (Student)obj;
					System.out.println(std.rollNo + " ");
					System.out.println(std.Name); 
					System.out.println();
				} else {
					System.out.println(obj);//result- length of array will be 7 Employee ID + name & Student rollno + name. and empty strings will be null
				}
				
				
				}
		}
		/*int[] x = new int[5];
		 x[0]=10;
		 x[1]=20;
		 x[2]=30 */
		
		
		//Initialization
		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3;
		
		
		//Iterating through an array
		for(Employee emp:empArr) {
			//System.out.println(emp);
			
			if(emp instanceof Employee) {
				System.out.println(emp.empId+" ");
				System.out.println(emp.empName);
				System.out.println();
				// continue; to only get null values comment out 29,30,31 and place continue; after instance of
			} else { //for null strings 
				System.out.println(emp); 
			}
		}
	
		/*
		for(int i = 0; i<empArr.length; i++) {
			if(empArr[i] instanceof Employee) {
				continue;
			} else {
				System.out.println(i);
			}
		}
		*/
		
	}
		
}
