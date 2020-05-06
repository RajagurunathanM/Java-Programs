class StaticMethod
{
static int x=1;
static int inc()
{
 return ++x;
}
public static void main(String args[])
{
StaticMethod s1= new StaticMethod();
System.out.println(s1.inc());
StaticMethod s2=new StaticMethod();
System.out.println(s2.inc());
StaticMethod s3=new StaticMethod();
System.out.println(s3.inc());

System.out.println(s1.inc()+" "+s2.inc()+" "+s3.inc());
System.out.println(s1.x);
}
}
