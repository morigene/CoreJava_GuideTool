package co.agrit.oop;

public class TestPolymorphism {

	public static void main(String[] args) {
	
	/*
		When you overload method is an example of compile time polymorphism buy
		
		when you override is an example of runtime polymorphism or dynamic Method dispatch.*/
		
		
		Bank eq = new Equity();  // example of runtime polymorphism.
		Bank bpr = new BPR();
		Bank bk  = new Bk();
		
		System.out.println( " Equity rate: "+eq.getInterestRate() + " BPR rate: "+bpr.getInterestRate() + " Bk: "+bk.getInterestRate());
	}
}
