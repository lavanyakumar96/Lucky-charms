import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long fact=1;
long n=sc.nextLong();
if(n>1)
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
}
System.out.println(" the factorial is" +fact);
}
}
