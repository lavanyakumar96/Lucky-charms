import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String sb=sc.nextLine();
StringBuffer sb1=new StringBuffer(sb);
sb1=sb1.reverse();
System.out.println(sb1);
}
}