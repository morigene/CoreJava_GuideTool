package co.agrit.oop;

public class TestInterface {

	public static void main(String[] args) {
	
		/*
		Interface in Java


	An interface in java is a blueprint of a class. It has static constants and abstract methods.

	The interface in java is a mechanism to achieve abstraction. There can be only abstract methods in the java interface not method body. It is used to achieve abstraction and multiple inheritance in Java.

	Java Interface also represents IS-A relationship.

	It cannot be instantiated just like abstract class.
	
	Why use Java interface?

			There are mainly three reasons to use interface. They are given below.

			    It is used to achieve abstraction.
			    By interface, we can support the functionality of multiple inheritance.
			    It can be used to achieve loose coupling.
			    
			    Java 8 Interface Improvement

			    Since Java 8, interface can have default and static methods which is discussed later.
			    Internal addition by compiler
			    The java compiler adds public and abstract keywords before the interface method. More, it adds public, static and final keywords before data members.
*/

		Drawable r = new Rectangle2();
		r.draw();
		Drawable c = new Circle2();
		c.draw();
		
		// multiple inheritance achieved by interface.
		TestMultiple_Inheritance m = new TestMultiple_Inheritance();
		m.print();

/*Q) What is marker or tagged interface?

An interface that have no member is known as marker or tagged interface. For example: Serializable, Cloneable, Remote etc. They are used to provide some essential information to the JVM so that JVM may perform some useful operation.*/
	}
}
