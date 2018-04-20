package co.agrit.oop;

public class TestCloneable {

	public static void main(String[] args) {
		
		try {
			
			Student4 st = new Student4(102 ," MUTUYIMANA Origene");
			Student4 st2 = (Student4)st.clone();
			System.out.println( " RolleNo: "+st.rolleNo + " Name: "+st.name);
			System.out.println( " RolleNo: "+st2.rolleNo + "  Name: "+st2.name);
			
		}catch(CloneNotSupportedException c) {
			
			
		}
		

	}

}
