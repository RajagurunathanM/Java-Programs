class A2
{
void p()
{
System.out.println("A2 CLASS");
}
}


class B2 extends A2
{
void p(A2 b)
{
B2 bobj = (B2) a2;
if(bobj instanceof B2)
{
System.out.println("DOWNCASTING SUCCESSFUL");
}
System.out.println("B2 CLASS");
}

}


class Downcasting 
{
public static void main(String args[])
{
Downcasting d = new Downcasting();
A2 b = new B2();
b.p(b);
System.out.println(b instanceof A2);

}
}
