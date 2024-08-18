/*4. Write a Calculator program : Include all calculator operations in as classes in a Package
“Calculator” and import in to main class.*/

import java.util.Scanner;
import calculator.add4;
import calculator.sub4;
import calculator.mul4;
import calculator.div4;

public class calp4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers to add:");
float a=sc.nextFloat();
float b=sc.nextFloat();
System.out.println("enter two numbers to subtract:");
float sa=sc.nextFloat();
float sb=sc.nextFloat();
System.out.println("enter two numbers to multiply:");
float ma=sc.nextFloat();
float mb=sc.nextFloat();
System.out.println("enter two numbers to divide:");
float da=sc.nextFloat();
float db=sc.nextFloat();
add4 c=new add4();
sub4 s=new sub4();
mul4 m=new mul4();
div4 d=new div4();
c.add1(a,b);
s.sub1(sa,sb);
m.mul1(ma,mb);
d.div1(da,db);
}
}