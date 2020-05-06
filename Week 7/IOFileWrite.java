import java.io.*;

class IOFileWrite
{
public static void main(String args[]) throws Exception
{
FileOutputStream fobj = new FileOutputStream("f2.txt");
//byte b[]={'a','s','d','f','g','h','j','q','w','e','r','t','y','u','i','o','p','z','c','x','v','n','b','m'};
String[] s= {"rajagurunathan\n","anand\n","se\n"};
for(int i=0;i<s.length;i++)
{
byte b[] = s[i].getBytes();
fobj.write(b);
}
fobj.close();
}
}