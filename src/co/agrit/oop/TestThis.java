package co.agrit.oop;

import java.util.Scanner;

public class TestThis {
	String name;
	
	TestThis(){
		
		System.out.println( " Default Constructor ");
	}
	
	TestThis(int x){
		
		this();
		System.out.println( "Invoke the current constructor ");
	}

	public static void main(String[] args) {
	
/*		Usage of java this keyword

		Here is given the 6 usage of java this keyword.

		    this can be used to refer current class instance variable.
		    this can be used to invoke current class method (implicitly)
		    this() can be used to invoke current class constructor.
		    this can be passed as an argument in the method call.
		    this can be passed as argument in the constructor call.
		    this can be used to return the current class instance from the method.

		Suggestion: If you are beginner to java, lookup only three usage of this keyword.*/
		
		// 1. THis to refer to current class variable. Have a look at House class.
		
		// 2 . This to invoke the current class method.
		
		 TestThis ths = new TestThis();
		 ths.displayMessage();
		 
		 // this invoke the current constructor.
		 TestThis ths2 = new TestThis(12);
		 
		 // Real example of this to invoke the current constructor.
		 Student2  st = new Student2(1 ," Mike ", " C++ ", 60000);
		 Student2  st2 = new Student2( 2 , " John ", " C ");
		 st2.displayInfo();
		 st.displayInfo();
		 st.displayMsg();

	}
	
	void getName() {
		
		Scanner input = new Scanner(System.in);
		System.out.println( " What is your name ? ");
	    name = input.nextLine();
	    System.out.println( name);
		
	}
	
	void displayMessage() {
		
		this.getName();
		
	}
	
	

}
