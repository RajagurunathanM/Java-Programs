import java.util.*;

class TreeMapDemo1
{
	public static void main(String args[])
	{
		TreeMap<Integer,Integer> mp = new TreeMap<Integer,Integer>();
		
		mp.put(55,5);
		mp.put(44,4);
		mp.put(33,3);
		mp.put(22,2);
		mp.put(11,1);
		
		System.out.println(mp.firstKey());
		System.out.println(mp.lastKey());
		
		System.out.println(mp.headMap(33));
		System.out.println(mp.tailMap(33));
		
		System.out.println(mp.subMap(11,55));
		
		//System.out.println(mp);
		
	}
}