package co.agrit.io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class TestBufferedOutputStream {
	
	public static void main(String[]args) {
		
		try {
			String s= "Welcome to Rwanda Revenue";
			FileOutputStream output = new FileOutputStream("/home/morigene/Desktop/io/buffer.txt");
			BufferedOutputStream bout = new BufferedOutputStream(output);
		   // or BufferedOutputStream bo  = new BufferedOutputStream(new FileOutputStream("/home/morigene/Desktop/io/buffer.txt");
			byte[]br = s.getBytes();
			output.write(br);
			output.close();
			
			System.out.println( "Success .....");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
