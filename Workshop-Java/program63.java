import java.util.Scanner;
class check 
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int n,i,flag=0;
Scanner s=new Scanner(System.in);
System.out.printf("Enter a number : ");
n=s.nextInt();
for(i=2;i<=n/2;i++) 
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0) System.out.println(" is a prime number.");
else System.out.println("is not a prime number.");
}
};
