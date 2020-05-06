import java.util.*;

class ArrayL
{
public static void main(String args[])
{
ArrayList <Integer> a= new ArrayList<Integer>();
Scanner x =new Scanner(System.in);

System.out.println("ENTER VALUES FOR ARRAY (stop the scanner using ctrl+z ");

while(x.hasNextInt())
{
a.add(x.nextInt());
}

System.out.println(a);

}
}
