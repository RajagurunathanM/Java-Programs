import java.io.*;

class IOCOPYFILESTREAM 
{
public static void main(String args[]) throws Exception
{
FileInputStream f1 = new FileInputStream("f1.txt");
FileOutputStream f2 = new FileOutputStream("f2.txt");

int i=0;
while((i=f1.read()) != -1)
{
	f2.write((char) i);
}
}
}