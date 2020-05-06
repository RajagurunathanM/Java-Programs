import java.util.*;



class FIB
{
	
	static int fibi(int x)
{
if(x<=1)
{
return x;
}
return fibi(x-1)+fibi(x-2);
}


public static void main(String args[])
{
	FIB f = new FIB();
Scanner x = new Scanner(System.in);
System.out.println("ENTER N ");
int n=x.nextInt();
System.out.println("THE FACTORIAL VALUE OF 1 IS 0");
System.out.println("THE FACTORIAL VALUE OF 2 IS 1");

for(int i=3;i<=n;i++)
{
	int result=f.fibi(i);
System.out.println("THE FACTORIAL VALUE OF "+i+" IS "+result);
}
}
}




