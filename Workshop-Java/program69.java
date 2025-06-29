import java.util.Scanner;
class matrix 
{
public static void main(String args[])
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
Scanner s=new Scanner(System.in);
int[][] a=new int[3][3];
int[][] b=new int[3][3];
int[][] c=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++) a[i][j]=s.nextInt();
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++) b[i][j]=s.nextInt();
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=0;
for(int k=0;k<3;k++) c[i][j]+=a[i][k]*b[k][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++) System.out.print(" "+c[i][j]);
}
}
};
