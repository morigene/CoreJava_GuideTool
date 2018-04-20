package co.agrit.oop;

public class Student {
	
	int rolleNo;
	String name;
    static String university = " UR";
    int counter2 = 0 ;
    static int count = 0;
    Student(){
    	
    	count +=1;
    	System.out.println( count);
    }
    
    Student( int x  ){
    	
    	counter2++;
    	System.out.println(counter2);
    }
    
   Student(int rolleNo, String name){
	 this.rolleNo = rolleNo;
	 this.name = name;
   }
    
    void displayInfo() {
    	System.out.println( "rolleNo:  "+rolleNo +" ,  name: "+name + " ,University: "+university);
    }
    
    
/*     Java static method

    If you apply static keyword with any method, it is known as static method.

        A static method belongs to the class rather than object of a class.
        A static method can be invoked without the need for creating an instance of a class.
        static method can access static data member and can change the value of it.
*/
    
    static void change() {
    	
    	university = " Carnegie Mellon University";
    }
    
    //Another Example of static method.
    
    static int cubeVolume(int x) {
    	
    	return x * x * x;
    }

}
