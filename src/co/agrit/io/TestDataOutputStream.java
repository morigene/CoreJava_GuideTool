package co.agrit.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataOutputStream output = new DataOutputStream(new FileOutputStream("/home/morigene/Desktop/io/file2.txt"));
		output.writeInt(65);
		output.flush();
		output.close();
		System.out.println( " The success ....");
		
		
		
		

	}

}
