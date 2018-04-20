package co.agrit.oop;

public class TestAggregate {

	public static void main(String[] args) {
		
		Address address  = new Address(100, " MUHIMA");
		Address address2 = new Address(102, "KIMIRONKO");
		
		Employee emp1  = new Employee(1 , " MUTUYIMANA O", 900000 , address);
		Employee emp2  = new Employee(2 , " MUHIRE ", 100000, address2);
		emp1.displayInfo();
		emp2.displayInfo();

	}
}
