import java.util.*;

class HashSetDemo
{
	public static void main(String args[])
	{
		ArrayList a = new ArrayList();
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		
		
		HashSet h = new HashSet(a);
		h.add(1);
		h.add(1);
		h.add(1);
		h.add(1);
		h.add("B");
		h.add("C");
		h.add(null);
		h.add(null);
		
		System.out.println(h);
	}
}