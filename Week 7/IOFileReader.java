import java.io.*;

class IOFileReader
{
public static void main(String args[]) throws Exception
{
	File obj = new File("f1.txt");
	FileReader fobj = new FileReader(obj);
	int i=0;
	while((i=fobj.read()) !=-1)
	{
	System.out.print((char) i);
	}
}
}