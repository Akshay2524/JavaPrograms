import java.util.Scanner;
class Series 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int n,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter value of n : ");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+(i*i);
}
System.out.println("Sum = "+sum);
}
};
