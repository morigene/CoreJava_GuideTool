package co.agrit.io;


import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Writing to a file.
		PrintWriter writer = new PrintWriter("/home/morigene/Desktop/io/printwriter.txt");
		writer.write("MY God is hero");
		writer.flush();
		writer.close();
		
		//writing to console.
		PrintWriter console = new PrintWriter(System.out);
		console.write( "  Jesus is with us ");
		System.out.println( " ");
		console.write( " Hello, my mom and how are you today");
		console.flush();
		console.close();
	}

}
