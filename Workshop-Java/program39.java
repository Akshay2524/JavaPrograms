import java.util.HashSet;
public class CloneHashSet
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> set1=new HashSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
HashSet<String> set2=(HashSet<String>)set1.clone();
System.out.println("Cloned HashSet elements:");
for(String item:set2)
{
System.out.println(item);
}
}
}
