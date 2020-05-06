class OwnException extends Exception
{
static int total =0;
OwnException(String m)
{
super(m);
}

void deposit(int a) throws OwnException
{
	try{
		
	if(a<0) throw new OwnException("Deposit amount can't be in negative");
	{
total= total+a;
System.out.println("AFTER DEPOSITION OUTSTANDING MONEY IS"+total);
	}
	}
	catch(OwnException e)
	{
		System.out.println("ERROR IS..........."+e);
	}
}

void withdraw(int a) throws OwnException
{
try
{

if(a>total) throw new OwnException("AMOUNT IS LOW ");
{

total = total-a;
System.out.println("AFTER WITHDRAWAL OUTSTANDING MONEY IS"+total);
}
}
catch(OwnException e)
{
System.out.println("ERROR IS............."+e);
}
}
}

class A  
{
public static void main(String args[])
{
OwnException obj = new OwnException("");
try{
obj.deposit(-1000);

obj.withdraw(1800);
}
catch(OwnException e)
{
	System.out.println(e.getMessage());
	e.printStackTrace();
	
	
}
finally
{
	System.out.println("IF EXCEPTION OCCURS BECAUSE OF NEGATIVE DEPOSIT VALUE AND LOW BALANCE WHILE WITHDRAWING ");
}

}
}



























