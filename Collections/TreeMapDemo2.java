import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer a = (Integer)o1;
		Integer b = (Integer)o2;
		
		return b.compareTo(a);
	}
}



class TreeMapDemo2
{
	public static void main(String args[])
	{
		TreeMap<Integer,Integer> mp = new TreeMap<Integer,Integer>(new MyComparator());
		
		mp.put(11,1);
		mp.put(22,2);
		mp.put(33,3);
		mp.put(44,4);
		mp.put(55,5);
		
		System.out.println(mp);
	}
}