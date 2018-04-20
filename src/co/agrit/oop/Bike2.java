package co.agrit.oop;

public abstract class Bike2 {
	
	public Bike2() {
		
		System.out.println( "\n_________________________________________ \n Bike is created ");
	}
	
	public abstract void run();
	
	void changeGear() {
		System.out.println( " gear Changed!. ");
	}

}
