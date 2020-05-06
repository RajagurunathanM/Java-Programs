import java.util.*;

class HashMapDemo3
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		
		hp.put(1,"raja");
		hp.put(2,"guru");
		hp.put(3,"nathan");
		
		/*HashMap<Integer,String> kp = new HashMap<Integer,String>();
		kp.putAll(hp);
		
		System.out.println(kp);*/
		
		//hp.remove(1);
		
		//System.out.println(hp.containsKey(1));
		//System.out.println(hp.containsValue("raja"));
		
		/*Set k = hp.keySet();
		Collection v = hp.values();
		
		System.out.println(k);
		System.out.println(v);*/
		
		Set s = hp.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
			
			if(m.getKey() == (Integer)2)
			{
				m.setValue("anand");
			}
		}
		
		
		
		System.out.println(hp);
	}
}
		