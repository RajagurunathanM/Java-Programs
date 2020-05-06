class Mythread1 extends Thread
{
	/*public void start()
	{
		super.start();
		System.out.println("START FUNction");
	}
	*/	
public  void run()       // definig thread
{
for(int i=0;i<10;i++)          // child THread  job
{
System.out.println("CHILD THREAD");;
}
}
}



class ThreadDemo1
{
public static void main(String args[])
{
Mythread1 t = new Mythread1();// thread creation
//t.run();           //normal run()
t.start();
//t.start();

}
}