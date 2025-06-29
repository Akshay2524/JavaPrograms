import java.util.Scanner;
class three 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.print("Enter first number : ");
a=s.nextInt();
System.out.print("Enter second number : ");
b=s.nextInt();
System.out.print("Enter third number : ");
c=s.nextInt();
if(a>=b && a>=c) System.out.printf("Greatest number is : " +a);
else if(b>=a && b>=c) System.out.printf("Greatest number is : "+b);
else System.out.println("Greatest number is : "+c);
}
};
