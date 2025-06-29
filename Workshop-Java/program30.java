import java.util.LinkedList;
import java.util.Iterator;
public class ReverseIterate
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
Iterator<String> itr=list.descendingIterator();
System.out.println("LinkedList in reverse order:");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}

