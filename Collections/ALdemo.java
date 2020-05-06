import java.util.*;

class ALdemo
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(0,6);
		l.add(1);
		
		l.remove(0);
		l.set(0,5555);
		
		List<Integer> l2 = new ArrayList<Integer>(l);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		
		ListIterator z = l.listIterator();
		
		while(z.hasNext())
		{
			Integer y = (Integer)z.next();
			System.out.print(y+" ");
		}
		
		
		
		//l2.removeAll(l2);
		//l2.clear();
		
		/*Object[] obj = l.toArray();
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.print(obj[i]+" ");
		}
		
		System.out.println();*/
		
		
		
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.indexOf(1));
		System.out.println(l.lastIndexOf(1));
		System.out.println(l2);
		//System.out.println(l.isEmpty());
		//System.out.println(l.contains(4));
		//System.out.println("SIZE IS "+l.size());
		
		
	}
}
