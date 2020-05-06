import java.io.*;

class RAF
{
	public static void main(String args[]) 
	{
		try
		{
	RandomAccessFile f = new RandomAccessFile("f1.dat","rw");
	
	f.writeInt(12);
	f.close();
		}
		catch(Exception e){}
	/*
	
	f.seek(f.length());
	String s="\n raja guru nathan\n";
	byte b[] = s.getBytes();
	f.write(b);
	f.seek(3);
	
	int i=0;
	while((i=f.read()) !=-1)
	{
	
	System.out.print((char) i);
	}
	
	*/
	
	
	//int a=0;
	//f.writeByte("hagavvaah\n");
	
	
	
	}
}
	