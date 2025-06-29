import java.util.ArrayList;
public class JoinArrayLists
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list1=new ArrayList<String>();
list1.add("Apple");
list1.add("Banana");
ArrayList<String> list2=new ArrayList<String>();
list2.add("Cherry");
list2.add("Date");
list1.addAll(list2);
System.out.println("Joined ArrayList:");
for(String item:list1)
{
System.out.println(item);
}
}
}
