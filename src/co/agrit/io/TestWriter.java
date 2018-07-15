package co.agrit.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Writer wr = new FileWriter("/home/morigene/Desktop/io/output.txt");
		String content = " I love my country";
		wr.write(content);
		wr.close();
		System.out.println( " Done ");
	
		

	}

}
