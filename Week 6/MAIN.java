class BankAccount
{
int Balance = 1000;

void withdraw(int am)
{
Balance = Balance - am;
System.out.println("Balance is "+Balance);
}

void deposit(int am)
{
Balance = Balance + am;
System.out.println("Balance is "+Balance);
}
}


class ThreadDep implements Runnable
{
BankAccount obj1;
int amount;
ThreadDep(BankAccount y,int amount)
{
	
y = obj1;
this.amount = amount;
new Thread(this).start();
}	
public void run() 
{
	try
	{
obj1.deposit(amount);
}
catch(Exception e){}	

}
}


class ThreadWithDraw implements Runnable
{
BankAccount obj2;
int amount;
ThreadWithDraw(BankAccount x,int amount)
{
	
x = obj2;
this.amount = amount;
new Thread(this).start();
	
}
public void run() 
{ 
try{
obj2.withdraw(amount);
}
	catch(Exception e){}
}
}



class MAIN
{
public static void main(String args[])
{
BankAccount bobj = new BankAccount();

Thread t1 = new Thread(new ThreadDep(bobj,100));
Thread t2 = new Thread( new ThreadWithDraw(bobj,200));

t1.start();
t2.start();
}
}