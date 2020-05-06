import java.io.*;

class IOCOPYFILECHARSTREAM
{
public static void main(String args[]) throws Exception
{
FileReader f1 = new FileReader("f1.txt");
FileWriter f2 = new FileWriter("f2.txt");

int i =0;
while((i=f1.read()) != -1)
{
f2.write( (char) i);
}
f2.close();
f1.close();

}
}