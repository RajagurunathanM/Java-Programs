class throw_block extends Exception
{
throw_block(String message)
{
super(message);
}

public static void main(String args[])
{
try
{

int a=10;
//if(a>10) throw new throw_block("SAMPLE THROW");
if(a == 10) throw new throw_block("I DONT LIKE a = 10");

}
catch (throw_block e)
{
System.out.println("ERROR IS ................."+e);
//throw e;
}
finally
{
System.out.println("IT ALWAYS EXECUTES");
}
}
}