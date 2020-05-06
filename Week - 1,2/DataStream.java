import java.util.*;
import java.io.*;

class DataStream{
public static void main(String args[])throws Exception {
Float a=new Float(1.11);
DataInputStream x = new DataInputStream(System.in);
int b;
float c;
String temp;
System.out.println("Enter b");
temp=x.readLine();
b=Integer.parseInt(temp);
System.out.flush();
System.out.println("Enter c");
temp=x.readLine();
c=Float.valueOf(temp);
System.out.flush();
System.out.println(a+" "+b+" "+c);
}
}



