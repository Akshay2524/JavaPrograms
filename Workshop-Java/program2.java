import java.util.Scanner;
public class MathOperation
{
int x;
int y;
double r;
void init()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter value of X: ");
x=sc.nextInt();
System.out.print("Enter value of Y: ");
y=sc.nextInt();
}
void add()
{
r=x+y;
}
void multiply()
{
r=x*y;
}
void power()
{
r=Math.pow(x,y);
}
void display()
{
System.out.println("Result: "+r);
}
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”);
System.out.println("Enrollment Number : 0873CS231065");

MathOperation mo=new MathOperation();
mo.init();
mo.add();
mo.display();
mo.multiply();
mo.display();
mo.power();
mo.display();
}
}
