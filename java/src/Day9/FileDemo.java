package Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File.text - read -> java app - wirte -> file.text
 * 				channel				channel
 * 
 * Channels- Byte Stream - byte oriented data(8bit)
 * 			- char Stream - Char oriented data(16bit)
 * 
 * Byte Stream Channels
 * FileInputStream - read
 * FileOutputStream - write
 * 
 * Char Streams
 * FileReader - read
 * FileWriter -write
 * 
 * Line
 * BufferedInputStream - Reaf
 * BufferedOutputStream - Write
 * BufferedReader - read line by line
 * BufferedWriter - write line by line
 * 
 * 
 * 
 * 
 * 
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("source.txt"); // byte stram channel
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			FileOutputStream fos = new FileOutputStream("target.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
	int num;
	while(( num = fis.read())!=-1) {
		fos.write(num);
	}
			fis.read();
	
	}
}
