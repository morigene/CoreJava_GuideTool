package co.agrit.oop;

public class Shelf {

	final int NUMBER_CASE;
	String name;
	int sizeOfShoes;
	// YOU can change the value of blank final variable only in constructor.
	Shelf(){
		
		NUMBER_CASE = 4;
	}
	
	/*Q) What is final parameter?

			If you declare any parameter as final, you cannot change the value of it.*/
	
	
	int shoesPlace(final int sizeOfCase) {
		
		//sizeOfCase = sizeOfCase/sizeOfShoes; 
		
		return sizeOfCase/sizeOfShoes;
	}
}
