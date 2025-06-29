import java.util.ArrayList;
public class RemoveThirdElement
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
list.remove(2);
System.out.println("ArrayList after removing third element:");
for(String item:list)
{
System.out.println(item);
}
}
}
