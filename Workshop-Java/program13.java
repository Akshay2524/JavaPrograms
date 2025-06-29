import java.util.ArrayList;
public class CopyArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list1=new ArrayList<String>();
list1.add("Apple");
list1.add("Banana");
list1.add("Cherry");
ArrayList<String> list2=new ArrayList<String>(list1);
System.out.println("Elements of copied ArrayList:");
for(String item:list2)
{
System.out.println(item);
}
}
}
