import java.util.*;

class HashMapDemo
{
	public static void main(String args[])
	{
		char c = 'a';
		HashMap<Integer,Character> h = new HashMap<Integer,Character>();
		
		for(int i=0;i<5;i++)
		{
			h.put(i,c++);
		}
		
		System.out.println(h);
		
		h.remove(1);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		System.out.println(h.containsKey(2));
		System.out.println(h.containsValue('c'));
		
		Set s = h.entrySet();
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry e = (Map.Entry)itr.next();
			System.out.println(e.getKey()+"...."+e.getValue());
		}
		
		Iterator itr1 = s.iterator();
		
		Map.Entry m = (Map.Entry)itr1.next();
		m.setValue('z');
		
		System.out.println(h);
		
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		
	}
}
		
		
		
		
		