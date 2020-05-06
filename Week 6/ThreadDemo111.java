class Thread112 extends Thread{
public void run()
{
System.out.println(Thread.currentThread().getId());
System.out.println("CHILD THREAD");
}
}

class ThreadDemo111
{
public static void main(String args[])
{
Thread112 t = new Thread112();
t.start();
System.out.println("main id "+Thread.currentThread().getId());
}
}
