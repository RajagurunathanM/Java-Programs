import java.util.*;

class WeakHashMapDemo
{
	public static void main(String args[])
	{
		WeakHashMap<Integer,Integer> mp = new WeakHashMap<Integer,Integer>();
		
		Integer a = new Integer(1);
		
		mp.put(a,100);
		
		a = null;
		
		System.out.println(mp);
		
		System.gc();
		
		System.out.println(mp);
	}
}