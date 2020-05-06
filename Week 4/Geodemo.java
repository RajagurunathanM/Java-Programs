import myshapes.*;

class Geodemo
{
public static void main(String args[])
{
Geometry obj[] = new Geometry[2];
double result=obj[0].area() + obj[1].area() + obj[2].area();
System.out.println("RESULT IS "+result);
}
}
