package co.agrit.aCaseStudy;

import java.util.Iterator;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 char [][] answers = {
				 {'A' , 'B' , 'A', 'C','C', 'D','E', 'E','A','D'},
				 {'D' , 'B' , 'A', 'B','C', 'A','E', 'E','A','D'},
				 {'E' , 'D' , 'D', 'A','C', 'B','E', 'E','A','D'},
				 {'C' , 'B' , 'A', 'E','D', 'C','E', 'E','A','D'},
				 {'A' , 'B' , 'D', 'C','C', 'D','E', 'E','A','D'},
				 {'B' , 'B' , 'E', 'C','C', 'D','E', 'E','A','D'},
				 {'B' , 'B'  , 'A', 'C','C', 'D','E', 'E','A','D'},
				 {'E' , 'B' , 'E', 'C','C', 'D','E', 'E','A','D'},
				 
		 };
		 
		char [] keys = {'D' , 'B' , 'D', 'C','C', 'D','A', 'E','A','D'};
		for( int i = 0 ; i < answers.length ; i++) {
			int countMarks = 0;
			for( int j = 0 ; j <  answers[i].length ; j++){
				
				if( answers[i][j] == keys[j]) {
					
					countMarks +=1;
				}
				
			}
			
			System.out.println( " The student "+(i + 1) +"'s"+ " has marks:  "+countMarks);
		}
			
				
		}
	}		

