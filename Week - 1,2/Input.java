import java.io.*;
import java.util.*;

class Input
{
public static void main(String args[])
{
DataInputStream g = new DataInputStream(System.in);

System.out.println("Enter x , y, z");

String x=g.readLine();

String y=g.readLine();

String z=g.readLine();

Integer a = new Integer(166);
Float b = new Float(66.00);
Double c= new Double(5.42111);
String d=new String("GURU");
Boolean f=new Boolean(true);

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(f);
System.out.println(x);
System.out.println(y);
System.out.println(z);

}
}