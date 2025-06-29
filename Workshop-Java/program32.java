import java.util.LinkedList;
public class InsertFirstLast
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
LinkedList<String> list=new LinkedList<String>();
list.add("Banana");
list.add("Cherry");
list.addFirst("Apple");
list.addLast("Date");
System.out.println("LinkedList after inserting at first and last positions:");
for(String item:list)
{
System.out.println(item);
}
}
}
