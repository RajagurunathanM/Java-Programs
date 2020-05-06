class A1 
{
static int total =500;

synchronized void deposit(int amount)
{
total = total+amount;

}


synchronized void withdraw(int amount)
{
total = total-amount;

}
}

class DEPOSITTHREAD extends Thread
{
A1 a = new A1();
public void run()
{
	int temp;
a.deposit(100);
System.out.println(temp=a.total);
}
}


class WITHDRAWTHREAD extends Thread
{
A1 a = new A1();
public void run()
{
	int temp1;
a.withdraw(200);
System.out.println(temp1=a.total);
}
}

class ThreadSync 
{
public static void main(String args[])
{
A1 a = new A1();
DEPOSITTHREAD t1 = new DEPOSITTHREAD();
WITHDRAWTHREAD t2 = new WITHDRAWTHREAD();
t1.start();
t2.start();
}
}



