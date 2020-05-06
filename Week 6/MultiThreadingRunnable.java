class Thread1 implements Runnable
{
public void run()
{
System.out.println("Thread1 Class executes Thread by Runnable");
}
}

class Thread2 implements Runnable
{
public void run()
{
System.out.println("Thread2 Class executes Thread by Runnable");
}
}

class Thread3 implements Runnable
{
public void run()
{
System.out.println("Thread2 Class executes Thread by Runnable");
}
}

class MultiThreadingRunnable
{
public static void main(String args[])
{
	Thread1 x = new Thread1();
Thread t1 = new Thread(x);
Thread2 y = new Thread2();
Thread t2 = new Thread(y);
Thread3 z = new Thread3();
Thread t3 = new Thread(z);

t1.start();
t2.start();
t3.start();
System.out.println("\n\nMAIN THREAD CLASS");
}
}

