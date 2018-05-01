package co.agrit.string;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder b = new StringBuilder(" Welcome");
		b.append( " Java ");
		System.out.println( b);  // string has already changed.
		
		// insert a string.
		b.insert(0 , "First programming language ,");
		System.out.println( b);
		
		// replacing a string.
		
		b.replace(1, 7, " Why do you like java");
		System.out.println( b );
		
		// reverse a string
		System.out.println( b.reverse());
		
		// capacity
		System.out.println(  " The capacity of my string is: "+b.capacity());
		
		b.ensureCapacity( 100 );
		System.out.println( b.capacity());
		
	}

}
