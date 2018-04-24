package co.agrit.oop;



public class StringCompare {

	public static void main(String[] args) {
	
/*		
		We can compare string in  java on basis of content and Reference
	   ________________________________________________________________________
	   1. By equal() Method It is used in authentication
	   2. by compareTo() sorting.
	   3.reference matching(by == operator.)
	    */
		
		// 1. By equal.
		
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Markdvelle";
		System.out.println(s1.equals(s2));  // true.
		System.out.println( s1.equals(s3));  // true.
		System.out.println(s1.equals(s4));  // false.
		
		//2. compare by == operator.
		
		String s11 = "Sachin";
		String s22 ="Sachin";
		String s33 = new String("Sachin");
		System.out.println( s11 == s22); // true because they refer to the same instance.
		System.out.println( s11 == s33);  // false they do not refer to the same instance.
		
		//3 compare by compareTo(). It compare values by lexicographically  and return an integer
		String t1 = "Origene";
		String t2 = "Origene";
		String t3 = "Mutuyimana";
		String t4 = "Mutuyimana";
		System.out.println(t1.compareTo(t2));  // true and return 	0.
		System.out.println(t4.compareTo(t1)); // t4 > t3 and return 1
		System.out.println(t1.compareTo(t3)); // false and return -1
		
		   
		

		 

	}

}
