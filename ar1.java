import java.io.*;
import java.util.*;
class ar1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x[]=new int[n];
for(int i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
for(int j=0;j<x.length;j++)
{
for(int k=j+1;k<x.length;k++)
{
if(x[j]==x[k])
{
System.out.println(x[j]);
break;
}
}
}
}
}
