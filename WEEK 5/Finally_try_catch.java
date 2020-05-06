import java.util.*;

class Finally_try_catch
{
public static void main(String args[])
{
Scanner x = new Scanner(System.in);
int a;
/*
labela: for(int i=0;i<1;i++)
{
	*/
try
{
	
System.out.println("ENTER A");
a=x.nextInt();
int result =100;
System.out.println(result = result/a);
}

catch (Exception e)
{
	System.out.println("ERROR IS..........."+e);
}

finally
{
	System.out.println("FINALLY CODE WILL BE executed whether exception occur or not"); 
	System.out.println("ENTER a Value greater than zero");
	//continue labela;
	
}
}
}
//}m

