import java.io.*;

class IOFileMethods
{
public static void main(String args[])
{
File fp = new File("f1.txt");
if(fp.exists())
{
	System.out.println("FILE NAME "+fp.getName());
	System.out.println("FILE PATH "+fp.getPath());
	System.out.println("FILE parent name "+fp.getParent());
	System.out.println("can read "+fp.canRead());
	System.out.println("can write "+fp.canWrite());
	System.out.println("file last lastmodified "+fp.lastModified());
	System.out.println("file length "+fp.length());
	
}	
else
{
	System.out.println("FILE DOESN'T EXIST");
}
}
}