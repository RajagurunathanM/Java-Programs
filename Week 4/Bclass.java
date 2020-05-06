import java.util.*;


class Bclass implements Comparable<Bclass>
{
	int a,b;
	
	Bclass(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public int compareTo(Bclass ox)
	{
		if( a == ox.a) return 0;
		else if(a > ox.a) return 1; // descending order <
		else return -1;
	}
}
	
	