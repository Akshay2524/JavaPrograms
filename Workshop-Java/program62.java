import java.util.Scanner;
class Table 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int number;
Scanner s=new Scanner(System.in);
System.out.printf("Enter a number : ");
number=s.nextInt();
for(int i=1;i<=10;i++) 
{
System.out.println((number*i));
}
}
};
