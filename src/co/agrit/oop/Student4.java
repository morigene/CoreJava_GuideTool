package co.agrit.oop;

public class Student4 implements Cloneable {
	
  int rolleNo;
  String name;
  
  Student4(int rolleNo, String name){
	  
	  this.rolleNo = rolleNo;
	  this.name    = name;
  }
  
  public Object clone() throws CloneNotSupportedException{
	  
	  return super.clone();
  }

}
