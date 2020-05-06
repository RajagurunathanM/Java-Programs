abstract class Shape
{
	Shape()
	{
		System.out.println("ABSTRACT CLASS CONSTRUCTOR");
	}
 double r=2.0;
abstract double area();
abstract double circumference();
static int x=10;
static void fun1()
{
	System.out.println(x++);
}

}

class circle extends Shape
{
	double area=0;
	
	double circumference=0;
	
	double area()
	{
		return area=2*r;
	}
	
	double circumference()
	{
		return circumference=2*r*r;
	}
	
}

class rectangle extends Shape
{
	double area=0;
	double circumference=0;
	double area()
	{
		return area=2*r;
	}
	
	double circumference()
	{
		return circumference=2*r*r;
	}
}




class Abstractclass
{
	void display(double d1,double d2)
	{
		
		System.out.println("AREA is "+d1+" " +"Circumference is "+d2);
	}
	public static void main(String a[])
	{
		Abstractclass x = new Abstractclass();
		Shape obj[] = new Shape[2];
		//Shape obj1= new circle();
		obj[0]= new circle();
		obj[1]= new rectangle();
		
		for(int i=0;i<=1;i++)
		{
			System.out.println("OBJECT NO. "+i);
			x.display(obj[i].area(),obj[i].circumference());  //dynamic binding
			
		}
		
		/*
		obj1.area();
		obj1.circumference();
		
		obj2.area();
		obj2.circumference();
		obj1.fun1();
		obj2.fun1();
		*/
		
	}
}
		