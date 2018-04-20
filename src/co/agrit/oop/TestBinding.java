package co.agrit.oop;

public class TestBinding {

	public static void main(String[] args) {

	/*	Static Binding and Dynamic Binding
		static binding and dynamic binding in java

		Connecting a method call to the method body is known as binding.

		There are two types of binding

		    static binding (also known as early binding).
		    dynamic binding (also known as late binding).
		    
		    When an object is determined at compile time(by compiler),it is known as static binding.
		    if there is any private, static,final so there is static binding.	
		    
		    When an object is determined at runtime, it is known as dynamic binding.
		    
		    EXample below 
		    _________________________________________________________________
*/

		Animal an = new Dog();  // upcasting
		an.eat();
	}
}
