import.java.lang.*;

class Aclass implements Clonable
{
Aclass()
{
System.out.println("ACLASS CONSTRUTOR");
}


public Object clone() throws CloneNoteSupprotException
{
super.clone();
}


publci static void main(String a[])
{
try
{
Aclass obj1 = new Aclass();
Aclass = (Aclass)obj1.clone();
}
catch(CloneNoteSupprotException c)
{}
}
}