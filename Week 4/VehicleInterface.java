interface Vehicles
{
int speed = 140;
void accerlation();
void breaks();
}

class bike implements Vehicles
{
public void accerlation()
{
System.out.println("BIKE ACCELERATED AND SPEED IS "+speed);
}
public void breaks()
{
System.out.println("BREAK IS PRESSED");
}
}

class VehicleInterface
{
public static void main(String args[])
{
Vehicles obj = new bike();
Vehicles v;
v=obj;
v.accerlation();
v.breaks();
}
}
