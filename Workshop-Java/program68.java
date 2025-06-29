import java.util.Scanner;
class Sort
{
public static void main(String args[]) 
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
int[] arr={23, 12, 45, 67, 89, 1, 34, 90, 2, 56};
int temp;
System.out.println("Original array: ");
for(int i=0;i<10;i++)
{
System.out.printf(" "+arr[i]);
}
for(int i=0;i<9;i++)
{
for(int j=i+1;j<10;j++) 
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Array in descending order:");
for (int i=0;i<10;i++)
{
System.out.printf(" "+arr[i]);
}
}
};
