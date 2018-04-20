package co.agrit.oop;

public class TestInitialize_Object {

	public static void main(String[] args) {
		
		
	/*	3 ways to initialize Object
		________________________________________*/
		

		  // 1. Initialize through reference variable.
		
		House h = new House();
		h.houseNo = 200;
		h.cell = "Amahoro";
		System.out.println( " The house No:  "+h.houseNo + "  Cell Name: "+h.cell);
		
		//2. Initialize through a Method
		
		h.getHouseInfo(" Amahoro ", 201);
		h.displayhouseInfo();
		
		//3.  Initialize through a Constructor
		House2 h2 = new House2( 120 , " Amahoro");
		h2.displayInfo();
		
		// creating multiple object by one type only
		House2 h3 = new House2(100, " Amahoro "), h4 = new House2(101 , " Amahoro");
		
		
		
		
	}

}
