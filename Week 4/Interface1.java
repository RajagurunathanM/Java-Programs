interface interf1
{
	int a=5;
public abstract void fun1();
public abstract void fun2();
}

abstract class Interface implements interf1{
public  void fun1()
{
System.out.println("FUN1 IN INTERF INTERFACE");
}
}
class Interface2 extends Interface
{
public  void fun2()
{
System.out.println("FUN2 IN INTERF INTERFACE");
}

}

 class Interface1 extends Interface2
{
public static void main(String a[])
{
Interface1 obj = new Interface1();
obj.fun1();
obj.fun2();
System.out.println(obj.a);
}




}