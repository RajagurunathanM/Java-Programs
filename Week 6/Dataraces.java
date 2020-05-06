class Dataraces extends Thread
{
	static int x=0;
	
public void run()
{
   try
	{
for(int i=0;i<10;i++)
{
	x++;
	x--;
}
System.out.println("CHILD THREAD  "+ x);
}
catch(Exception e)
	{}

	}
	
public static void main(String args[])
{
	try{
//Dataraces t1 = new Dataraces();
//Dataraces t2 = new Dataraces();
for(int i=0;i<10;i++)
{

new Dataraces().start();
System.out.println(x);
}
	}
	catch(Exception e)
	{}

}
}