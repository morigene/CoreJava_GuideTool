package co.agrit.exceptionHandling;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println( "welcome to learing exception handling");

	 ExceptionBlock.tryandCatch();
	 
	System.out.println( "\n The rest of code for exception 1");
	System.out.println(  " The overloading method for try and catch");
	int divide = ExceptionBlock.tryandCatch(50);
	System.out.println( divide );

	}

}
