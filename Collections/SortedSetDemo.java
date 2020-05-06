import java.util.*;

class SortedSetDemo
{
	public static void main(String args[])
	{
		SortedSet<Integer> a = new TreeSet<Integer>();
		
		a.add(6);
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);
		
		System.out.println(a);
		System.out.println(a.first());
		System.out.println(a.last());
		System.out.println(a.headSet(3));
		System.out.println(a.tailSet(3));
		System.out.println(a.subSet(2,5));
	}
}