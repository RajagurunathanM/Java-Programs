import java.util.*;

class TreeSetDemo1
{
	public static void main(String args[])
	{
		TreeSet a = new TreeSet();
		
		//a.add(null); // null not aplicable eventhough atFirst from 1.7 version  .NullPointerException
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(4);
		a.add(1);
		//a.add("bb"); //ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//a.add(null); //.NullPointerException
		
		System.out.println(a);
	}
}