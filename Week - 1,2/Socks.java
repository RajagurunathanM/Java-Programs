import java.util.*;

class Socks
{
public static void main(String args[])
{
int a[],count=0;
a[]=new int[]{1,2,1,2,3,3,4,5};
for(int i=0;i<a.length;i++)
{
for(int j=i;j<a.length;j++)
{
if(a[i]==a[j])
{
count=count+1;
}
}
}
system.out.println(count+" pairs");
}
}
