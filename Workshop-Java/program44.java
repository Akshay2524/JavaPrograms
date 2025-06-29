import java.util.HashSet;
public class RetainCommonElements
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> set1=new HashSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
HashSet<String> set2=new HashSet<String>();
set2.add("Banana");
set2.add("Cherry");
set2.add("Date");
set1.retainAll(set2);
System.out.println("Common elements:");
for(String item:set1)
{
System.out.println(item);
}
}
}
