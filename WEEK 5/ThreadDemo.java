import java.util.*;
import java.io.*;

class Mythread extends Thread
{
public  void run()
{
for(int i=0;i<10;i++)
{
System.out,println("CHILD THREAD");;
}
}
}


class ThreadDemo
{
public static void main(String args[])
{
Mythread t = new Mythread();
t.start();
for(int i=0;i<10;i++)
{
System.out.println("MAIN THREAD");
}
}
}
