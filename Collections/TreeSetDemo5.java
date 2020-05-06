import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		
		if(s1.length() < s2.length())
		{
			return -1;
		}
		else if(s1.length() > s2.length())
		{
			return 1;
		}
		else
		{
			return s1.compareTo(s2);
		}

	}
	
}


class TreeSetDemo5
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("XX"));
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("Anbu"));
		t.add(new StringBuffer("Arivu"));
		t.add(new StringBuffer("Anand"));
		t.add("bhuvi");
		t.add("dhoni");
		
		System.out.println(t);
	}
}