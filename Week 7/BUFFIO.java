import java.io.*;

class BUFFIO
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fobj = new FileOutputStream("D:\\Computer Science\\NPTEL\\Java\\Practice Programs\\WEEK 7\\f1.txt");
		BufferedOutputStream f = new BufferedOutputStream(fobj);
		
		String s="hfhhfhfhfhf";
		byte[] b = s.getBytes();
		fobj.write(b);
		
	}
}
