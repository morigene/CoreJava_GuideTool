package co.agrit.oop;

public class Dog2 extends Animal2 {

	String color = " black ";
	public Dog2() {
		// TODO Auto-generated constructor stub
	}
	
	void displayColor() {
		System.out.println( color);
		// 1. refer to the current class instance variable
		System.out.println( super.color);
	}
	
	void bark() {
		System.out.println( " Barking ");
		
	}
	
	
	void work() {
		
		super.eat();
		bark();
	}
	
	
}
