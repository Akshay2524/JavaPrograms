import java.util.TreeSet;
public class FirstLastElement
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
TreeSet<String> set=new TreeSet<String>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");
set.add("Date");
set.add("Elderberry");
String first=set.first();
String last=set.last();
System.out.println("First element: "+first);
System.out.println("Last element: "+last);
}
}
