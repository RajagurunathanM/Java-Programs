import java.util.*;

class Comparator1
{
public static void main(String a[])
	{
		ArrayList<Bclass> ar = new ArrayList<Bclass>();
		ar.add(new Bclass(5,2));
		ar.add(new Bclass(3,4));
		Collections.sort(ar);
		for(Bclass f : ar)
		{
			System.out.println(f.a+" "+f.b);
		}
	}
}
	