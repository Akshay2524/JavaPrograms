import java.util.ArrayList;
public class TrimArrayList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>(20);
list.add("Apple");
list.add("Banana");
list.add("Cherry");
System.out.println("Size before trim: "+list.size());
list.trimToSize();
System.out.println("Size after trim: "+list.size());
for(String item:list)
{
System.out.println(item);
}
}
}
