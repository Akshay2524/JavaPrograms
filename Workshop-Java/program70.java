import java.util.Scanner;
class Array
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");   
int[] arr=new int[17];
int sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter 17 elements : ");
for (int i=0;i<=17;i++)
{arr[i]=s.nextInt();
sum=sum+arr[i];
}
System.out.println("Sum = "+sum);
}
};
