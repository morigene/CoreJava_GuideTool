package co.agrit.oop;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(11 , " MUTUYIMANA");
		Student s2 = new Student(12, " Joe");
		s1.displayInfo();
		s2.displayInfo();
        
		//count an object that 
		Student c1 = new Student(0);
		Student c2 = new Student(1);
		Student c3 = new Student(2);
		
		// count an object to show impact of static variable
		Student c4 = new Student();
		Student c5 = new Student();
		Student c6 = new Student();
		
		// static method: no need to create object
		Student.change();   // new Student().change();
		Student s3 = new Student(13, " Murego");
		Student s4 = new Student(14 , " Origene");
		s3.displayInfo();
		s4.displayInfo();
		
		// Another example of static method.
		
		int volume = new Student().cubeVolume(4 );
		System.out.println( " The volume of cube is "+volume);
	   
	  
		
		
	}
}
