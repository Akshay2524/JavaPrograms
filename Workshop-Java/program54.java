import java.util.Scanner;
class marks
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");   
int phy,chem,maths,eng,painting;
double percentage;
Scanner s=new Scanner(System.in);
System.out.printf("Enter marks of physics : ");
phy=s.nextInt();
System.out.printf("Enter marks of chemistry : ");
chem=s.nextInt();
System.out.printf("Enter marks of maths : ");
maths=s.nextInt();
System.out.printf("Enter marks of english : ");
eng=s.nextInt();    
System.out.printf("Enter marks of painting : ");
painting=s.nextInt();
percentage=((phy+chem+maths+eng+painting)/5);
System.out.println("Percentage : "+percentage+"%");
}
};
