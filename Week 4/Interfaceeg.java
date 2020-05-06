interface A
{
 void fun1();
 //private int a=0;
}
interface B
{
void fun1();
}
class Eg
{
int a=9;
}

class Interfaceeg extends Eg implements A,B
{
public void fun1()
{
System.out.println("FUN1 IN INTERFACE 1");
}
 
/*public void fun1()
{
System.out.println("FUN2 IN INTERFACE 2");
}
*/
}