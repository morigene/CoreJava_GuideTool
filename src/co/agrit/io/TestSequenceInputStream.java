package co.agrit.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestSequenceInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	@SuppressWarnings("resource")
	SequenceInputStream  sin = new SequenceInputStream(new FileInputStream("/home/morigene/Desktop/io/buffer.txt"),new FileInputStream("/home/morigene/Desktop/io/write.txt"));
	int j = 0;
	while((j = sin.read())  != -1) {
		
		System.out.print( (char)j);
		
	}
	sin.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
