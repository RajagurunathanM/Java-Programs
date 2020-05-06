import java.util.*;

/*
Compile time errors


class CompilErros
{
Public int a=0;
Public void display()
{
System.out.println(a)
}
}

*/

class RunErrors
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int a;
		System.out.println("ENTER a");
		a = x.nextInt();
		//RE:  ArithmeticExceptionint b= a/0; 
		
		int[] ar = new int[20];
		//RE:  ArrayIndexOutOfBoundsException     ar[20]=2; //e2
		
		for(String f:args)
		{
		//int f = (int) args[i];
		System.out.println(f);
		}
	}
}
		