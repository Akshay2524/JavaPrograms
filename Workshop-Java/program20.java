import java.util.ArrayList;
public class CloneArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list1=new ArrayList<String>();
list1.add("Apple");
list1.add("Banana");
list1.add("Cherry");
ArrayList<String> list2=(ArrayList<String>)list1.clone();
System.out.println("Cloned ArrayList:");
for(String item:list2)
{
System.out.println(item);
}
}
}
