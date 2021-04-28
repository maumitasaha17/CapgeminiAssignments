package MultiThreadingLabAssignment8;

public class FileProgram {

	public static void main(String[] args) {
		String inputpath = "C:\\Users\\MAUMITA\\Desktop\\CAPGEMINI DOCUMENTS\\Source.txt";
		String outputpath = "C:\\Users\\MAUMITA\\Desktop\\CAPGEMINI DOCUMENTS\\Target.txt";
		CopyDataThread c = new CopyDataThread(inputpath, outputpath);
		c.start();
	}

}
