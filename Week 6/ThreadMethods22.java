class ThreadMethods11 extends Thread
{
public void run()
{
	try{
		
	sleep(6000);
System.out.println("CHILD CLAS THREAD");
System.out.println(Thread.currentThread().getName());
}

catch(Exception e)
{}
}
}

class ThreadMethods22 
{
public static void main(String args[])
{
	try
	{
		
		
ThreadMethods11 t = new ThreadMethods11();
Thread x = new Thread(t,"raja");
ThreadMethods11 t2 = new ThreadMethods11();
Thread y = new Thread(t2,"guru");
x.start();
x.yield();
y.start();
y.yield();
Thread.currentThread().yield();

/* Thread.currentThread().suspend();
Thread.currentThread().resume();   */



System.out.println(Thread.currentThread().getName());

/*



t.sleep(55);   // stops the thread execution
// // resume the thread execution after suspend() occurs

t.suspend();
t.resume();

*/



	}
	catch(Exception e)
	{}
}
}