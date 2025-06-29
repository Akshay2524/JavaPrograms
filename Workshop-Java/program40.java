import java.util.HashSet;
public class HashSetToArray
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> set=new HashSet<String>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");
String[] array=new String[set.size()];
set.toArray(array);
System.out.println("Array elements from HashSet:");
for(String item:array)
{
System.out.println(item);
}
}
}
