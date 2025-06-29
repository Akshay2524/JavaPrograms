import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Banana");
list.add("Apple");
list.add("Date");
list.add("Cherry");
list.add("Elderberry");
Collections.sort(list);
System.out.println("Sorted ArrayList:");
for(String item:list)
{
System.out.println(item);
}
}
}
