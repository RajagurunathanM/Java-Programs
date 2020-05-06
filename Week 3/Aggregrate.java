class Base
{
int a=9;
int b=0;
}

class Aggregrate
{
Base bobj;

 Base bobj= new Base();
void p()
{
System.out.println(a+b);
}

public static void main(String args[])
{
Aggregrate ax = new Aggregrate();
bobj.p();
}
}


