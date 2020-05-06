import java.io.*;

class Serialization implements Serializable
{
Serialization(String s)
{
System.out.println("SERILIZATION OBJECT "+"\t"+s);
}

public static void main(String args[])
{
try
{
	//serialization
String s="rajaguru";
Serialization obj = new Serialization(s);
FileOutputStream fout = new FileOutputStream("f.txt");
ObjectOutputStream out = new ObjectOutputStream(fout);
out.writeObject(obj);
out.flush();
/*
//deserialization
ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
Serialization obj2 = (Serialization)in.readObject();
//System.out.println(obj2.id);
*/
System.out.println("SUCCESS SERILIZATION");
}
catch(Exception e)
{
System.out.println("EXCEPTION IS"+e);
}
}
}



