public class CheckEmpty
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
if(list.isEmpty())
System.out.println("The ArrayList is empty.");
else
System.out.println("The ArrayList is not empty.");
list.add("Apple");
if(list.isEmpty())
System.out.println("The ArrayList is empty.");
else
System.out.println("The ArrayList is not empty.");
}
}
