package co.agrit.thread;


public class WorkerThread implements Runnable{
	
	private String message;
	 	
	public WorkerThread(String s) {
		this.message = s;
		
	}
	
	public void run() {
		System.out.println( Thread.currentThread().getName() + " (start)message = "+message);
		processmessage();
		System.out.print(Thread.currentThread().getName() + "(End)");
		
	}
	
	public void processmessage() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
