package co.agrit.oop;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
	private int rows,columns;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[10]; // declaration, instantiation 
		a[0] = 10;
		a[1] = 21; // initialization.
		
		int []b = {12,2,34,2}; // declaration, instantiation and Initialization.
		for( int i = 0 ; i < b.length ; i++) 
			System.out.println(b[i]);
		
		// passing an array in Method.
		int m[] = {21,2,3,2,0,10,9,100};
	    System.out.println( " The minimum number is");
		min(m);
		
		// MUltidimensiona Array.
		
		int [][] mult = new int[3][3]; // 3 rows and 3 columns.
		// First Row
		mult[0][0] = 12;
		mult[0][1] = 1;
		mult[0][2] = 4;
		
		// Second row
		mult[1][0] = 2;
		mult[1][1] = 1;
		mult[1][2] = 3;
		//3rd row
		mult[2][0] = 9;
		mult[2][1] = 1;
		mult[2][2] = 11;
		
		System.out.println( mult[2][2]);
		
		// what is the class name of java array.
		
		String name = mult.getClass().getName();
		System.out.println( " name of java array: "+name);
		
	/*	Random shuffling: In many applications, you need to randomly reorder the elements
		in an array. This is called shuffling. To accomplish this, for each element myList[i] ,
		randomly generate an index j and swap myList[i] with myList[j] , as follows
		
		*/
		int []arr1  = {21,2,2,10,9};
		
		
		for( int i = arr1.length - 1 ; i > 0  ; i--) {
			
			int j = (int)(Math.random() * (i + 1));
			int temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
			System.out.println( arr1[i]);
			
			
		}
		int temp = arr1[0];
		for(int i = 1; i < arr1.length ; i++) {
			
			arr1[ i - 1] = arr1[i];
		}	
		arr1[arr1.length - 1] = temp;
		for(int i = 0 ; i < arr1.length ; i++) {
			
			System.out.println( arr1[i]);
		}
		
		
	/*	Copying a java array
	 * ______________________________________________

		We can copy an array to another by the arraycopy method of System class.
		Syntax of arraycopy method

		    public static void arraycopy(  
		    Object src, int srcPos,Object dest, int destPos, int length  
		    )  
		*/
		
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd'};
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println( new String(copyTo));
		
		// passing an array to a method.
		int arr[]  = { 2,12,21,32,1,0,2,4,34,65,76,20};
		min(arr);
		
		// Returning an array.
		int list[] = {21,3,42,5,78,9,32};
		int result [] = reverse(list);
		System.out.println( " This array is returned by method and method has to reverse it");
	   for(int n = 0 ; n< result.length ; n++) {
		   
		   System.out.print( result[n] +" ");
	   }
	   
	   /* 
	    *Java treat variable length argument as an array 
	    *
	    *typeName... parameterName.
	    *
	    *In the method declaration, you specify the type followed by an ellipsis ( ... ). Only one
         variable-length parameter may be specified in a method, and this parameter must be the last
         parameter. Any regular parameters must precede it.
	    **/
	   
	   printMax(34, 3, 3, 2, 56.5);
	   printMax(new double[]{1, 2, 3});
		
		/*SEARCHING ARRAYS
		________________________________________
		  
		  N.B: If an array is sorted, binary search is more efficient than linear search for finding element in array.
		  
		 Searching is the process of looking for a specific element in an array—for example, discov-
		ering whether a certain score is included in a list of scores. Searching is a common task in
		computer programming. Many algorithms and data structures are devoted to searching. This
		section discusses two commonly used approaches, linear search and binary search.
		
		*Linear Search: compare the key element key   sequentially with each element in array. It continues to do until 
		*the key match the element in array.If match is made the linear search returns the index.
		*
		*/
	   
	   // Linear Search
	   int[]  l= {1, 4, 4, 2, 5, -3, 6, 2};
	   int i = linearSearch(l, 4); // Returns 1
	   int j = linearSearch(l, -4); // Returns -1
	   int k = linearSearch(l, -3); // Returns 5
	   
	   System.out.println( i + " "+j +" "+k);
	   
	   // Binary search----> call function.
	   
		int []l1 = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

	  k = BinarySearch(l1 , 12);
		System.out.println( k );
		
		// Sorting Array   ------>call a function
		
	
		
	/*Array class
	 * 
	 *  java.util.Array  class contains useful static method for common array operations such as sorting and searching.
	 *  
	 *  Arrays.sort()
	 *  Arrays.parallelSort(char , 1, 3)
	 *  Arrays.binarySearch(list,key).
	 *  
	 * */
  System.out.println( " Array class ---> java.util.");
	double [] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
	java.util.Arrays.sort( numbers);
	for( i = 0 ; i < numbers.length ; i++) {
		System.out.print( numbers[i] + " ");
	}
	System.out.println( );
	double []numbers2 = {21,2,3,45,2,1,0,9,71,2,91.0};
	java.util.Arrays.parallelSort(numbers2);
	
	for(int n = 0 ; n < numbers2.length ; n++) {
	  System.out.print( numbers2[n]  + " ");	
	}
	// Binary Search 
	System.out.println( );
	int[] listp = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
	System.out.println("1. Index is " +
	java.util.Arrays.binarySearch(listp, 11));
	System.out.println("2. Index is " +	
	java.util.Arrays.binarySearch(listp, 12));
	char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
	System.out.println("3. Index is " +
	java.util.Arrays.binarySearch(chars, 'a'));
	System.out.println("4. Index is " +
	java.util.Arrays.binarySearch(chars, 't'));
    // other method of array.
	int [] num = {2,43,3,10,921,5,65,21};
	
	java.util.Arrays.fill(num, 2,3,4);
	System.out.println( java.util.Arrays.toString(num));
	
	/* Two dimension array learn
	 * ________________________________________________________
	 * 
	 * Suppose an array matrix is created as follows:
       int[][] matrix = new int[10][10];
       
       
	 * 1.Initialize array with input value.
	 * java.util.Scanner input = new Scanner(System.in);
System.out.println("Enter " + matrix.length + " rows and " +
matrix[0].length + " columns: ");
for (int row = 0; row < matrix.length; row++) {
for (int column = 0; column < matrix[row].length; column++) {
matrix[row][column] = input.nextInt();
}
}
 2.Initialize array with random value.
 for (int row = 0; row < matrix.length; row++) {
for (int column = 0; column < matrix[row].length; column++) {
matrix[row][column] = (int)(Math.random() * 100);
}
}

 3. Printing arrays.
 for (int row = 0; row < matrix.length; row++) {
for (int column = 0; column < matrix[row].length; column++) {
System.out.print(matrix[row][column] + " ");
}
System.out.println();
}

 4. summing all element is done in passing method to two dimensional array.
 5.Summing element by column
 6.Which row has largest sumk
 7.Random shuffling
 
	 * 
       
*/	
	
     // 5.a summing element by column.
	
	int [][]arr2 = {{4,10,5},{2,15,34},{12,43,21}};
	for(int column = 2; column < arr2[0].length; column++) {
		int total = 0 ;
		for(int row = 0; row < arr2.length ; row++){
			
			total +=arr2[row][column];		
		}
		System.out.println( " The summation of array element by column:  "+total);
	}
	
	// 5.b Summing element by rows
	for(int row = 0 ; row < arr2.length ; row++) {
	   int total = 0;
		for (int column = 0; column < arr2[row].length ; column++) {
			
			total += arr2[row][column];	    
			    
		}
	
		System.out.println( " The summation of array element by rows is "+total);
		
	}
		
	// 6. Which row has largest sum ?
	
	int max = 0 ;
	int indexRow = 1;
	for(int row = 0 ; row < arr2.length ; row++) {
	   int total = 0;
		for (int column = 0; column < arr2[row].length ; column++) {
			
			total += arr2[row][column];
			if ( max  < total )
				max = total;
		        indexRow =  row + 1;	    
			    
		}	
	}
	
	System.out.println( " The largest sum is "+max + " and It is on row "+indexRow);
	
	//  Random Shuffling of two dimension array.
	int [][]arr21 = {{4,10,5},{2,15,34},{12,43,21}};

	for( i = 0 ; i < arr21.length ; i++) {
		
		for (j = 0; j < arr21.length; j++) {
			int i1 = (int)(Math.random() * (arr21.length + 1));
			int j1 = (int)(Math.random() * (arr21.length + 1));
			int temp1 =  arr21[i][j];
			arr21[i][j] = arr21[i1][j1];
			arr21[i1][j1] = temp1;
		}
	}
	
	
	
	//  passing method to Two dimensional Array
	   
    int [][] m1= getArray();
  for(  i = 0 ; i < m1.length ; i++) {
	   for(j = 0 ; j < m1[i].length ; j++) {
		   
		   System.out.print( m1[i][j] +" ");
	   }
	   
	   System.out.println( );
  }
    
    int total = sum(m1);
    System.out.println( " The sum of two dimensioan element is "+total);
	
	
	/*  +++++++++++++++++++++++++++ End of Main Method  ++++++++++++++++++++++++++++++++++++++++
	 * 
	 * */
	}
	
	// passing an array in method
	static void min(int []arr) {
		
		int min = arr[0];
		for( int i = 0 ; i < arr.length ; i++)
			if (min > arr[i])
				min = arr[i];
		System.out.println( min );
	}
	
	// returning an array from method
	static int[] reverse(int list[]) {
		int result[] = new int[list.length];
		for ( int i = 0 , j = result.length -1 ; i < list. length ; i++, j-- ) {
			
			result[j] = list[i]; 	
		}	
		return result;	
	}
	
	// Variable length arguments.
	
	static void printMax( double...numbers) {
		
		if(numbers.length == 0) {
			System.out.println( " No argument passed ");
		return;
		}
		
		double result = numbers[0];
		for( int i = 0 ; i < numbers.length ; i++ ) {
			
			if(numbers[i] > result)
				result = numbers[i];
		}
		
		System.out.println( "\n_____________________________________\n  Variable argument list");
		System.out.println( result);	
		
	}
	
	// Linear Search example
	
			static int linearSearch( int arr[] , int key) {
				
				for (int i = 0 ; i < arr.length ; i++) {
					
					if(arr[i]  == key)
						return i;
				}
				
				return -1;
			}
			
	// Binary Search
			
			static  int BinarySearch(int []list, int key) {
				
				int low = 0, high = list.length -1 ;
			
				for(int i = 0 ; i < list.length ; i++) {
					int mid = (low + high )/2;
					if(key  > list[mid])
						low = mid +1;
					else if(key== list[mid])
						return mid;
					
					else if (key < list[mid])
						 high = mid -1 ;
				}
				
				return -low -1;
				
			}
			
			
			// TWo Dimensional Array.
			public static int [][] getArray(){
				
				Scanner input = new Scanner(System.in);
				System.out.println( " Enter length of rows");
				int rows = input.nextInt();
				System.out.println( " Enter a length of columns");
				int columns = input.nextInt();
				// array to get sum
				int m[][] = new int[rows][columns];
				for(int i = 0 ; i < rows ; i++) {
					System.out.println( " Enter for rows "+( i+1 ));
					for (int j = 0 ; j < columns; j++) {
						System.out.println( " Enter for rows "+(i + 1)+" column "+(j + 1 ));
						m[i][j] = input.nextInt();
					}	
				}
				
				return m;
				
			}
			
			public static int sum(int [][] m) {
				
				int total = 0 ; 
			 
			for(int i = 0; i < m.length ; i++) {
			
					for(int j = 0 ; j < m[i].length ; j++) {
						
						total += m[i][j];
					}
					}
				
				return total;
			}

}
