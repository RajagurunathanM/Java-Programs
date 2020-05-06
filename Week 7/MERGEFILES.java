import java.io.*;

class MERGEFILES
{
public static void main(String args[]) throws Exception
{
	FileInputStream f1 = new FileInputStream("f1.txt");
	FileInputStream f2 = new FileInputStream("f2.txt");
	
	SequenceInputStream f3 = new SequenceInputStream(f1,f2);
	BufferedInputStream bif = new BufferedInputStream(f3);
	//BufferedOutputStream bof = new BufferedOutputStream(System.out);
	FileOutputStream mer = new FileOutputStream("merfile.txt");
	int i=0;
	while((i=bif.read()) != -1)
	{
		mer.write((char) i);
	}
}
}
	