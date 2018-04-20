package co.agrit.oop;

public class TestMethod_Overriding {

	public static void main(String[] args) {
		
		
		/*Method Overriding in Java
		If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.

		In other words, If subclass provides the specific implementation of the method that has been provided by one of its parent class, it is known as method overriding
*/
		
		Bike bike = new Bike();
		bike.run();
		
		// Real Example of Method overriding
		Equity eq = new Equity();
		BPR bpr   = new BPR();
		Bk bk     = new Bk();
		
		System.out.println( " Equity Rate is "+eq.getInterestRate() + " Bpr Rate: "+bpr.getInterestRate() + " Bk Rate: "+bk.getInterestRate());
		
	}

}
