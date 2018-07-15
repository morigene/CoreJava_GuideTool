/**
 * 
 */
package co.agrit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author root
 *
 */
public class TestReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// read a single character
		System.out.println( " Read a single character. ");
		int i = 0;
		FileInputStream fn = null;
	     try {
			 fn = new FileInputStream("/home/morigene/Desktop/io/write.txt");
			 i= fn.read();
			System.out.println((char)i);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     System.out.println( " Read all characters. \n");
	     
	     
	     try {
	    	 i = 0;
			while((i=fn.read()) !=-1) {
				 
				 System.out.print( (char)i);
			 }
			
			fn.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
