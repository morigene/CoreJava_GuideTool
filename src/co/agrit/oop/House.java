package co.agrit.oop;

public class House {
	
	int houseNo;
	String cell;
	
	
void getHouseInfo(String c , int h) {
		
		cell = c;
		houseNo = h;
	}
	
	void displayhouseInfo() {
		
		System.out.println( " The  house no: " +houseNo + "  The cell: "+cell);
	}

}
