package co.agrit.io;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("/home/morigene/Desktop/io/buffer.txt");
        int i = 0;
		 while( (i = reader.read()) != -1) {
			 
			 System.out.print( (char)i);
		 }
		 
		 reader.close();

	}

}
