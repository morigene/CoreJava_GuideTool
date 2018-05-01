package co.agrit.string;

public class Split {

	public static void main(String[] args) {
		
		
		// splits against a given regular expression and return a char array.
		
		String s1 = "java string method by javatpoint";
		String [] word = s1.split("\\s");
		for(String w:word) {
			
			System.out.println( w);
		}
		
		String s2 = " Welcome to split world";
		System.out.println( " Returning word");
		for(String w:s2.split("\\s",5)) {
			
			System.out.println( w);
		}

	}

}
