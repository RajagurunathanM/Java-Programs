import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return -s1.compareTo(s2);
	}
}

class TreeSetDemo4
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("E"));
		t.add(new StringBuffer("F"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("K"));
		
		System.out.println(t);
	}
}