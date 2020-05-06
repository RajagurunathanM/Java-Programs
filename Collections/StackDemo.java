import java.util.*;

class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		System.out.println(s.search(1));
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.empty());
	}
}