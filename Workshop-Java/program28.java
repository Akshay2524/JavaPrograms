import java.util.LinkedList;
public class IterateLinkedList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
LinkedList<String> list=new LinkedList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
System.out.println("Iterating through the LinkedList:");
for(String item:list)
{
System.out.println(item);
}
}
}
