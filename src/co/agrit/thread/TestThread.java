package co.agrit.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Multi mul = new Multi();
		mul.start();
		
		
		// sleeping a  thread
		SleepMethod1  t1 = new SleepMethod1();
		SleepMethod1  t2 = new SleepMethod1();
		
		
		/*t1.start();
		t2.start();*/
		
		//join a thread
		
		System.out.println( " Joining a method \n_______________________________ ");
		
		JoinMethod jt1 = new JoinMethod();
		JoinMethod jt2 = new JoinMethod();
		JoinMethod jt3 = new JoinMethod();
		
		jt1.start();
		try {
			jt1.join(1500);
		} catch (Exception e) {
			System.out.println( e );
		}
		
		jt2.start();
		jt3.start();
		
		
		// changing the name of thread.
		NamingThread nh1 = new NamingThread() ;
		NamingThread nh2 = new NamingThread();
		
		System.out.println( " The name of thread before!. ");
		System.out.println( " The name of thread"+nh1.getName());
		System.out.print( " The name of thread "+nh2.getName());
		
		nh1.start();
		nh2.start();
		nh1.setName("OrigeneThread");
		nh2.setName("MuThread");
		System.out.println( " The name of thread after");
		System.out.println( " The name of thread "+nh1.getName());
		System.out.println( " The name of thread "+nh2.getName());
		
		// knowing priority in thread
		PriorityThread pt = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);

		pt.start();
		pt2.start();
		pt3.start();
		
		

	}

}
