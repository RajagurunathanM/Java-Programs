import java.lang.*;

class Circle
{
double x,y,r;
Circle(double x,double y,double r)
{
	System.out.println("CONSTRUCTOR CREATED");
	this.x=x;this.y=y;this.r=r;
}

Circle(double r)
{
	this(1.2,2.3,r); 
}

Circle(Circle z)
{
	this(1.2,2.3,3.4);
}

	

double area()
{
return Math.PI*r*r;
}
double perimeter()
{
return 2*Math.PI*r;
}
}


class encapsulation 
{
public static void main(String args[])
{
Circle c =new Circle(2.1,2.1,5.9);
Circle c1=new Circle(3.12);
Circle c2=new Circle(c);

System.out.println("AREA c IS"+c.area());
System.out.println("AREA c IS"+c.perimeter());

System.out.println("AREA c IS"+c1.area());
System.out.println("AREA c IS"+c1.perimeter());

System.out.println("AREA c IS"+c2.area());
System.out.println("AREA c IS"+c2.perimeter());

}
}

