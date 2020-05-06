class ChildCallMainddlk extends Thread
{
static Thread mt;

public void run() 
{
for(int i=0;i<10;i++)
{
	try
	{
	mt.join();
	}
	catch(Exception e)
	{}
System.out.println("CHILD CLASS THREAD");
}
}
}


class Deadlock1
{
public static void main(String args[]) throws Exception
{
	Thread mt = Thread.currentThread();
	
ChildCallMain t = new ChildCallMain();
t.start();

for(int i=0;i<10;i++)
{
System.out.println("MAIN THREAD CLASS");
}
t.join();
}

}