package co.agrit.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileOutputStream f1 = new FileOutputStream("/home/morigene/Desktop/io/f.txt");
		FileOutputStream f2 = new FileOutputStream("/home/morigene/Desktop/io/f2.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(90);
		bout.writeTo(f1);
		bout.writeTo(f2);
		
		bout.flush();
		bout.close();
		
		System.out.println(" The success ... ");
		
		
		
		
	}

}
