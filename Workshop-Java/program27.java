import java.util.LinkedList;
public class AppendElement
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
LinkedList<String> list=new LinkedList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.addLast("Date");
System.out.println("LinkedList after appending an element:");
for(String item:list)
{
System.out.println(item);
}
}
}
