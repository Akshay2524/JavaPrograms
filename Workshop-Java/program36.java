import java.util.TreeSet;
public class CloneTreeSet
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
TreeSet<String> set1=new TreeSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
TreeSet<String> set2=(TreeSet<String>)set1.clone();
System.out.println("Cloned TreeSet elements:");
for(String item:set2)
{
System.out.println(item);
}
}
}
