import java.util.ArrayList;
import java.util.Collections;
public class SwapElements
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
System.out.println("Before swapping:");
for(String item:list)
{
System.out.println(item);
}
Collections.swap(list,1,3);
System.out.println("After swapping elements at index 1 and 3:");
for(String item:list)
{
System.out.println(item);
}
}
}
