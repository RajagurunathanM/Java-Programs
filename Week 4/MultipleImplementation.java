interface interface1
{
	int a=0;
	default void f1()
	{
		System.out.println("Interface f1 function");
	}
	
void m1();
}
interface interface3
{
	//int a=9;
	void m1();
}
interface interface2 extends interface3
{
	//interface3.super.m1();
//int a=9;	
void m1();
default void f1()
	{
		System.out.println("Interface f2 function");
	}
}


class MultipleImplementation implements interface1,interface2 
{
public void m1()
{
System.out.println("one m1 method is enough");
}
public void f1()
{
	interface1.super.f1();
	interface2.super.f1();
}
	

public static void main(String args[])
{

MultipleImplementation obj = new MultipleImplementation();
//Sytem.out.println(obj.a);
obj.m1();
obj.f1();
}
}