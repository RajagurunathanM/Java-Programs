import java.util.*;

class StackArray
{
	static int top = -1;
	static int size = 10;
	int[] a = new int[size];
	
	boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		
		return false;
	}
	
	/*void push();
	void pop();
	boolean isFull();
	int top();*/
	
	
	public static void main(String args[])
	{
		StackArray st = new StackArray();
		
		System.out.println( st.isEmpty() );
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	