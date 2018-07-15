package co.agrit.io;

import java.io.ByteArrayInputStream;

public class TestByteArrayInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] buf = {29,20,10,3};
		// Create new byte array input stream.
	
		ByteArrayInputStream b = new ByteArrayInputStream(buf);
		int k = 0;
		while( (k = b.read()) != -1 ) {
			
			char ch = (char)k;
			System.out.print(ch);
		}

	}

}
