import java.util.TreeSet;
public class AddAllTreeSet
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
TreeSet<String> set1=new TreeSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
TreeSet<String> set2=new TreeSet<String>();
set2.add("Date");
set2.add("Elderberry");
set2.addAll(set1);
System.out.println("Elements of second TreeSet after adding all from first:");
for(String item:set2)
{
System.out.println(item);
}
}
}
