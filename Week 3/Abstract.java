abstract class A
{
abstract void print();

}

class B extends A
{
	int a=1;
void print()
{
System.out.println("HELLO ABSTRACT CLASS");
}
}

class Abstract
{
public static void main(String args[])
{
A b= new B();
b.print();
}
}
