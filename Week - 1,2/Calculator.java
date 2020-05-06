import java.util.*;

class Calculator
{
int add(int x,int y)
{

return x+y;
}
int sub(int x,int y)
{
return x-y;
}
int mul(int x,int y)
{
return x*y;
}
double div(int x,int y)
{
return x/y;
}
int mod(int x,int y)
{
return x%y;
}

public static void main(String args[])
{
Calculator cal=new Calculator();
int a=1,b=1;
System.out.println("WELCOME TO CALCULATOR PROGRAM\n");
System.out.println("1.ADD"+"\n"+"2.SUBTRACT"+"\n"+"3.MULTIPLICATION"+"\n"+"4.DIVISION"+"\n"+"5.MODULO");
int opt;
Scanner scan = new Scanner(System.in);
System.out.print("ENTER YOUR CHOICE "+"\t");
opt=scan.nextInt();

ll: while(opt>0)
{
if(opt<6)
{
if(opt== 1)
{
int add =cal.add(a,b);
System.out.println(add);
}

if(opt== 2){
	int sub=cal.sub(a,b);
System.out.println(sub);
}
if(opt==3)
{
	int mul=cal.mul(a,b);
System.out.println(mul);
}

 if(opt==4)
{
double div=cal.div(a,b);
System.out.println(div);
}

if(opt==5)
{
	int mod=cal.mod(a,b);
System.out.println(mod);

}
}


else{
	System.out.println("YOU ENTER WRONG OPTION, CHOOSE THE RIGHT ONE");
         System.out.println("IF YOU WANT CONTINUE (Y/N)");
		 String ch;
		 ch=scan.next();
		 if(ch=="y")
		 {
			 continue ll;
		 }
		 else{
		 break  ll;
		 }
}
break;
}
}
}



