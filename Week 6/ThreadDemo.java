import java.util.*;
import java.io.*;

class Mythread extends Thread
{
public  void run()       // definig thread
{
for(int i=0;i<10;i++)          // child THread  job
{
System.out.println("CHILD 1 THREAD ");;
}
}
}


class Mythread21 extends Thread
{
public  void run()       // definig thread
{
for(int i=0;i<10;i++)          // child THread  job
{
System.out.println("CHILD 2 THREAD");;
}
}
}


class ThreadDemo
{
public static void main(String args[])
{
Mythread t = new Mythread();// thread creation
Mythread21 t21 = new Mythread21();

t.start();
t21.start();           //thread started
for(int i=0;i<10;i++)//main thread
{
System.out.println("MAIN THREAD");
}
System.out.println("MULTIPLE threading occured");
}
}
// this program contains two threads(Main and Child)