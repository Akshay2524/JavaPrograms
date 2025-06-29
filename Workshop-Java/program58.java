import java.util.Scanner;
class Swap 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int a,b;
Scanner s=new Scanner(System.in);
System.out.print("Enter first number : ");
a=s.nextInt();
System.out.print("Enter second number : ");
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping : ");
System.out.println("a= "+a);
System.out.println("b= "+b);
}
};
