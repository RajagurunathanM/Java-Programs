class ThreadYieldClass extends Thread{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("CHILD THREAD");
Thread.yield();
}
}
}

class ThreadYieldDemo
{
public static void main(String args[])
{
ThreadYieldClass t = new ThreadYieldClass();
t.start();
for(int i=0;i<10;i++)
{
	
System.out.println("MAIN THREAD");
}
}
}
