/* to print sum of two numbers which are given by user as an input through the command line argument*/

import java.io.*;
class Add
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a+b;
System.out.println("add sum="+c);
}
}
