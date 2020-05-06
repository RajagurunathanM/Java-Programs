import java.util.*;

class ArrayDemo
{
	static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static int[] copy(int[] a)
	{
		int[] cl = a.clone();
		
		return cl;
	}
	public static void main(String args[])
	{
		System.out.println("Enter size");
		int n = x.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
		
		print(a);
		
		int[] cl = copy(a);
		
		print(cl);
		
		//search(a);
	}
}
