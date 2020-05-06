class SleepInterrupt extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("CHILD THREAD");
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("INTERRUPT OCCURS");
		}
		
	}
		
}
	


class SleepDemo1
{
public static void main(String args[]) throws InterruptedException
{
	
SleepInterrupt t = new SleepInterrupt();
t.start();
t.interrupt();
for(int i=0;i<10;i++)
{
System.out.println("MAIN THREAD");
}
}
}