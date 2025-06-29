import java.util.TreeSet;
import java.util.NavigableSet;
public class ReverseTreeSet
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
NavigableSet<String> reverseSet=set.descendingSet();
System.out.println("TreeSet elements in reverse order:");
for(String item:reverseSet)
{
System.out.println(item);
}
}
}
