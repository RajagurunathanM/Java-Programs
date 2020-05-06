import java.lang.*;

class Aclass implements Cloneable
{
Aclass()
{
System.out.println("ACLASS CONSTRUTOR");
}


public Object clone() throws CloneNotSupportedException
{
	System.out.println("CLONABLE OBJECT CONSTRUCTOR");
	
return super.clone();
}


public static void main(String a[])
{
try
{
Aclass obj1 = new Aclass();
Aclass obj2= (Aclass)obj1.clone();
Aclass obj3 = (Aclass)obj1.clone();
}
catch(CloneNotSupportedException c)
{}
}
}