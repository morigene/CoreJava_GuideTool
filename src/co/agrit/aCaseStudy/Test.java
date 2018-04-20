package co.agrit.aCaseStudy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * This file has purpose of debugging and show output
		 * _____________________________________________________________________
		 *  
		 *  
		 *  */

		
		// This is based on method chapter in book of Daniel 
		
// first exercises
	System.out.println( " First Exercises \n_____________________________");
	int max = 0;
    System.out.println(max);
// second exercises.
    System.out.println( " Second Exercises\n___________________________");
    int i = 1;
    while (i <= 6) {
    method1(i, 2);
    i++;
    }
// third exercises.
    System.out.println( " Third Exercises\n___________________________");
    i = 0;
    while (i <= 4) {
    method1(i);
    i++;
    }
    
    System.out.println( "i is "+i);
    // chapter 7 single array.
    int x = 30;
    int [] numbers = new int[x];
    x = 60;
    System.out.println( " x "+x);
    System.out.println( " The size of array is "+numbers.length);
    
    int list[] = {1, 2, 3, 4, 5, 6};
    for (int p = 1; p < list.length; p++)
    list[p] = list[p - 1];
    for (int p= 0; p< list.length; p++)
    System.out.print(list[p] + " ");
    
  /* 3 ways to copy an array 
   * 
   * 1.using loop to copy individual element in array.
   * 2.static array method in system class.
   * 3.Use clone method to copy array.
   * 
   * 
   * */
    //1. using loop
	int [] o = new int[5];
	int [] j = {2,31,32,2,0};
	
	for(int n= 0 ; n < j.length ; n++) {
		
		o[n] = j[n];
	}
	
	for(int k = 0; k < o.length ; k++) {
		
		System.out.println( o[k]);
	}
	
	//2. Using static arraycopy method : System.arraycopy( src, startpostionAtSource, destin, startpositionAtEnd , length)
	int [] srcArray = {12,2,3,1,9,7,56,54,21,34,56};
	int []destArray  = {2,3,9,5};

	  destArray = new int[11];
	  System.out.println( destArray.length);
	  
	  System.arraycopy(srcArray , 2 , destArray ,0 ,7);
	  for( int k = 0 ; k < j.length ; k++) {
		  
		  System.out.print( j[k] +" ");
	  }
	  
	  // exercise 4 // show output
		int[] l = {1, 2, 3, 4, 5};
		reverse(l);
		for (i = 0; i < list.length; i++)
		System.out.print(list[i] + " ");
	

	}	
	// 1 exercises.
	public static void max(
			int value1, int value2, int max) {
			if (value1 > value2)
			max = value1;
			else
			max = value2;
	}
	
	// 2 exercises.
	public static void method1(
			int i, int num) {
			for (int j = 1; j <= i; j++) {
			System.out.print(num + " ");
			num *= 2;
			}
			System.out.println();
			}
	
	//3 exercises.
	
	public static void method1(int i) {
		do {
		if (i % 3 != 0)
		System.out.print(i + " ");
		i--;
		}
		while (i >= 1);
		System.out.println();
		}
	
	// exercise 4: show the output. 
	static void reverse(int[] list) {
		int[] newList = new int[list.length];
		int i;
	for ( i = 0; i < list.length; i++)
		newList[i] = list[list.length - 1 - i];
	    list = newList;
	    
	}
	
	
}
