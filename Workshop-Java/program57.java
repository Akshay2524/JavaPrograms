import java.util.Scanner;
class Temperaturer
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
double fahrenheit,celsius;
Scanner s=new Scanner(System.in);
System.out.printf("Enter temperature in Fahrenheit : ");
fahrenheit=s.nextDouble();
celsius=(5*(fahrenheit-32))/9;
System.out.println("Temperature in Celsius: " + celsius);
}
};
