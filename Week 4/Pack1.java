import WEEK1_2.*;


class Pack1
{
Pack1()
{
System.out.println("PACK 1 CLASS CONSTRUCTOR");
}
void fun()
{
System.out.println("FUNCTION OF PACK CLASS");
}
public static void main(String args[])
{
	A obj = new A();
	Pack1 p = new Pack1();
	p.fun();
	obj.show();
}
}