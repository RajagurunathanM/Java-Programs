interface interfaces1
{
void m1();
}
interface interfaces2 extends interfaces1{
void m2();
}

class interfaceSinglenheritance implements interfaces2
{
public void m1()
{
System.out.println("M1 FUNCTIOn");
}

public void m2()
{
System.out.println("M2 FUNCTIOn");
}

public static void main(String args[])
{
interfaces2 obj = new interfaceSinglenheritance();
obj.m1();
obj.m2();
}
}