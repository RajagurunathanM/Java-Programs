import java.util.*;

class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add("B");
		h.add("C");
		h.add(null);
		h.add(null);
		h.addAll(11,12);
		
		System.out.println(h.size());
		
		System.out.println(h);
	}
}