import java.util.*;

class ListIteratorDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
			a.add(i);
		}
		
		ListIterator ir = a.listIterator();
		
		while(ir.hasNext())
		{
			System.out.print(ir.next()+" "+"i is "+ir.nextIndex()+" ");
		}
		
		System.out.println();
		
		while(ir.hasPrevious())
		{
			System.out.print(ir.previous()+" "+"i is "+ir.previousIndex()+" ");
		}
		
		System.out.println();
		
		while(ir.hasNext())
		{
			if((Integer) ir.next() == 4)
			{
				ir.add(99);
			}
		}
		
		System.out.println(a);
		
		while(ir.hasPrevious())
		{
			if((Integer)ir.previous() >= 0)
			{
				ir.set(101);
			}
		}
		
		
		System.out.println(a);
		
		
	}
}