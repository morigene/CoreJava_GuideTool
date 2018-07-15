package co.agrit.innerClass;

public class MemberInner {
	
	private int data = 90;
	
	public class Inner{
		
		public void msg() {
			
			System.out.println( "Welcome to MemberInner Class "+data); 
		}
	}
}
