class NewWayThread11 extends Thread
{
public void run()
{
System.out.println("CHILD CLASS THREAD");
System.out.println(Thread.currentThread().getName());
}
}
class AnotherThread extends Thread
{
	public void run()
	{
		System.out.println("MULTI THREADIBG ALLOWED USING DIFFERENT CLASSES");
	}
}
	



class NewWayThread22
{
public static void main(String args[])
{
	
AnotherThread t2 = new AnotherThread();
NewWayThread11 t = new NewWayThread11();
Thread tx = new Thread(t,"RAJA");
tx.start();
System.out.println("Main CLASS THREAD");
System.out.println(Thread.currentThread().getName());
t2.start();
}
}