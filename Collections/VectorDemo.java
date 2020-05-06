import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector(100);
		//v.addElement(0);
		//v.removeElement(0);
		v.add(2);
		v.add("anand");
		v.add('*');
		v.add(2.5);
		v.add(9.88888);
		System.out.println(v);
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		
		/*System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(0));*/
		
		
	}
}
