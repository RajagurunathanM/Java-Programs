import java.util.*;

class IteratorDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=0;i<=7;i++)
		{
			l.add(i);
		}
		
		System.out.println(l);
		
		Iterator i = l.iterator();
		
		while(i.hasNext())
		{
			Integer a = (Integer)i.next();
			
			if( a == 4)
			{
				i.remove();
				continue;
			}
			
			System.out.print(a+" ");
		}
	}
}