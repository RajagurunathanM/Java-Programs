class GCD
{
	int gcd(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return b;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	
public static void main(String args[])
{
GCD g = new GCD();
int result= g.gcd(36,60);
System.out.println("RESULT IS "+result);

}
}

