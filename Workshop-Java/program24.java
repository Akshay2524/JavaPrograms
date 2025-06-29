import java.util.ArrayList;
public class IncreaseArrayListSize
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.ensureCapacity(10);
list.add("Date");
list.add("Elderberry");
System.out.println("ArrayList after increasing capacity and adding elements:");
for(String item:list)
{
System.out.println(item);
}
}
}
