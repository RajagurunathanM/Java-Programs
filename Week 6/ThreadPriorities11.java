class ThreadPriorities extends Thread
{
public void run()
{
for(int i =0;i<10;i++)
{
System.out.println("CHILD THREAD");
}

}
}

class ThreadPriorities11
{
public static void main(String args[])
{
ThreadPriorities t1 = new ThreadPriorities();
System.out.println(Thread.currentThread().getPriority());
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
t1.start();
System.out.println(t1.getPriority());

}
}