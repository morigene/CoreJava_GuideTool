package co.agrit.javaRegex;

import java.util.regex.Pattern;

public class RegexCharcterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1	[abc]	a, b, or c (simple class)
		2	[^abc]	Any character except a, b, or c (negation)
		3	[a-zA-Z]	a through z or A through Z, inclusive (range)
		4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
		5	[a-z&&[def]]	d, e, or f (intersection)
		6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
		7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)

*/	
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  	
	
	}

}
