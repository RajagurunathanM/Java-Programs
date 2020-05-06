class A
{
	int a=1;
	void a()
{

System.out.println("CLASS A"+a);
}



static class B
{
	
static int b=1;
static void b()
{

System.out.println("INNER CLASS B"+b);
}
 static class C
{
    static int c=1;
	static void c()
{

System.out.println("INNER CLASS C"+b+c);
}
}
}

}

class Nested
{
public static void main(String args[])
{
A x1 = new A();
A.B.C x2=x1.new B().new C();


x1.a();
x2.b();
x2.c();


}
}

