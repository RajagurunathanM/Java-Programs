import java.io.*;

class IOFileWriter 
{
	public static void main(String args[]) 
	{
		
		try
		{
		String s[]= {"raja\n","guru\n","nathan\n"};
		FileWriter fobj = new FileWriter("f1.txt");
		for(String x:s)
			fobj.write(x);
		
		fobj.close();
		}
		catch(Exception e){}
		
	}
}