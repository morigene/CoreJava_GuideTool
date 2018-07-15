package co.agrit.thread;

public class PriorityThread extends Thread {

	public void run() {
		
		System.out.println( " Running ......"+Thread.currentThread().getPriority());
	
	}
}
