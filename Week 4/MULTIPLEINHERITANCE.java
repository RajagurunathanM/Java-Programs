interface interface1
{
void fun();

}

interface interface2
{
void fun();

}

class MULTIPLE implements interface1,interface2
{
public void fun()
{
System.out.println("MULTIPLE INHERITANCE ALLOWED THROUGH INTERFACES");
}









}

class MULTIPLEINHERITANCE 
{
public static void main(String args[])
{

MULTIPLE mobj = new MULTIPLE();

mobj.fun();


}
}





