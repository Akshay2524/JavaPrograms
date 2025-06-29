public class MathOperation
{
void multiply(int a,int b)
{
int result=a*b;
System.out.println("Multiplication of two integers: "+result);
}
void multiply(float a,float b,float c)
{
float result=a*b*c;
System.out.println("Multiplication of three floats: "+result);
}
void multiply(int[] arr)
{
int result=1;
for(int i=0;i<arr.length;i++)
{
result=result*arr[i];
}
System.out.println("Multiplication of array elements: "+result);
}
void multiply(double a,int b)
{
double result=a*b;
System.out.println("Multiplication of one double and one integer: "+result);
}
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
MathOperation m=new MathOperation();
m.multiply(5,4);
m.multiply(1.2f,3.4f,2.0f);
int[] arr={2,3,4};
m.multiply(arr);
m.multiply(5.5,3);
}
}
