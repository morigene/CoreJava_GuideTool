package co.agrit.innerClass;

import javax.sound.sampled.AudioFileFormat.Type;

public class TestInnerClass {
	private int data =90;
   class Inner{
	   
	  void  msg(){
		   System.out.println( "Data "+data);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	 1 Type. Member inner class*/
		 TestInnerClass t = new TestInnerClass();
		 TestInnerClass.Inner in = t.new Inner();
		 in.msg();
         
		 /*2. Anonymous  Class*/
		 AnonymousClass an = new AnonymousClass() {
			
		    
			public void eat(){
				
				System.out.println("I eat only voca");
			}
		};
		 
		 an.eat();
		 
		 /*3.type local inner class*/
		 LocalInner li = new LocalInner();
		 li.display();
		 
	}

}
