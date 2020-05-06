interface interf
{
	//interf(){}
 int x=10;
 void fun();
}
class Interfacenptel implements interf
{
public void fun() //must be public while overriding
{
System.out.println("FUNCTION OF INTERFACES");
}


public static void main(String args[])
{
Interfacenptel obj = new Interfacenptel(); //downcasting using referencesnces
interf x; // reference variable for interfaces
x = obj;
x.fun();
}
}