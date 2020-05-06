class Throws
{
public static void main(String args[]) throws ArithmeticException,ArrayIndexOutOfBoundsException
{
try
{
int a=10;
int a1[] = new int[9];
System.out.println(a/0);
System.out.println(a1[19]=90);
}
catch(Exception e)
{
System.out.println("Error is........."+e);
}
}
}