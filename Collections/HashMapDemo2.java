import java.util.*;

class HashMapDemo2
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		Scanner x = new Scanner(System.in);
		
		h.put(100,11);
		
		for(int i = 0;i<5;i++)
		{
			Set s = h.entrySet();
			Iterator itr = s.iterator();
			Map.Entry m = (Map.Entry)itr.next();
			
			
			h.put(1,x.nextInt());
			
			if(h.containsKey(i))
			{
				h.put(1,h.get(m.getKey())+2);
			}
			
		}
		
		System.out.println(h);
	}
}
		

