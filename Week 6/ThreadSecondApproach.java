class ThreadSecondApproach implements Runnable
{
public void run()
{
	/*
	
	try{
	Thread.currentThread().setDaemon(true);
	}
	catch(Exception e){}
	System.out.println(Thread.currentThread().isDaemon());
	
	*/
System.out.println("THREAD RUNNING");
}


public static void main(String args[])
{
ThreadSecondApproach x = new ThreadSecondApproach();
ThreadSecondApproach y = new ThreadSecondApproach();

Thread t = new Thread(x);
Thread t2 = new Thread(y);
t.start();


System.out.println(t.getName());
System.out.println(t2.getPriority());
try
{
//t.sleep(30);
t.setDaemon(true);
//Thread.currentThread().join();
t2.join();
t.join();
}
catch(Exception E)
{}

System.out.println(Thread.currentThread().getName());

//System.out.println(Thread.currentThread().isDaemon());


/*

t.suspend();
t.resume();
Thread.currentThread().suspend();
Thread.currentThread().resume();

*/
}
}
