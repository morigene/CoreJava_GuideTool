package co.agrit.oop;

public class Employee {
	
	int rolleNo;
	String name;
	double salary;
	Address address;
	
	Employee (int rolleNo,String name, double salary, Address address){
		
		this.rolleNo = rolleNo;
		this.name    = name;
		this.salary  = salary;
		this.address = address;
	}
	
	void displayInfo() {
		
		System.out.println( rolleNo + name + salary + " "+ address.streetNo +" "+ address.city);
	}

}
