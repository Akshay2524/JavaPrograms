import java.util.ArrayList;
public class SearchElement
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
String searchElement="Cherry";
if(list.contains(searchElement))
System.out.println(searchElement+" is found in the ArrayList.");
else
System.out.println(searchElement+" is not found in the ArrayList.");
}
}
