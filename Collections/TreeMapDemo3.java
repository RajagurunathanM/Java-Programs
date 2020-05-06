import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 = new String(String.valueOf(o1));
		String s2 = new String(String.valueOf(o2));
		
		return s2.compareTo(s1);
		
	}
	
}

class TreeMapDemo3
{
	public static void main(String args[])
	{
		TreeMap mp = new TreeMap(new MyComparator());
		
		mp.put(new StringBuffer("a"),11);
		mp.put(new StringBuffer("raj"),12);
		mp.put(new StringBuffer("anand"),13);
		mp.put(new StringBuffer("guru"),14);
		
		System.out.println(mp);
	}
}