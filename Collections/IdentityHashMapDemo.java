import java.util.*;

class IdentityHashMapDemo
{
	public static void main(String args[])
	{
		IdentityHashMap<Integer,Integer> mp = new IdentityHashMap<Integer,Integer>();
		
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		
		mp.put(a,5);
		mp.put(b,1000);
		
		System.out.println(mp);
	}
}