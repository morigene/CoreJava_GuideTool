package co.agrit.string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		You can get substring from the given string object by one of the two methods:

		    public String substring(int startIndex): This method returns new String object containing the substring of the given string from specified startIndex (inclusive).
		    public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.

		In case of string:

		    startIndex: inclusive
		    endIndex: exclusive*/

		
		String name = "Kalisa John";
		System.out.println( name.substring(4));
		System.out.println( name.substring(2 , 7));

	}

}
