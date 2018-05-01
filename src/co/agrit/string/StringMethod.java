package co.agrit.string;

public class StringMethod {
	
	
	// changing string to capital
	public static void upperCase() {
		
		String s = "origene";
		System.out.println( s.toUpperCase());
	}
	
	public static void lowerCase() {
		
		String s = "PAUL";
		System.out.println( s.toLowerCase());
	}
	
	// start with method
	public static void startWith() {
		
		String s = "origenE";
		System.out.println( s.startsWith("O"));
		System.out.println( s.endsWith("e"));
	}
	
	//position of character and length  of string.
	public static void charAt() {
		
		String s = "sachin";
		System.out.println( s.charAt( 3 ));
		// length of string
		System.out.println( s.length());
		
	}
	
	public static void getChar() {
		
		String getChar = " Welcome to javatpoint.com";
		char [] ch = new char[10];
		getChar.getChars(6, 16, ch, 0);
		System.out.println( ch );
	}

}
