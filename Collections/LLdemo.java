import java.util.*;

class LLdemo
{
	public static void main(String args[])
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addLast(5);
		l.addLast(6);
		l.addLast(7);
		l.addLast(8);
		//l.addLast(1000);
		//l.removeFirst();
		//l.removeLast();
		
		//System.out.println(l.getFirst()+" "+l.getLast()+" "+l.getFirst()+" "+l.getLast());
		
		/*while(l.size()>0)
		{
			System.out.print(l.getFirst()+" "+l.getLast()+" ");
			l.removeFirst();
			l.removeLast();
		}*/
		
		
		System.out.println(l.get(6));
		l.add(0,99);
		l.set(1,888);
		System.out.println(l);
	}
}