import java.util.*;

class QueueDemo
{
	public static void main(String args[])
	{
		Queue<Integer> q = new LinkedList<Integer>();
		//q.remove();
		//q.element();
		
		q.offer(1);
		q.offer(2);
		
		System.out.println(q);
		
		q.poll();
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
	}
}