import java.util.HashSet;
import java.util.TreeSet;
public class HashSetToTreeSet
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> hashSet=new HashSet<String>();
hashSet.add("Banana");
hashSet.add("Apple");
hashSet.add("Cherry");
TreeSet<String> treeSet=new TreeSet<String>(hashSet);
System.out.println("Elements of TreeSet (sorted):");
for(String item:treeSet)
{
System.out.println(item);
}
}
}
