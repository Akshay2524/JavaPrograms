import java.util.Scanner;
class Array
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065"); 
int[] arr=new int[10];
int sum=0;
float average;
Scanner s=new Scanner(System.in);
System.out.println("Enter 10 elements : ");
for (int i=0;i<10;i++)
{
arr[i]=s.nextInt();
sum=sum+arr[i];
}
average=sum/10;
System.out.println("Sum = "+sum);
System.out.println("Average = "+average);
}
};
