class Multierror_Singlecatch
{
public static void main(String args[])
{
int ar[] = new int[10];
int a=100;
for(int i=0;i<3;i++)
{
	try{
		
switch(i)
{
case 0: System.out.println((a/0));
 break;
 
 case 1: System.out.println(ar[19] = 98);
 break;
 
 case 2: int[] a1 = null;
 int k=0;
System.out.println(k = a1[0]);
 break;
 
 }
	}
	catch(Exception e)
	{
		//System.out.println(e.getMessage());
		System.out.println("ERROR IS .............."+e);
	}
 }
 }
 }
 
 