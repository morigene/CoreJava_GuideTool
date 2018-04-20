package co.agrit.oop;

public class House2 {
	
	int houseNo;
	String cell;
	
	House2(){}

	House2(int houseNo , String cell){
		
		this.houseNo = houseNo;
		this.cell = cell;
	}
	
	void displayInfo() {System.out.println( " House NO:  "+houseNo +  " The Cell: " +cell);}
	
}
