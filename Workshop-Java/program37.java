import java.util.TreeSet;
public class CountElements
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
int count=set.size();
System.out.println("Number of elements in the TreeSet: "+count);
}
}
