
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
Collections.reverse(list);
System.out.println("Reversed ArrayList:");
for(String item:list)
{
System.out.println(item);
}
}
}
