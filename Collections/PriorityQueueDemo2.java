import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s2.compareTo(s1);
	}
	
}
		
		


class PriorityQueueDemo2
{
	public static void main(String args[])
	{
		PriorityQueue q = new PriorityQueue(12,new MyComparator());
		
		q.add("a");
		q.add("abc");
		q.add("df");
		q.add("z");
		q.add("erty");
		
		System.out.println(q);
		
	}
}