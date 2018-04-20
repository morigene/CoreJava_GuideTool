package co.agrit.oop;

public class TestRecursion {
	
	static int count = 0 ;

	public static void main(String[] args) {
		
		
		// p(); infinite recursion.
		
		greetMsg();
		
		// Example 3 
		
		System.out.println("The factorial:"+factorial(5));

	}
	
	// Infinite recursion 
	
	/*static void p() {
		
		System.out.println( " Hello");
		p();
	}*/
	
	// finite recursion.
	
	static void greetMsg() {
		
		count++;
		if(count  <= 5 ) {
			System.out.println( " Hello "+count);
			greetMsg();
		}
		
		
	}
	
	static int factorial(int n) {
		
		if (n == 1)
			return 1;
		else
			return (n * factorial(n-1));
	}
	

}
