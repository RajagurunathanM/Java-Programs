class Scope
{
    static int a=1;
    static void  increment()
	{
		System.out.println(++a);
	}
	public static void main(String args[])
	{
		
		increment();
		increment();
		increment();
		increment();
	}
}

		
		
		