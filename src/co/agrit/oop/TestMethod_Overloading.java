package co.agrit.oop;

public class TestMethod_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. 
		
		Advantage of method overloading

		Method overloading increases the readability of the program.
		Different ways to overload the method

		There are two ways to overload the method in java

		   1. By changing number of arguments
		   2. By changing the data type
		    
		    
*/
		
		System.out.println( " Method of adding two number ");
		int sum1 = Adder.add(10, 20);
		System.out.println( sum1 );
		System.out.println( " Method overloading: This is the same method but it is  adding 3 number , means they increase number of arguments");
		int sum2 = Adder.add(12, 21, 33);
		System.out.println( sum2 );
		
		
		
	   
		

	}

}
