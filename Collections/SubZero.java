import java.util.*;
import java.lang.*;
import java.io.*;

class SubZero 
{
	static void check(ArrayList<Integer> a,int n)
	{
		if(a.contains(0))
		{
			System.out.println("YES");
		}
		
	}
	
	public static void main (String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++)
			{
				a.add(x.nextInt());
			}
			
			check(a,n);
			
			t--;
		}
		
		
	}
}