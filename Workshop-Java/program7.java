import java.util.ArrayList;
public class InsertAtFirstPosition
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
list.add(0,"Apple");
System.out.println("ArrayList after insertion at first position:");
for(String item:list)
{
System.out.println(item);
}
}
}
