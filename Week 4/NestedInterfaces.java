interface A
{
int a=9;
interface interf{//nested interfaces
void m1();
}
}


class NestedInterfaces implements A.interf{//nested interface implementation

public void m1()
{
System.out.println("M1 FUNCTION IN INTERFACES");
}

public static void main(String args[])
{

A.interf obj = new NestedInterfaces();//downcating
obj.m1();
}
}