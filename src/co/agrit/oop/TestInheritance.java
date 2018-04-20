package co.agrit.oop;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Single Inheritance.
	System.out.println( " Single Inheritance \n_____________________________________");
	Dog d = new Dog();
	d.eat();
	d.bark();
	
	// Multilevel Inheritance. b
	System.out.println( " Multiple Inheritance\n_____________________________________");
	BabyDog  bd = new BabyDog();
	bd.eat();
	bd.bark();
	bd.weep();
	
	// Hierarchical Inheritance.
	System.out.println( " Hierarchical Inheritance\n___________________________________");
	Cat c = new Cat();
	c.eat();
	c.meow();
	d.bark();
	

	}

}
