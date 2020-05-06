import java.util.*;

class HashtableDemo2
{
	public static void main(String arg[])
	{
		Hashtable h = new Hashtable(5);
		h.put(new Temp(11),11);
		h.put(new Temp(12),12);
		h.put(new Temp(13),13);
		h.put(new Temp(14),14);
		h.put(new Temp(15),15);
		
		System.out.println(h);
	}
}

class Temp
{
	int i;
	
	Temp(int d)
	{
		this.i = d;
	}
	
	public int hashCode()
	{
		return i;
	}
	
	public String toString()
	{
		return i+"";
	}
	
}
	
	
	
	
	
	
	