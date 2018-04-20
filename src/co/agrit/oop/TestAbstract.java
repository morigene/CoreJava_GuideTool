package co.agrit.oop;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Abstract class in Java

		A class that is declared with abstract keyword, is known as abstract class in java. It can have abstract and non-abstract methods (method with body).

		Before learning java abstract class, let's understand the abstraction in java first.
		Abstraction in Java

		Abstraction is a process of hiding the implementation details and showing only functionality to the user.

		Another way, it shows only important things to the user and hides the internal details for example sending sms, you just type the text and send the message. You don't know the internal processing about the message delivery.

		Abstraction lets you focus on what the object does instead of how it does it.
		Ways to achieve Abstraction

		There are two ways to achieve abstraction in java

		    Abstract class (0 to 100%)
		    Interface (100%)*/
		
		Shape r = new Rectangle();
		r.draw();
		Shape c = new Circle();
		c.draw();
		
	/*	Abstract class having constructor, data member, methods etc.

		An abstract class can have data member, abstract method, method body, constructor and even main() method.*/

		  
		Bike2 honda = new Honda2();
		honda.run();
		honda.changeGear();

	}

}
