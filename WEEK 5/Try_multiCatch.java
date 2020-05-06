class Try_multiCatch
{
	public static void main(String args[])
	{
		int a=0,b=0;
		int[] ar = new int[5];
		try
		{
			
		int x=8;
		//a= x/0;/// one by one exception will be throws to the console....
		ar[9]=88;
	    
		}
		catch (ArithmeticException e)
		{
			//System.out.println(e.getCause());
			//System.out.println("Error is ........................"+e);
			
			System.out.println(e.fillInStackTrace());
			
		}
		catch (Exception e)
		{
			//System.out.println(e.getCause());
			//System.out.println("Error is ........................"+e);
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		
		//System.out.println(a);
	}
}