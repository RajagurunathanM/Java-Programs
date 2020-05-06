import java.util.*;

class PriorityQueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue p = new PriorityQueue();
		p.offer(1);
		p.offer(2);
		p.offer(3);
		
		System.out.println(p);
		System.out.println(p.peek());
		p.poll();
		System.out.println(p);
	}
}