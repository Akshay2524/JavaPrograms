import java.util.ArrayList;
public class EmptyArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
System.out.println("ArrayList before emptying:");
for(String item:list)
{
System.out.println(item);
}
list.clear();
System.out.println("ArrayList after emptying:");
for(String item:list)
{
System.out.println(item);
}
}
}
