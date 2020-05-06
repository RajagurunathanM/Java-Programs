import java.io.*;

class PRIMITIVEDATAFILESTREAM
{
public static void main(String args[]) throws Exception
{
	File fobj = new File("D:\\Computer Science\\NPTEL\\Java\\Practice Programs\\WEEK 7\\f1.txt");
	/*
	FileInputStream inp = new FileInputStream(fobj);
	DataInputStream ip = new DataInputStream(inp);
	
	System.out.println(ip.readInt());
	System.out.println(ip.readDouble());
	System.out.println(ip.readFloat());
	System.out.println(ip.readBoolean());
	System.out.println(ip.readChar());
	*/
	
	FileOutputStream fop = new FileOutputStream(fobj);
	DataOutputStream op = new DataOutputStream(fop);
	op.writeInt(123);
	op.writeFloat(1.23f);
	op.close();
	
}
}
