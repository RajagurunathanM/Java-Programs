/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner x = new Scanner(System.in);
	    int t;
		System.out.println("ENTER NO.OF TEST CASES");
	    t=x.nextInt();
	    int count=0;
	    
	    for(int i=0;i<t;i++)
	    {
	        int n;
			System.out.println("ENTER SIZE OF THE ARRAY");
	        n=x.nextInt();
	        int array[] = new int[n];
			for(int k=0;k<array.length;k++)
			{
				System.out.println("ENTER array["+k+"]");
				array[k]=x.nextInt();
			}
			
	        int k;
			System.out.println("ENTER KEY VALUE");
			
	        k=x.nextInt();
	        
	        for(int j=0;j<array.length;j++)
	        {
	            if(k==array[j])
	            {
	                count=count+1;
	            }
	        }
	        System.out.println(count);
	    }
	    
		
	}
}