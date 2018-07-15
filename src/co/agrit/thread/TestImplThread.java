package co.agrit.thread;

public class TestImplThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 mu= new Multi3();
		Thread t = new Thread(mu);
		t.start();

	}

}
