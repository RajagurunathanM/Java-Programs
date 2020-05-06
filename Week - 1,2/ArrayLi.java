import java.util.*;

class ArrayLi{
public static void main(String args[])
{
ArrayList <Integer> s=new ArrayList <Integer>();
Scanner g = new Scanner(System.in);
System.out.println("Enter Input");
while(g.hasNextInt())
{
s.add(g.nextInt());
}

for(int i=0;i<s.size();i++)
{
	System.out.println(s.get(i));
}
}
}

