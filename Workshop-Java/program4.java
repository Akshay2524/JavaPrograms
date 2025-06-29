public class PrimeInArray
{
boolean isPrime(int n)
{
if(n<=1)
return false;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
return false;
}
return true;
}
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”);  
System.out.println("Enrollment Number : 0873CS231065");
int[] arr={3,4,5,6,7,8,9,11,13,15};
PrimeInArray obj=new PrimeInArray();
System.out.println("Prime numbers in the array:");
for(int i=0;i<arr.length;i++)
{
if(obj.isPrime(arr[i]))
System.out.println(arr[i]);
}
}
}
