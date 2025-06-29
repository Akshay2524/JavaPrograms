import java.util.ArrayList;
public class RetrieveElement
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
int index=2;
String element=list.get(index);
System.out.println("Element at index "+index+": "+element);
}
}
