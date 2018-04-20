package co.agrit.oop;

public class Student2 {
	
	int rolleNo;
	String name;
	String course;
	float fee;
		
	Student2(int rolleNo, String name, String course){
	
		this.rolleNo = rolleNo;
		this.name    = name;
		this.course  = course;
		
	}
	
	Student2 (int rolleNo, String name, String course, double fee){
		
		this(rolleNo, name, course);
		this.fee = (float)fee;
	}
	
	void displayInfo() {
		
		System.out.println( " rolleNo: "+rolleNo +" , name: "+name + " ,course: "+course + " , fees: "+fee);
	}
	
	// this to pass as an argument in 
	void  msg(Student2 student2) {
		
		System.out.println( " This is passed as an argument. ");
	}
	
	void displayMsg() {
		
		msg(this);
	}

}
