import java.util.Scanner;
public class GrossSalary
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary:");
double basic=sc.nextDouble();
double hra,da,gs;
if(basic<1500)
{
hra=0.10*basic;
da=0.90*basic;
}
else
{
hra=500;
da=0.98*basic;
}
gs=basic+hra+da;
System.out.println("Gross Salary : "+gs);
}
}
