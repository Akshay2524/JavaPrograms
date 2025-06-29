import java.util.Scanner;
class marks
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int principle,time,rate,interest;
Scanner s=new Scanner(System.in);
System.out.printf("Enter principle amount : ");
principle=s.nextInt();
System.out.printf("Enter rate of interest : ");
rate=s.nextInt();
System.out.printf("Enter time(in years) : ");
time=s.nextInt();
interest=((principle*rate*time)/100);
System.out.println("Simple interest : "+interest);
}
};
