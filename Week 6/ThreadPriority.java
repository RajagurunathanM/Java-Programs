class ThreadPriority11 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getId());	
System.out.println("THREAD 11 CLASS");
}	
}
}

class ThreadPriority22 extends Thread
{
public void run()
{
	System.out.println(Thread.currentThread().getId());
System.out.println("THREAD 22 CLASS");
	
}
}


class ThreadPriority 
{
public static void main(String args[])
{
	
ThreadPriority11 t1 = new ThreadPriority11();
ThreadPriority22 t2 = new ThreadPriority22();
//t1.setPriority(Thread.NORM_PRIORITY);
//t2.setPriority(Thread.NORM_PRIORITY);
try
{
t1.start();
t1.join();
t2.start();
t2.join();

}
catch(Exception e)
{}

System.out.println(Thread.currentThread().getId());
	
}
}