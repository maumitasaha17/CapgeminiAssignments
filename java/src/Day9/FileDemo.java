package Day9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
 * BufferedInputStream - Read
 * BufferedOutputStream - Write
 * BufferedReader - read line by line //readline()
 * BufferedWriter - write line by line // writeline()
 * 
 * 
 * 
 * 
 * 
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\MAUMITA\\OneDrive\\wiki.txt"); // byte stream channel
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MAUMITA\\OneDrive\\wiki.txt");

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int num;
		while ((num = bis.read()) != -1) {
			System.out.println((char) num);

			bos.write(num);
		}
		if (bos != null) {
			bos.close();

		}
		if (bis != null) {
			bis.close();
		}
		if (fos != null) {
			fos.close();
		}
		if (fis != null) {
			fis.close();
		}

	}
}