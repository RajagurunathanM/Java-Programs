import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer a = (Integer)o1;
		Integer b = (Integer)o2;
		
		//return a.compareTo(b);
		//return  - a.compareTo(b);
		//return  - b.compareTo(a);
		//return   b.compareTo(a);
		//return   1;
		//return   -1;
		return   0;
	}
}


class TreeSetDemo3
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(1);
		t.add(9);
		t.add(0);
		
		System.out.println(t);
	}
}