import java.util.*;

class CursorDemo
{
	public static void main(String args[])
	{
		Stack<Integer> v = new Stack<Integer>();
		for(int i=0;i<=10;i++)
		{
			v.push(i);
		}
		
		Enumeration e = v.elements();
		Iterator i = v.iterator();
		ListIterator l = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(l.getClass().getName());
	}
}