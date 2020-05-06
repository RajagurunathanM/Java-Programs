import java.util.*;

class A
{
int a=5;
static int x = 5;
}
class B
{
int b=2;
}
class Instance
{
int c=9;
public static void main(String args[])
{
	Instance cobj=new Instance();
	A ao1=new A();
	A ao2=new A();
	A ao3 = new A();
	ao2.x=6;
	System.out.println(ao2.x);
	ao3.x=10;
	System.out.println(ao3.x);
	
	
	B bobj=new B();
	
System.out.println(cobj.c+" "+ao1.a+" "+bobj.b+" "+ao1.x);
}
}


