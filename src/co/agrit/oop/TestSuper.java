package co.agrit.oop;

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	super keyword in java

		The super keyword in java is a reference variable which is used to refer immediate parent class object.

		Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
		
		Usage of java super Keyword

    super can be used to refer immediate parent class instance variable.
    super can be used to invoke immediate parent class method.
    super() can be used to invoke immediate parent class constructors
		
		*/
		
		Dog2 dog = new Dog2();
		// refer to  the current class instance variable.
		dog.displayColor();
		// invoke  the current class method.
		dog.work();
		// invoke the current class constructor.
		Cat2 cat = new Cat2();
		
		
	}

}
