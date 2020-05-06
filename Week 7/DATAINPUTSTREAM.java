import java.io.*;

class DATAINPUTSTREAM
{
public static void main(String args[]) throws Exception
{
DataInputStream in = new DataInputStream(System.in);
String buf;
System.out.println("ENTER INT VALUE");
Integer a = Integer.valueOf(in.readLine());

System.out.println("ENTER STRING VALUE");
String b = String.valueOf(in.readLine());

System.out.println("ENTER FLOAT VALUE");
Float c = Float.valueOf(in.readLine());

System.out.println("ENTER DOUBLE VALUE");
Double d = Double.valueOf(in.readLine());

System.out.println("ENTER BYTE VALUE");
Byte e = Byte.valueOf(in.readLine());

System.out.println("ENTER BOOLEAN VALUE");
Boolean f = Boolean.valueOf(in.readLine());

DataOutputStream out = new DataOutputStream(System.out);
out.flush();


}
}