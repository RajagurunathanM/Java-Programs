import java.util.*;

class ITERATOR
{
public static void main(String args[])
{
List<String> l = new LinkedList<>();
l.add("hello");
l.add("world");
System.out.println(l);
//ietrator 

Iterator<String> iter = l.iterator();
while(iter.hasNext())
{
	System.out.println(iter.next());
}

iter.remove(); // removes last element in collection
	
System.out.println("AFTER REMOVE FUNCTION"+l);




}
}
