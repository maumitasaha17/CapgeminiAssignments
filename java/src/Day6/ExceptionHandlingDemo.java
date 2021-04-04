package Day6;

/*
 * compile time exception
 * runtime exception
 * 
 * exceptions can be handled 
 * errors cant be handles
 * 
 * exception arise - compile time/runtime
 * errors - runtime
 * 
 * exception can be considered as an object
 * 
 * 
 * Throwable parent class - exception
 * SQLEXCP
 * IOEXCEP
 * RUNTIMEEXCEP / unchecked Excep
 * CLASSNOTFOUNDEXCEP
 * ARITHMETICEXCEP
 * ILLEGALARGUMENTEXCEP
 * 
 * 
 * 	Throwable parent class- Error
 * -outOfMemoryError
 * VirtualMachineError
 * LinkageErrors
 * 
 * 
 * ways to handle exceptions
 * 1. try-catch
 * 2.throws
 * 
 * throw - throw an exception
 * finally - will be executed always
 * 
 * 
 * 
 * 
 * 
 */

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
		
		System.out.println(10/2); // ArithmaticException
		int[] x = new int[3];
		System.out.print(x[3]); // ArrayIndexOutOfBoundsException
		String str = new String("Hello");
		System.out.println(str.charAt(5)); // StringIndexOutOfBoundException
		//System.out.println(str.charAt(0)); //0
		
		Integer i = new Integer("abc"); // NumberFormatException
		System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("Outside of try block");
		
			/*e.getMessage();
		e.getStackTrace();
			System.out.println(e);
			
		
		
		
		 * try{
		 * 
		 * FileInputStream fis = new FileInputStream("temp.text"); } catch
		 * (FileNotFoundException e){ e.printStackTrace();
		 * 
		 * 
		 * try -invalid
		 * try-catch
		 * try-finally
		 * try-catch-finally
		 * try-catch-catch-catch
		 * try-catch-catch-finally
		 * multi catch block
		 * nested try catch
		 * 
		 * 
		 * 
		 * 
		 */
	
		//finally-close connection/closing files
		
		
		//nested
		try {
			System.out.println(10/2); //5
			int [] x = new int[3];
			System.out.println(x[1]); //0
			String str = new String("World");
			System.out.println(str.charAt(6))); // StringIndexOutOfIndex
			
			try {
				String str1 = new String("Hello");
				System.out.println(str.charAt(5));
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Outside finally block");
	
	
	
	
	}

}
