import java.io.*;
import java.util.*;
class index
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
if(x[j]==j)
{
System.out.println(x[j]+" "+j);
}
}
}
}
