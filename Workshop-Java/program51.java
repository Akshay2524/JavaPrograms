import java.util.Scanner;
public class ExpressionResults
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
Scanner sc=new Scanner(System.in);
// a. y = x^2 + 3x - 7
System.out.println("Enter value for x (expression a):");
int x1=sc.nextInt();
int z1=x1*x1 + 3*x1 - 7;
System.out.println("Z (expression a) : "+z1);
// b. y = x++ + ++x
System.out.println("Enter value for x (expression b):");
int x2=sc.nextInt();
int y2=x2++ + ++x2;
System.out.println("x (expression b) : "+x2);
System.out.println("y (expression b) : "+y2);
// c. z = x++ - --y - --x + x++
System.out.println("Enter value for x (expression c):");
int x3=sc.nextInt();
System.out.println("Enter value for y (expression c):");
int y3=sc.nextInt();
int z3=x3++ - --y3 - --x3 + x3++;
System.out.println("x (expression c) : "+x3);
System.out.println("y (expression c) : "+y3);
System.out.println("z (expression c) : "+z3);
// d. z = x && y || !(x || y)
System.out.println("Enter boolean value for x (true/false) (expression d):");
boolean xb=sc.nextBoolean();
System.out.println("Enter boolean value for y (true/false) (expression d):");
boolean yb=sc.nextBoolean();
boolean zb=xb && yb || !(xb || yb);
System.out.println("Z (expression d) : "+zb);
}
}
