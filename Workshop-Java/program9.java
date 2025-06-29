import java.util.ArrayList;
public class UpdateElement
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
int index=1;
String newElement="Blueberry";
list.set(index,newElement);
System.out.println("ArrayList after update:");
for(String item:list)
{
System.out.println(item);
}
}
