import java.util.Scanner;
class prime
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int start,end;
Scanner s=new Scanner(System.in);
System.out.printf("Enter starting number : ");
start=s.nextInt();
System.out.printf("Enter ending number : ");
end=s.nextInt();
System.out.println("Prime numbers : ");
for (int num=start;num<=end;num++) 
{
boolean isPrime=true;
if(num<=1) isPrime=false;
else
{
for (int i=2;i<=num/2;i++) 
{
if(num%i==0)
{
isPrime=false;
break;
}
}
}
if(isPrime) System.out.print(num+" ");
}
}
};
