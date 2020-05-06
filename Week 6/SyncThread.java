class Account 
{
static  int total = 500;

synchronized void deposit(int amount)
{
total = total + amount;
}

synchronized void withdraw(int amount)
{
total = total - amount;
}

}


class ThreadOne extends Thread
{
Account x = new Account();
public void run()
{
	x.deposit(100);
	int a;
System.out.println(a = x.total);
}
}


class ThreadTwo extends Thread
{
Account y = new Account();
public void run()
{
	y.withdraw(200);
	int b;
System.out.println(b= y.total);

}
}


class SyncThread
{
public static void main(String args[])
{
//Account z = new Account();
ThreadOne t1 = new ThreadOne();
ThreadTwo t2 = new ThreadTwo();

t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);



t1.start();

t2.start();
}
}
