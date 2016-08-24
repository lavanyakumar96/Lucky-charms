import java.io.*;
import java.util.*;
class digit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
digit d=new digit();
System.out.println(d.num(n));
}
public long num(long n)
{
long rev=0,a;
while(n>0)
{
a=n%10;
rev=(rev*10)+a;;
n=n/10;
}
return rev;
}
}