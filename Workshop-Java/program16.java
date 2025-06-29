import java.util.ArrayList;
import java.util.List;
public class ExtractPortion
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
List<String> subList=list.subList(1,4);
System.out.println("Extracted portion of ArrayList:");
for(String item:subList)
{
System.out.println(item);
}
}
}
