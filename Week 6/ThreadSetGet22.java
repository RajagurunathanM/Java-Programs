class ThreadSetGet11 extends Thread
{
public void run()
{
System.out.println("CHILD CLASS THREAD");
Thread.currentThread().setName("CHILD thread from main class");

System.out.println(Thread.currentThread().getName());
}
}

class ThreadSetGet22 
{
public static void main(String args[])
{
ThreadSetGet11 t = new ThreadSetGet11();
t.start();
Thread.currentThread().setName("main thread from main class");

System.out.println(Thread.currentThread().getName());

}
}