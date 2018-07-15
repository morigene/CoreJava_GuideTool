package co.agrit.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TestOuputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			String str = "";
			byte[] br = null;
			FileOutputStream	output= new FileOutputStream("/home/morigene/Desktop/io/write.txt");
			Scanner input = new Scanner(System.in);
			
		      while(!str.equals("bye")) {
		    	  System.out.println( "What do you want to enter ");
		    	  str = input.nextLine();
		    	  br = str.getBytes();
		    	  output.write(br);
		      }
		      
		      output.close();
		      System.out.println("Success ...... end......");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
