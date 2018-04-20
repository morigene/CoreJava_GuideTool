package co.agrit.aCaseStudy;

import java.util.Scanner;

public class Challenging_Question {

	public static void main(String[] args) {
	
		/*
		 * Case Study: Predicting the Future Tuition
		Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every
		year. In how many years will the tuition be doubled?
		Before you can write a program to solve this problem, first consider how to solve it by
		hand. The tuition for the second year is the tuition for the first year * 1.07 . The tuition for a
		future year is the tuition of its preceding year * 1.07 . Thus, the tuition for each year can be
		computed as follows:
		
		*/
		
		double tuition = 10000;
		int year = 0;
		while( tuition < 20000) {
			
			tuition = tuition * 1.07;
			year++;
			
		}

		   System.out.println( "The year "+year + " Tuition will be "+tuition +"$ ");
		   
		   
		/*   Listing 5.11 gives a program that prompts the user to enter a decimal number and converts
		   it into a hex number as a string.*/
		   
		/*   char hex = 0 ;
		   System.out.println( " Enter a decimal number to convert into hexadecimal. ");
		   Scanner input = new Scanner(System.in);
		   int decimal = input.nextInt();
		   while( (decimal /16 ) >=16 ) {
			    
			   decimal /=16;
			 if (decimal < 9){
				 
				 hex = (char)decimal; 
			 }else if(decimal > 10){
				 
				 
			 }
			  
			   
		   }
		   
		   int balance = 10;
		   while (true) {
		   if (balance < 9) {
		   continue;
		   }
		   else {
		   balance = balance - 9;
		   }
		   System.out.println("Balance is "
		   + balance);
		   }
*/

		   
		  /* array exercises.
		   * 
		   * Show output 
		   * 	int[][] array = {{1, 2}, {3, 4},{5 ,6}};
		for(int i = array.length -1 ; i >= 0 ; i--) {
			for(int j = array[i].length -1 ; j >=0 ; j--) {
				
				System.out.print( array[i][j] + " ");
			}
			System.out.println( );
		}
			
*/		   

	// Summing element by row
			 
			int[][] array = {{1, 2}, {3,4},{5 ,6}};
			for(int i = array.length -1 ; i >= 0 ; i--) {
				int total = 0 ;
				for(int j = array[i].length -1 ; j >=0 ; j--) {
					total += array[i][j];
				
				}
				System.out.println( " The sum on row "+ (i+1) + " is : "+total);
				System.out.println( );
			}
			System.out.println( " _______________________________________________________\n ");
	// summing element by column
			 
		
			for(int column = array[0].length -1   ; column >= 0 ; column--) {
				int total = 0 ;
				for(int row = array.length -1 ; row >=0 ; row--) {
					total += array[row][column];
					
				
				}
				System.out.println( "The sum on column "+ (column +1) + " is : "+total);
				System.out.println( );
			}
		   
	}

}
