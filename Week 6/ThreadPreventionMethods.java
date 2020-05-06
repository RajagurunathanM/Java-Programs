class ThreadPreventionMethods11  extends Thread
{
public void run()
{
System.out.println("CHILD THREAD 11");
//Thread.yield();
}
}

class ThreadPreventionMethods22 extends Thread
{
public void run()
{
System.out.println("CHILD THREAD 22");
/*

try
{
suspend();
resume();
}
catch(Exception e){}
//Thread.yield();
}

*/
}
}

class ThreadPreventionMethods
{
public static void main(String args[]) throws InterruptedException
{
//Thread.currentThread().stop();
ThreadPreventionMethods11 t1 = new ThreadPreventionMethods11();
ThreadPreventionMethods22 t2 = new ThreadPreventionMethods22();

t1.start();
t2.start();

//t2.yield();
for(int i=0;i<10;i++)
{
System.out.println("MAIN THREAD");
//Thread.currentThread().sleep(2000);
}


//t2.join();



//t1.stop();
//t2.stop();
}
}