/*simple try catch block
 1.divide by zero
 2.diff by zero
 3.input mismatch
 4.input mismatch // enhanced
 */

import java.util.*;
import java.io.*;
class TryCatch
{
	/*int divide(int a,int b)   //ArithmeticException
	{
		int c=1;
		try{
			c=a/b;
			
		
		}
		catch (Exception e)
		{
			System.out.println("ERROR IS..........."+e);
		}
		return  c;
	}
	*/
	
	/*void diff(int a,int b)   //ArithmeticException
	{
		try
		{
		int c=0;
		System.out.println((a+b)/c);
		}
		catch (Exception e)
		{
			System.out.println("ERROR IS..........."+e);
		}
		
			
	}
	*/
	 public static void main(String args[])
	 {
		 TryCatch obj = new TryCatch();
		 //System.out.println(obj.divide(1,1));
		 //obj.diff(2,5);
		 int valid=0,invalid=0;
		 int f ;
		 try{
			 
		 for(int i=0;i<args.length;i++)
		 {
			f = Integer.parseInt(args[i]);
			System.out.println(args[i]);
		 }
		 }
		 catch (Exception e)
		{
			System.out.println("ERROR IS..........."+e);
			invalid++;
			System.out.println(" invalid "+invalid);
		}
		valid++;
		System.out.println(" valid "+valid);
		
		 
		 
	 }
}
		 