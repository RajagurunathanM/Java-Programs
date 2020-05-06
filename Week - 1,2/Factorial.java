class Factorial
{
int n;
int fact(int n)
{
	if(n==0)
	{
		return 1;
	}
	else
	{
		return fact(n*(n-1));
		
	}
}
	
public static void main(String args[])
{
Factorial f = new Factorial();
int n=Integer.parseInt(args[0]);

System.out.println("FACTORIAL OF "+n+" IS "+f.fact(n));
}
}


