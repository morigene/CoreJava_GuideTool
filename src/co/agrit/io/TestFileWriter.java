package co.agrit.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("/home/morigene/Desktop/io/fw.txt");
		fw.write( " Welcome my dear friends ");
		System.out.println( " Success ....");
		
	}

}
