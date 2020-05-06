import java.util.*;

class armstrong
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER N");
		int n=x.nextInt();
		int temp=0,result=n;
		if(n>0)
		{
			int c1=n%10;
			System.out.println("c1 is"+c1);
			int c2=(n/10)%10;
			System.out.println("c2 is"+c2);
			int c3=n/100;
			System.out.println("c3 is"+c3);
			 temp=(c1*c1*c1)+(c2*c2*c2)+(c3*c3*c3);
			 System.out.println("Temp value is"+temp);
		}
		
			
		
		
		if(temp==result)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
}