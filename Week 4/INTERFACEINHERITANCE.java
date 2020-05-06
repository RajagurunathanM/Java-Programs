interface Dog
{
void bark();
}

interface GermenSheperd extends Dog
{
void shout();
}


class INTERFACEINHERITANCE implements GermenSheperd
{
public void bark()
{
System.out.println("DOG BARKS");
}

public void shout()
{
System.out.println("GermenSheperd Shouts");
}


public static void main(String args[])
{

GermenSheperd obj = new INTERFACEINHERITANCE();
obj.bark();
obj.shout();
}
}

