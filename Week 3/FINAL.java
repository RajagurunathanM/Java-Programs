class FINAL
{
	
	final int  print(int a)
{
	return a;
}

public static void main(String args[])
{
FINAL f = new FINAL();
final int a= 1;
System.out.println(a);

int result=f.print(5);
System.out.println(++result);



}
}
