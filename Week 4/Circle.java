package myshapes;

import java.util.*;


class Circle extends Geometry
{
public double radius;
	
public double area()
{
return (Math.PI*(radius*radius));
}
	
double circumference()
{
return (2*Math.PI*radius);
}



public Circle()
{
radius=0.0;
}

public Circle(double r)
{
radius=r;
}

}


