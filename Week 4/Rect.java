package myshapes;

class Rect extends Geometry
{
double length;
double width;

public Rect()
{
length=0.0;
width=0.0;
}

public Rect(double l,double w)
{
length=l;
width=w;
}

public double area()
{
return length*width;
}


double circumference()
{
return 2*(length+width);
}

}


