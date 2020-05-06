class A
{
void fun()
{
System.out.println("A CLASS");
}
}

class B extends A
{
void fun()
{
System.out.println("B CLASS");
}
}






class Referenceobj
{
public static void main(String args[])
{
A a = new A();
B b = new B();
a.fun();
b.fun();
a=b;
b.fun();
}
}
