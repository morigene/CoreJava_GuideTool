package co.agrit.oop;

public class TestCopyValue_Constructor {

	public static void main(String[] args) {
		
		
		// copy values of constructor.
		House2 h  = new House2(111, "Amahoro ");
		House2 h1 = new House2();
		
		h1.houseNo = h.houseNo;
		h1.cell = h.cell;
		
		h.displayInfo();
		h1.displayInfo();
		

	}

}
