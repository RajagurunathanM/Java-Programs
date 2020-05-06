class Nested_try_catch
{
public static void main(String args[])
{

try                  
   //ArithmeticException
{

int a;
System.out.println(a =25/0);    


try{
int[] ar = new int[4];
System.out.println(ar[9]=16);  //ArrayIndexOutOfBoundsException
}
catch(Exception e)
{
System.out.println("ERROR IS ..........."+e);
}

}
catch(Exception e)
{
System.out.println("ERROR is ...................."+e);
}


}
}


