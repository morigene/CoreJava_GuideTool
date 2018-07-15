package co.agrit.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("/home/morigene/Desktop/io/buffer.txt"));
			int i = 0;
			while( (i = bin.read()) != -1 ) {
				
				System.out.print( (char)i);
				
			}
		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}

}
