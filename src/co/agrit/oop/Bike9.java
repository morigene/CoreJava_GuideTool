package co.agrit.oop;

public class Bike9 {
	
	final int speed = 100;

	public Bike9() {
	
	}
	
	void run() {
		
//	speed = 400   this compile error because you can not change value of it.
		System.out.println( speed);
	}
	
	final void getPetrol() {
		System.out.println( " Our Honda consume Benzene");
	}

}
