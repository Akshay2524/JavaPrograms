import java.util.Scanner;
class Reverse 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int number,reverse=0;
Scanner s=new Scanner(System.in);
System.out.printf("Enter a number : ");
number=s.nextInt();
while(number!=0)
{
int digit=number%10;
reverse=reverse*10+digit;
number=number/10;
}
System.out.println("Reversed number : "+reverse);
}
};
