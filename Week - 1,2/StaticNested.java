class A
{
	static int a=1;
	static void a()
{

System.out.println("CLASS A"+a);
}



static class B
{
	
static int b=1;
static void b()
{

System.out.println("INNER CLASS B"+a+b);
}
 static class C
{
	static int c=1;
	static void c()
{

System.out.println("INNER CLASS C"+a+b+c);
}
}
}

}

class StaticNested
{
public static void main(String args[])
{
A.B.C x= new A().new B().new C();

x.a();


}
}

