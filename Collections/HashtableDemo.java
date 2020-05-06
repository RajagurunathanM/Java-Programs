import java.util.*;

class HashtableDemo
{
	public static void main(String args[])
	{
		Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
		h.put('a',100);
		h.put('b',200);
		h.put('c',300);
		h.put('d',400);
		h.put('e',500);
		
		System.out.println(h);
		
	}
}