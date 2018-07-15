package co.agrit.io;

import java.io.Console;

public class TestIoConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c = System.console();
		System.out.println(" Enter your name ");
		String n = c.readLine();
		System.out.println( "Welcome "+n);
		

	}

}
