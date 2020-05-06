class ThreadJoinClass extends Thread
{

public void run() 
{
for(int i=0;i<10;i++)
{
	try
	{
	Thread.sleep(10);
	}
	catch(Exception e)
	{}
System.out.println("CHILD THREAD CLASS");
}
}
}


class ThreadJoinDemo
{
public static void main(String args[]) throws InterruptedException
{
ThreadJoinClass t = new ThreadJoinClass();
t.start();
t.join(10);
for(int i=0;i<10;i++)
{
System.out.println("MAIN THREAD CLASS");
}
}
}