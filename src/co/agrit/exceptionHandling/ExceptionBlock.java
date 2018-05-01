package co.agrit.exceptionHandling;

public class ExceptionBlock {
  private static int 	divide ;
	
	public static void tryandCatch() {
		
		int divide = 0;
		try {
			
			divide = 50/0;
			System.out.println( divide );
		}catch(ArithmeticException ex) {
			
			System.out.println( " Error "+ex);
			
		}
	
	}
	
	public static int tryandCatch( int number ) {
		
	try {
		divide = number / 0;
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println( "  Error of arthmetic "+e);
	}
	
	return divide;
	}
	
	public static void multiTryandCatch() {
		
		     try {
		    	 
		    	 int []arr = new int[5];
		    	 int div = arr[5] / 0;
		    	 System.out.println( div );
		    	 
		     }catch(ArithmeticException ar) {
		    	 
		    	 System.out.println( " Task1 is completed ");  
		     }catch(ArrayIndexOutOfBoundsException arOutofBound) {
		    	 
		    	 System.out.println( " Task2 is completed");
		     }catch(Exception e) {
		    	 
		    	 System.out.println( " Common task  completed");
		     }
		     
		     System.out.println( " The rest code is executed ");
	}
		
		
		/*Rule: All catch blocks must be ordered from most specific to most general
		i.e. catch for ArithmeticException must come before catch for Exception .*/
	
/*	try{  
	    int a[]=new int[5];  
	    a[5]=30/0;  
	   }  
	   catch(Exception e){System.out.println("common task completed");}  
	   catch(ArithmeticException e){System.out.println("task1 is completed");}  
	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
	   System.out.println("rest of the code...");*/ 
			

	public static void nestedTry() {
		
		
	}
	
}
