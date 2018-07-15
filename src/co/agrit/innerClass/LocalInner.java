package co.agrit.innerClass;

public class LocalInner {
	
	private int age = 20;
	
    void display() {
    	
    	class Local{
    		
    		void msg(){
    			
    			System.out.println( " The displayed age is: "+age);
    		}
    	}
    	
    	Local l = new Local();
    	l.msg();
    }
	


}
