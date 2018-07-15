package co.agrit.thread;

public class JoinMethod extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 6; i++) {
			
			try {Thread.sleep(500);
			
			}catch(InterruptedException ie){
				
				System.out.println( " Interrupt exception "+ie);
			}
			System.out.println( i );	
			}
	}

}
