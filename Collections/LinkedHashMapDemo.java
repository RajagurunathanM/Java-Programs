import java.util.*;

class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,Integer> hp = new LinkedHashMap<Integer,Integer>();
		
		hp.put(1,5);
		hp.put(2,10);
		hp.put(3,15);
		
		System.out.println(hp);
		
		Set s = hp.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}
}
		