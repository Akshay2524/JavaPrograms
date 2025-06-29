import java.util.Scanner;
class days
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int totalDays,years,months,days;
Scanner s=new Scanner(System.in);
System.out.printf("Enter total number of days : ");
totalDays=s.nextInt();
years=totalDays/365;
totalDays=totalDays%365;
months=totalDays/30;
days=totalDays%30;
System.out.println("Years: "+years);
System.out.println("Months: "+months);
System.out.println("Days: "+days);
}
};
