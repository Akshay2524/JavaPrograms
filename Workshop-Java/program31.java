import java.util.LinkedList;
public class InsertAtPosition
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
LinkedList<String> list=new LinkedList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
int position=1;
String element="Date";
list.add(position,element);
System.out.println("LinkedList after insertion:");
for(String item:list)
{
System.out.println(item);
}
}
}
