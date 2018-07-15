package co.agrit.innerClass;

public class TestNestedInterface implements Showable.Message {

	public void msg() {
		
		System.out.println( " Hello, Nested interface");
		
	}
	public static void main(String[] args) {
		
		Showable.Message message = new TestNestedInterface();
		message.msg();

	}




}
