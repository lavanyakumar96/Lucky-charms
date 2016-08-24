import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
factorial f=new factorial();
System.out.println(f.num(n));
}
public long num(long n)
{
long fact=1;
if(n>1)
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
else
 return 0;
}
}