import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer a = (Integer)o1;
		Integer b = (Integer)o2;
		
		if(a < b)
		{
			return 5;
		}
		else if(a > b)
		{
			return -5;
		}
		else
		{
			return 0;
		}
	}
}

class ComparatorDemo
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(8);
		t.add(-1);
		t.add(0);
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(100);
		t.add(999);
		
		System.out.println(t);
	}
}