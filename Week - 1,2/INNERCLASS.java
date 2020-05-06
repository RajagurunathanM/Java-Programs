class A
{
int a=5;
class B
{
void display()
{
System.out.print("INNER CLASS");
}
}

}

class INNERCLASS
{
public static void main(String args[])
{
String s="MAIN CLASS";
A.B a = new A().new B();
//B b= a.new B();
a.display();
}
}
