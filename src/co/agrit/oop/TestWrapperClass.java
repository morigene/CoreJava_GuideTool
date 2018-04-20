package co.agrit.oop;

public class TestWrapperClass {

	public static void main(String[] args) {
		
/*		convert int into integer is autoboxing
		
		convert integer into int is unboxing
		
		*/
		
		// primitive to wrapper
		int a = 20 ;
		Integer i = Integer.valueOf( a ); // converting  int into Integer.
		Integer j = a;  // autoboxing, now compiler will write Integer.valueOf(a) internally.s
		
		System.out.println( a + " "+i+" "+j);
		
		//wrapper to primitive.
		
		Integer b = new Integer(3);
		int x = b.intValue(); // convert integer into int.
		int m = b;
		
		System.out.println( b + " "+x + " "+m);
		
		
		

	}

}
