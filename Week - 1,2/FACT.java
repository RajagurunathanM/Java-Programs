import java.util.*;

class FACT
{

int fact(int n)
{
if(n==0 || n==1)
{
return 1;
}
else
{
return n*fact(n-1);
}
}
public static void main(String args[])
{
	FACT f = new FACT();
Scanner x = new Scanner(System.in);
System.out.println("ENTER N");
int n = x.nextInt();
int result=f.fact(n);
System.out.println(result);
}
}
