import java.io.*;

class IOFileRead 
{
public static void main(String args[]) throws Exception
{
FileInputStream fobj = new FileInputStream("f1.txt");
int i=0;
//System.out.println(fobj.available());
while((i=fobj.read()) != -1)
{
System.out.print((char) i);
}

}
}