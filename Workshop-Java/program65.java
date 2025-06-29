Import java.util.Scanner;
class Lucas
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int a=2, b=1,c,sum=a+b;
System.out.printf("Lucas series: "+a+" "+b+" ");
for(int i=3;i<=10;i++)
{
c=a+b;
System.out.printf(" "+c);
sum=sum+c;
a=b;
b=c;
}
System.out.println(" ");
System.out.println("Sum of first 10 terms = "+sum);
}
};
