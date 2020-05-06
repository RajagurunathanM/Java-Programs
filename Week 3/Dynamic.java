class A
{
int a=3;
void fun()
{
	System.out.println(" a is "+a);
}
}
class B extends A 
{
int a=5;
void  fun()
{
	System.out.println(" a is "+a);
}
}

class Dynamic 
{
public static void main(String args[])
{
A a = new A();
System.out.println("A CLASS a value"+a.a);
B b = new B();
System.out.println("B CLASS a value"+b.a);
A a1 = new B();
System.out.println("D B value of a is "+a1.a);
a1.fun();
}
}
