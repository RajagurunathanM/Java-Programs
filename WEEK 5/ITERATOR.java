import java.util.*;

class ITERATOR 
{
public static void main(String args[])
{
List<String> l = new LinkedList<>();
l.add("1");
l.add("2");
l.add("3");


Iterator<String> iter = l.iterator();

for(int j=0;j<l.size();j++)
{
	if(iter.hasnext())
	{
		System.out.println(iter.next());
	}
}

}
}




 