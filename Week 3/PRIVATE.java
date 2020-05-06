class A
{
protected A(){ System.out.println("A CONSTRUCTOR CREATED");}
protected int a=2;
protected void b()
{
System.out.println("HELLO");
}
}

class PRIVATE extends A
{
public static void main(String args[])
{
A aobj = new A();
PRIVATE p = new PRIVATE();
aobj.b();
}
}

