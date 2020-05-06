import mypackages.*;
import mypackages2.*;


class Pack 
{
public static void main(String args[])
{
mypackages.All a = new mypackages.All();

mypackages2.All b = new mypackages2.All();



System.out.println(a.x);
a.x1();


System.out.println(b.y);
b.y2();
}
}
