import java.util.Scanner;
class elligible 
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 087CS231065"); 
int age,gender;
Scanner s=new Scanner(System.in);
System.out.print("Enter age : ");
age=s.nextInt();
System.out.print("Enter gender (1 for male,0 for female) : ");
gender=s.nextInt();
if(gender==1) 
{
if(age>=21) System.out.println("Eligible for marriage (Male)");
else System.out.println("Not eligible for marriage (Male)");
} 
else if (gender == 0) 
{if (age >= 18) System.out.println("Eligible for marriage,Female");
else System.out.println("Not eligible for marriage (Female)");
} 
}
